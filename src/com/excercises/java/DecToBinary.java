package com.excercises.java;

import java.util.Scanner;

public class DecToBinary {


    public void decToBin(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the decimal value:");
        int i = scanner.nextInt();
        String binaryValue = Integer.toBinaryString(i);
        String binaryValue1 = Integer.toOctalString(i);
        String binaryValue2 = Integer.toHexString(i);
        System.out.println("After conversion of decimal to binary value:"+binaryValue);
        System.out.println("After conversion of decimal to octal value:"+binaryValue1);
        System.out.println("After conversion of decimal to hexa decimal value:"+binaryValue2);
    }

    public static void main(String[] args) {

        DecToBinary decToBinary = new DecToBinary();
        decToBinary.decToBin();
    }
}
