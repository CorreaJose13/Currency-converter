package com.aluracursos.currencyconverter.currency;

import com.aluracursos.currencyconverter.api.ConversionController;
import com.aluracursos.currencyconverter.api.CurrencyService;

import java.util.Map;

public class CurrencyConverterAPI {
    public static void main(String[] args) {
        CurrencyService query = new CurrencyService();
        ConversionController converter = null;
        try {
            Map<String, Double> currency = query.getCurrency("USD");
            converter = new ConversionController(currency);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        double amountConverted;
        if (converter != null) {
            amountConverted = converter.convert(1000, "COP", "CLP");
            System.out.println("1000 COP son aproximadamente " + amountConverted + " CLP.");
        }
    }

}
