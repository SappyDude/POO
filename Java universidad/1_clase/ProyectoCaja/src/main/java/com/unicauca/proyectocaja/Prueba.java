package com.unicauca.proyectocaja;

public class Prueba {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // creando un objeto de tipo caja usando el cosntructor de tres parámetros
        Caja caja1 = new Caja(3, 2, 6);
        System.out.println(caja1);// la referencia en memoria
        
        // usando el objeto caja1 puedo acceder a todas las propiedades de la clase Caja
        System.out.println("el volumen de la caja es:"+caja1.volumen_caja());
        
        //caja1.propiedades_caja();
        Caja caja2 = new Caja(5, 5, 4);
        System.out.println(caja2);// la referencia en memoria 
        
        caja2.setAncho(600); 
        System.out.println(" usando el método getAncho:  " + caja2.getAncho());
        
    }

}
