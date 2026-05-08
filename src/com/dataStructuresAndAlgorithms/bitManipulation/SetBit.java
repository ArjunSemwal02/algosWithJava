package com.dataStructuresAndAlgorithms.bitManipulation;

public class SetBit {

    public static void main(String[] args) {
        System.out.println(checkSetBit(27, 3));
    }

    private static boolean checkSetBit(int n, int k){

        int bin = n >> (k - 1);
        return (bin & 1) == 1;

    }
}
