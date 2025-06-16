package com.aluracursos.screenmatch.modelos;

public class Moneda {
    String tipo;
    Double valor;

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

    @Override
    public String toString()
    {
        return tipo + ": "+ valor;
    }
}
