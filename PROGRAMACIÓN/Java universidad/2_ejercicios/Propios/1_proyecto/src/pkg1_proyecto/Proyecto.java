package pkg1_proyecto;
/* @author SappyDude */
public class Proyecto {
    
// Atributos
    private int numero1, numero2;

// Constructor vacío
    public Proyecto() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

// Constructor con los dos argumentos
    public Proyecto(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Los métodos para operaciones aritméticas de los dos números
    public int sumar() {
        return this.numero1 + this.numero2;
    }

    public int restar() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        return this.numero1 * this.numero2;
    }

    public String dividir() {
        if (this.numero2 == 0) {
            return "La división por cero no está permitida";
        } else {
            return String.valueOf(this.numero1 / this.numero2);
        }
    }
    
   
    //obtención de los valores privados y su interacción 
    public int getnumero1() {
        return this.numero1;
    }
    
    public void setnumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public int getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
}  

