package com.aluracursos.currencyconverter.models;

import java.util.Scanner;

public class Conversion {
    public String fromCurrency;
    public String toCurrency;
    public Double amountToConvert;
    public Double amountConverted;
    public String dateAndHour;

    public Conversion(String fromCurrency, String toCurrency, Double amountToConvert){
        this.fromCurrency=fromCurrency;
        this.toCurrency=toCurrency;
        this.amountToConvert=amountToConvert;
    }

    public static Conversion reader (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite el código de la moneda de origen:");
        String fromCurrency= reader.next();
        System.out.println("Digite el código de la moneda destino:");
        String toCurrency= reader.next();
        System.out.println("Digite la cantidad a convertir:");
        String amount= reader.next();

        return new Conversion(fromCurrency,toCurrency,Double.parseDouble(amount));
    }

    @Override
    public String toString() {
        return "Conversion made at: " + dateAndHour +
                ", from: " + fromCurrency +
                " to: " + toCurrency +
                " , "+ amountToConvert +" " + fromCurrency+ " equals to "+
                amountConverted + " " + toCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public Double getAmountToConvert() {
        return amountToConvert;
    }

    public void setAmountConverted(Double amountConverted) {
        this.amountConverted = amountConverted;
    }

    public void setDateAndHour(String dateAndHour) {
        this.dateAndHour = dateAndHour;
    }
}
