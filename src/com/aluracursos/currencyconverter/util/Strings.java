package com.aluracursos.currencyconverter.util;

public class Strings {
    public static String menuString (){
        return """
                ****************************************************************
                
                *** Conversor de moneda ***
                
                Aquí tienes una lista de todas las monedas soportadas por
                este programa:
                https://www.exchangerate-api.com/docs/supported-currencies
                
                O aquí tienes algunos ejemplos de las monedas disponibles:
                
                Moneda                Codigo
                
                Dólar estadounidense  [USD]
                Euro                  [EUR]
                Peso mexicano         [MXN]
                Real brasileño        [BRL]
                Peso argentino        [ARS]
                Peso colombiano       [COP]
                Peso chileno          [CLP]
                Boliviano             [BOB]
                
                """;
    }

    public static String optionString (){
        return """
                ****************************************************************
                
                Digita una de las siguientes opciones:
                
                1. Realizar nueva conversión
                2. Generar historial de conversiones
                0. Finalizar programa
                
                """;
    }
}
