package com.aluracursos.screenmatch.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conexion
{
    private final Gson gson =new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public Moneda consultarCambio(String base, String destino, double monto)
    {
        String url ="https://v6.exchangerate-api.com/v6/15b3890126b0f9b622852c90/latest/" + base.replace(" ","+");
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            //System.out.println("Json Recibido:\n" + json);

            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

            if (rates.has(destino.toUpperCase())) {
                double valor = rates.get(destino.toUpperCase()).getAsDouble();
                double resultado = valor * monto;
                Moneda moneda = new Moneda();
                moneda.setTipo(base.toUpperCase() + "/" + destino.toUpperCase());
                moneda.setValor(valor);
                moneda.setResultado(resultado);
                return moneda;
            } else {
                System.out.println("No se encontró el tipo de cambio para " + destino);
                return null;
            }
        }catch (Exception e)
        {
            System.out.println("Error en la cosnulta" + e.getMessage());
            return null;
        }
    }

}
