package pkg3_condicionales_dobles_java;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner Leer = new Scanner (System.in);
            
            int co1, co2, co3, condition, r1, r2;
            System.out.println("Ingrese el primer cociente de su cuadrática");
            co1 = Leer.nextInt();
            System.out.println("Ingrese el segundo cociente de su cuadrática");
            co2 = Leer.nextInt();
            System.out.println("Ingrese el tercer cociente de su cuadrática");
            co3 = Leer.nextInt();
            if ((co2*co2)-(4*(co1)*(co2)) >= 0) {
                System.out.println("");
            } else {
                System.out.println("Sus raices son imaginarias");
            }
    }
    
}
