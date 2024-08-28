package pkg3_condicionales_dobles_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int co1, co2, co3, condition, r1, r2;
        //Solo funciona con enteros!!!
        System.out.println("Ingrese el primer cociente de su cuadrática");
        co1 = Leer.nextInt();

        System.out.println("Ingrese el segundo cociente de su cuadrática");
        co2 = Leer.nextInt();

        System.out.println("Ingrese el tercer cociente de su cuadrática");
        co3 = Leer.nextInt();

        condition = (co2 * co2) - (4 * (co1) * (co3));

        if (condition >= 0) {
            r1 = ((-co2) + ((co2 * co2) - (condition)) ^ (1 / 2)) / (2 * co1);
            r2 = ((-co2) - ((co2 * co2) - (condition)) ^ (1 / 2)) / (2 * co1);
            System.out.println("sus raices son: " + r1 + " y " + r2);
        } else {
            System.out.println("Sus raices son imaginarias");

        }

    }

}
