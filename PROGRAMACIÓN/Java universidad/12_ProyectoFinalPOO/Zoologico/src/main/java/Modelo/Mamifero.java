package Modelo;

//Clase hija de ANIMAL
public class Mamifero extends Animal {

    //Atributos de la clase
    private boolean tienePelaje;
    private float temperaturaCorporal;
    private boolean esNocturno;

    //Constructor vacío de la clase
    public Mamifero() {
        this.tienePelaje = false;
        this.temperaturaCorporal = 0;
        this.esNocturno = false;
    }

    //Constructor parametrizado de la clase
    public Mamifero(boolean tienePelaje, float temperaturaCorporal, boolean esNocturno, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre, nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.tienePelaje = tienePelaje;
        this.temperaturaCorporal = temperaturaCorporal;
        this.esNocturno = esNocturno;
    }

    //Gets and Sets
    public String getPelaje() {
        if (tienePelaje == true) {
            return "tiene pelaje";
        }
        return "no tiene pelaje";
    }

    public void setTienePelaje(boolean tienePelaje) {
        this.tienePelaje = tienePelaje;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getEsNocturno() {
        if (esNocturno == true) {
            return "es nocturno";
        }
        return "no es nocturno";
    }

    public void setEsNocturno(boolean esNocturno) {
        this.esNocturno = esNocturno;
    }

    //Gets and sets Heredados
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public boolean esPeligroso() {
        return esPeligroso;
    }

    @Override
    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    @Override
    public String getHabitatNatural() {
        return habitatNatural;
    }

    @Override
    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    @Override
    public String getDieta() {
        return dieta;
    }

    @Override
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("- El mamifero " + getPelaje());;
        System.out.println("- Su temperatura corporal es de: " + temperaturaCorporal + "Celsius");
        System.out.println("- El mamifero " + getEsNocturno() + "\n");
    }

    //Métodos polimórficos
    @Override
    public String observar() {
        return "\nEl animal esta alerta de los otros animales\n";
    }

    @Override
    public String darDeComer() {
        return "\nEl animal esta comiendo\n";
    }

    @Override
    public String acariciar() {
        if (esPeligroso == false) {
            return "\nHas acariciado al " + nombre + "\n";
        }
        return "\nNo puedes tocar un animal peligroso\n";
    }
}
