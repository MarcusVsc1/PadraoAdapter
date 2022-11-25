package model;

import interfaces.ITemperatura;

public class Temperatura implements ITemperatura {

    private String simbolo;
    private Double valor;

    @Override
    public String getTemperaturaCompleta() {
        return String.format("%.2f%s", this.valor, this.simbolo);
    }

    @Override
    public Double getValorTemperatura() {
        return this.valor;
    }

    @Override
    public String getSimbolo() {
        return this.simbolo;
    }

    @Override
    public void setValorTemperatura(Double valor) {
        this.valor = valor;
    }

    @Override
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

}
