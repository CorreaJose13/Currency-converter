package com.aluracursos.currencyconverter.processor;

import com.aluracursos.currencyconverter.api.ConversionController;
import com.aluracursos.currencyconverter.models.Conversion;
import com.aluracursos.currencyconverter.util.DateFormat;
import com.aluracursos.currencyconverter.util.Strings;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Processor {
    Scanner reader = new Scanner(System.in);
    public void process(ConversionController converter){
        if (converter == null) {
            throw new NullPointerException("Can't do process, converter param is null");
        }

        ArrayList<Conversion> conversions = new ArrayList<>();

        System.out.println(Strings.menuString());

        boolean retry=true;
        while (retry){
            System.out.println(Strings.optionString());
            try {
                int option= reader.nextInt();
                switch (option){
                    case 0:
                        retry=false;
                        break;
                    case 1:
                        Conversion conversion=createConversion(converter);
                        System.out.println(conversion);
                        conversions.add(conversion);
                        break;
                    case 2:
                        if (!conversions.isEmpty()){
                            System.out.println(conversions);
                        }
                        System.out.println("No has realizado ninguna conversión");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un valor válido.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Por favor, ingrese un valor válido.");
                reader.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    }

    private Conversion createConversion (ConversionController converter){
        DateFormat dateFormat= new DateFormat();
        Conversion conversion = Conversion.reader();
        Double amountConverted = converter.convert(conversion);
        conversion.setAmountConverted(amountConverted);
        conversion.setDateAndHour(dateFormat.dateAndHour());
        return conversion;
    }
}
