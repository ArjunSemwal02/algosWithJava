package com.dataStructuresAndAlgorithms.bitManipulation;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(0));
//        System.out.println(decToBinRec(217));
//        System.out.println(printString());
    }

    public static String decimalToBinary(int n){
        if(n == 0) return "0";
        String s = "";

        while(n >= 1){
            s = (n % 2) + s;
            n /= 2;
        }

        return s;
    }

    private static String decToBinRec(int n){

        if(n == 1) return "1";

        return decToBinRec(n / 2) + n % 2;

    }

    public static String printString(){

        String s = "";

        s = s + "a";
        s = s + 3;
        s = s + 4;
        s = s + "b";

        return s;
    }

}
