package com.dataStructuresAndAlgorithms.bitManipulation;

public class BinaryToDecimal {

    public static void main(String[] args) {
//        System.out.println(binaryToDecimal("1010"));
        System.out.println(binaryToDecimal("0"));
    }

    private static int binaryToDecimal(String bin){

        int res = 0;
        int powOf2 = 1;

        res += (bin.charAt(bin.length() - 1) - '0') * 1;
//        res += (bin.charAt(bin.length() - 1) - '0') * 2;

        for(int i = bin.length() - 2; i >= 0; i--){
            powOf2 *= 2;
            res += (bin.charAt(i) - '0') * powOf2;
        }

        return res;
    }
}
