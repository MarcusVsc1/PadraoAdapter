package model;

import interfaces.ITemperatura;

public class TemperaturaAdapter extends TemperaturaFarenheit {

    private ITemperatura temperatura;

    public TemperaturaAdapter(ITemperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Double recuperarTemperatura(){
        Double valor = this.getValorTemperatura();
        if(temperatura.getSimbolo().equals("C")) {
            return ((valor - 32) * 5/9);
        }

        if(temperatura.getSimbolo().equals("K")) {
            return (valor - 32) * 5/9 + 273.15;
        }

        return null;
    }

    public void salvarTemperatura() throws IllegalArgumentException {
        Double valor = temperatura.getValorTemperatura();
        if(temperatura.getSimbolo().equals("C")) {
            this.setValorTemperatura((valor * 9/5) + 32);
            return;
        }

        if(temperatura.getSimbolo().equals("K")) {
            this.setValorTemperatura((valor - 273.15) * 9/5 + 32);
            return;
        }

        throw new IllegalArgumentException("Medida não suportada de temperatura");
    }
}
