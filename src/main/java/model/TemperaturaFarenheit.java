package model;

public class TemperaturaFarenheit {

    private final String simbolo = "F";
    private Double valor;

    public String getTemperaturaCompleta() {
        return String.format("%.2f%s", this.valor, this.simbolo);
    }

    public Double getValorTemperatura() {
        return this.valor;
    }
    
    public String getSimbolo() {
        return this.simbolo;
    }

    public void setValorTemperatura(Double valor) {
        this.valor = valor;
    }

}
