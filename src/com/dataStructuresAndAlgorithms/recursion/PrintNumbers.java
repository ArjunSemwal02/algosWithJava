package com.dataStructuresAndAlgorithms.recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        printOneToN(6);
//        printNToOne(6);
    }

    private static void printOneToN(int n){

        if(n == 0) return;

        printOneToN( n - 1 );
        System.out.println(n);
    }

    private static void printNToOne(int n){
        if(n == 0) return;

        System.out.println(n);

        printNToOne(n - 1);
    }
}
