package com.company;

public class PrintMean {
    public static void main(String[] args) {

        //testing testing dadwdad

        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, +1, +3, +3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, +2, +3, +4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, +3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, +24, +2));

    } public static String meanCalc(double a, double b, double c, double d){

            double mean = (a + b + c + d) / 4;

            String meanString = String.valueOf(mean);

            return meanString;

        }

}

