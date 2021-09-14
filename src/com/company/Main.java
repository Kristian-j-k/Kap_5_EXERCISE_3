package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 3, b = 4, c = 5, n = 10;

        double aop = Math.pow(a, n);
        double bop = Math.pow(b, n);
        double cop = Math.pow(c, n);
        if (n > 2 && aop + bop == cop) {
            System.out.println("Fermat was wrong!!");
        } else {
            System.out.println("No, that did'nt work");
        }
    }
}

