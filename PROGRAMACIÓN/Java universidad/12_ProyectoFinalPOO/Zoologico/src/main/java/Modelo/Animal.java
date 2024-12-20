package Modelo;

public abstract class Animal {

    //Atributos de la clase
    protected String nombre;
    protected String nombreCientifico;
    protected int edad;
    protected float peso;
    protected boolean esPeligroso;
    protected String habitatNatural;
    protected String dieta;

    //Constructor de la clase  
    public Animal() {
        this.nombre = "";
        this.nombreCientifico = "";
        this.edad = 0;
        this.peso = 0;
        this.esPeligroso = false;
        this.habitatNatural = "";
        this.dieta = "";
    }

    //Constructor parametrizado de la clase
    public Animal(String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.peso = peso;
        this.esPeligroso = esPeligroso;
        this.habitatNatural = habitatNatural;
        this.dieta = dieta;
    }

    //Gets and Sets de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean esPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    //Métodos de la clase
    public void mostrarDetalles() {
        System.out.println("\n"
                + "- " + nombre + "\n"
                + "- Su nombre cientifico es " + nombreCientifico + "\n"
                + "- Tiene " + edad + " anios\n"
                + "- Pesa " + peso + "kg\n"
                + "- Su habitat natural: " + habitatNatural + "\n"
                + "- El animal es " + dieta
        );
    }

    
    //Métodos abstractos
    public abstract String observar();

    public abstract String darDeComer();

    public abstract String acariciar();
}
