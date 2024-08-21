package pkg1_proyecto;
/*@author SappyDude*/
public class Main {
    public static void main(String[] args){
        //se crea un objeto
        Proyecto proyecto1 = new Proyecto(2,5);
        //se imprime lo que se desea ejecutar
        System.out.println("La suma de los dos números es: " + proyecto1.sumar());
        System.out.println("La resta de los dos números es: " + proyecto1.restar());
        System.out.println("La multiplicación de los dos números es: " + proyecto1.multiplicar());
        System.out.println("La división de los dos números es: " + proyecto1.dividir());
    }   
}
