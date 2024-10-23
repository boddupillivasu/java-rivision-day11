package com.excercises.java;

import java.util.Scanner;

public class BinaryToOther {

    public void Conversion(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the binary value:");
        String binary = scanner.nextLine();

        //conversion

        int decimal = Integer.parseInt(binary,2);
        System.out.println("the binary to decimal value:"+decimal);


        String octal =Integer.toOctalString(decimal);
        System.out.println("the binary to octal value:"+octal);

        String hexa =Integer.toHexString(decimal).toUpperCase();
        System.out.println("the binary to hexa value:"+hexa);

    }

    public static void main(String[] args) {

        BinaryToOther binary;
        binary = new BinaryToOther();
        binary.Conversion();

        binary.octal();
        binary.hexaDeciamal();
    }

    public void octal(){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the octal value:");
        String octal = scanner1.nextLine();

        //octal to binary

    int dec = Integer.parseInt(octal,8);
        System.out.println("the octal to dec :"+dec);

        String bin = Integer.toBinaryString(dec);
        System.out.println("the octal to bin:"+bin);
        //octal to hexa

        String hexa = Integer.toHexString(dec).toUpperCase();
        System.out.println("the octal to hexa:"+hexa);
     }

     public void hexaDeciamal(){

        Scanner scanner = new Scanner(System.in);
         System.out.println("enter hexa value:");
         String hexa = scanner.nextLine();

         //hexa to dec
         int dec = Integer.parseInt(hexa,16);
         System.out.println("the hexa to dec:"+dec);

         //hexa to bin
         String bin = Integer.toBinaryString(dec);
         System.out.println("the hexa to bin:"+bin);

         //hexa to octal
         String octal = Integer.toOctalString(dec);
         System.out.println("the hexa to octal:"+octal);
     }
}
