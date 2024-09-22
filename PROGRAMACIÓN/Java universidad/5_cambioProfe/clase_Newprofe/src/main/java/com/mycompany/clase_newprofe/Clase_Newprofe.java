

package com.mycompany.clase_newprofe;
import java.util.Scanner;

public class Clase_Newprofe {

    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 4;
        
        for (int i = a; i <= b; i++) {   
                System.out.println("TABLA DEL " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println("La tabla del " + i +" entre "+ j + " es igual a: " +(i*j));
                }
            }    
    }
}
