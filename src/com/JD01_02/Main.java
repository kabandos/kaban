package com.JD01_02;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String line = Util.getOneLine();
        String[] strMas = line.split(" ");
        int[] intMas = new int[strMas.length];
        for(int j = 0; j < strMas.length; j++){
            intMas[j] = Integer.parseInt(strMas[j]);
        }
        int max = TaskA.getMax(intMas);
        System.out.println("Max : " + max);
        int min = TaskA.getMin (intMas);
        System.out.println("Min : " + min);
        int arifm = TaskA.getArifm(intMas);
        System.out.println("Srednee arifmeticheskoe ravno "+arifm);
        int povtor = TaskA.getPovtor(intMas);
        System.out.println("Povtori : "+povtor);


    }


}
