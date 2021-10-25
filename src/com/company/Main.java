package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner enter = new Scanner(System.in);
	firstFunction radians=new firstFunction();
	secondFunction value = new secondFunction();
    System.out.println("Enter variant calculate: \n " +
            "1. Kubich koren 4isla \n "+ "2. Cos 4isla");
    int i =enter.nextInt();
    if(i==1) {
        System.out.println("Kub koren 4isla \n" + "Vvedite 4islo: ");
        double val = enter.nextInt();
        value.setA(val);
        System.out.println("Rezultat: ");
        value.cbrtCounter;
    }else if(i==2) {
        System.out.println("Cos: \n" + "1. Vivod gradus: \n" + "2. Vivesti promezhuto s shagom:");
        int g = enter.nextInt();
        if (g == 1) {
            System.out.println("Vvedite 4islo: ");
            int rad = enter.nextInt();
            radians.setA(rad);
            System.out.println("Rezultat: ");
            radians.cosCounter();
        } else if (g == 2) {
            System.out.println("VVedite nachalo otrezka:");
            double var1 = enter.nextDouble();
            System.out.println("vvedite conec otrerzka");
            double var2 = enter.nextDouble();
            System.out.println("VVedite shag");
            double var3 = enter.nextDouble();
            for (double x = var1; x <= var2; x += var3) {
                radians.setA(x);
                radians.cosCounter();
            }
        } else {
            System.out.println("Reboot this program and enter number 1 or 2");
        }
    }else{
        System.out.println("Reboot this program and enter number 1 or 2");

        }
    }
}


