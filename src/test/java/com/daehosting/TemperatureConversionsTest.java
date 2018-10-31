package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32),result);

        BigDecimal result1 = service.fahrenheitToCelsius(BigDecimal.valueOf(5));
        assertEquals(BigDecimal.valueOf(-15),result1);

        BigDecimal result2 = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(1.41), result2);

        BigDecimal result3 = service.windChillInFahrenheit(BigDecimal.valueOf(22), BigDecimal.valueOf(33));
        assertEquals(BigDecimal.valueOf(-26.08331989), result3);
    }

    @Test
    void getTemperatureConversionsSoap121() {

    }
}