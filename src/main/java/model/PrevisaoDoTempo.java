package model;

import interfaces.ITemperatura;

public class PrevisaoDoTempo {

    private ITemperatura temperatura;
    private TemperaturaAdapter temperaturaAdapter;

    public PrevisaoDoTempo() {
        this.temperatura = new Temperatura();
        this.temperaturaAdapter = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(ITemperatura temperatura) {
        this.temperatura.setValorTemperatura(temperatura.getValorTemperatura());
        this.temperatura.setSimbolo(temperatura.getSimbolo());
        this.temperaturaAdapter.salvarTemperatura();
    }

    public String getTemperaturaCompleta () {
        return String.format("Previsão atual: %.2f%s",this.temperaturaAdapter.recuperarTemperatura(),this.temperatura.getSimbolo());
    }

    public String mostrarPrevisao() {
        return String.format("Previsão atual: %s",this.temperaturaAdapter.getTemperaturaCompleta());
    }
}
