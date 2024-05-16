package com.aluracursos.currencyconverter.api;

import java.util.Map;

public class ConversionController {
    private final Map<String, Double> exchangeRates;

    public ConversionController(Map<String, Double> exchangeRates) {
        if (exchangeRates==null){
            throw new NullPointerException("Can't initialize Conversion Controller: Exchange rate map is null");
        }
        this.exchangeRates = exchangeRates;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Currency code not found");
        }

        double amountInUSD = amount / exchangeRates.get(fromCurrency);

        return amountInUSD * exchangeRates.get(toCurrency);
    }
}
