package Modelo;

//Clase hija de ANIMAl
public class Ave extends Animal {

    //Atributos de la clase
    private boolean puedeVolar;
    private String colorPlumaje;
    private int longevidad;
    private String cuidadoEspecial;

    //Constructor vacío de la clase
    public Ave() {
    }

    //Constructor parametrizado de la clase
    public Ave(boolean puedeVolar, String colorPlumaje, int longevidad, String cuidadoEspecial, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre, nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.puedeVolar = puedeVolar;
        this.colorPlumaje = colorPlumaje;
        this.longevidad = longevidad;
        this.cuidadoEspecial = cuidadoEspecial;
    }

    //Gets and Sets
    public String getPuedeVolar() {
        if (puedeVolar == true) {
            return "puede volar";
        }
        return "no puede volar";
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public String getCuidadoEspecial() {
        return cuidadoEspecial;
    }

    public void setCuidadoEspecial(String cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }
    
    //Gets and Sets heredados
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

    //Métodos polimórficos
    @Override
    public void mostrarDetalles() {
        System.out.println("hijo");
    }

    @Override
    public String darDeComer(String comida) {
        if (dieta == comida) {
            return "El animal esta comiendo: " + dieta;
        }
        return "El animal no puede comer eso";
    }

    @Override
    public String acariciar() {
        if (esPeligroso == false) {
            return "Has acariciado al " + nombre;
        }
        return "No puedes tocar un animal peligroso";
    }

    @Override
    public void datosDelAnimal() {
        mostrarDetalles();
        System.out.println("Este ave " + getPuedeVolar());
        System.out.println("El color de su plumaje es " + colorPlumaje);
        System.out.println("Suelen vivir durante " + longevidad + "anios");
        System.out.println("Su cuidado especial es: " + cuidadoEspecial);
    }
}
