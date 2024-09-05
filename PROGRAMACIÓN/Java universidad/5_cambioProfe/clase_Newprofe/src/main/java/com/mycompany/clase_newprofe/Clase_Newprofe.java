

package com.mycompany.clase_newprofe;
import java.util.Scanner;

public class Clase_Newprofe {

    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 10;
        
        for (int i = 1; i < b; i++, a+=1) {   
                System.out.println("TABLA DEL " + a);
                for (int j = 1; j <= 10; j++) {
                    System.out.println("La tabla del " + a +" entre "+ j + " es igual a: " +(a*j));
                }
            }    
    }
}
