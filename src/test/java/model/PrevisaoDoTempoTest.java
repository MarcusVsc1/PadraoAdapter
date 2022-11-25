package model;

import interfaces.ITemperatura;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrevisaoDoTempoTest {

    @Test
    public void temperaturaKelvinParaFarenheitTest(){
        PrevisaoDoTempo previsaoDoTempo = new PrevisaoDoTempo();

        ITemperatura temperaturaKelvin = new Temperatura();
        temperaturaKelvin.setSimbolo("K");
        temperaturaKelvin.setValorTemperatura(-273D);

        previsaoDoTempo.setTemperatura(temperaturaKelvin);

        assertEquals("Previsão atual: -951,07F", previsaoDoTempo.mostrarPrevisao());
    }

    @Test
    public void temperaturaCelsiusParaFahrenheitTest(){
        PrevisaoDoTempo previsaoDoTempo = new PrevisaoDoTempo();

        ITemperatura temperaturaCelsius = new Temperatura();
        temperaturaCelsius.setSimbolo("C");
        temperaturaCelsius.setValorTemperatura(0D);

        previsaoDoTempo.setTemperatura(temperaturaCelsius);

        assertEquals("Previsão atual: 0,00C", previsaoDoTempo.getTemperaturaCompleta());
    }

    @Test
    public void medidaInexistenteTest(){
        try {
            PrevisaoDoTempo previsaoDoTempo = new PrevisaoDoTempo();

            ITemperatura temperaturaInexistente = new Temperatura();
            temperaturaInexistente.setSimbolo("X");
            temperaturaInexistente.setValorTemperatura(0D);

            previsaoDoTempo.setTemperatura(temperaturaInexistente);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Medida não suportada de temperatura", e.getMessage());
        }
    }

}
