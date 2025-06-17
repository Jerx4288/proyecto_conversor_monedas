package com.aluracursos.screenmatch.modelos;

public class Moneda {
    private String tipo;
    private Double valor;
    private Double resultado;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString()
    {
        return tipo + ": "+ valor + " -> Resultado: "+ String.format("%.3f",resultado);
    }
}
