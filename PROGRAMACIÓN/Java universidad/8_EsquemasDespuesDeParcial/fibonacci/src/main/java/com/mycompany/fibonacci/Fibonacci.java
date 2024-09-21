package com.mycompany.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        //

        int fibo = 0;

        System.out.println("Ingrese la cantidad que desea saber con la serie de fibonacci");
        int amount = escanear.nextInt();
        int sumfib[];

        sumfib = new int[amount];
        sumfib[0] = 0;
        sumfib[1] = 1;
        System.out.println(sumfib[0]);
        System.out.println(sumfib[1]);

        for (int i = 2; i < amount; i++) {
            sumfib[i] = sumfib[i - 1] + sumfib[i - 2];

            System.out.println(sumfib[i]);

        }

    }
}
