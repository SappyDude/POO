package Modelo;

public class Reptil extends Animal {

    //Atributos de la clase
    private boolean esVenenoso;
    private String tipoDeEscamas;
    private String tipoSangre;
    private String formaApareamiento;

    //Constructor vacío de la clase
    public Reptil() {
    }

    //Constructor parametrizado
    public Reptil(boolean esVenenoso, String tipoDeEscamas, String tipoSangre, String formaApareamiento, String nombre, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombre, nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.esVenenoso = esVenenoso;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoSangre = tipoSangre;
        this.formaApareamiento = formaApareamiento;
    }

    //Gets and Sets
    public String esVenenoso() {
        if (esVenenoso == true) {
            return "es venenoso";
        }
        return "no es venenoso";
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public String getTipoDeEscamas() {
        return tipoDeEscamas;
    }

    public void setTipoDeEscamas(String tipoDeEscamas) {
        this.tipoDeEscamas = tipoDeEscamas;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getFormaApareamiento() {
        return formaApareamiento;
    }

    public void setFormaApareamiento(String formaApareamiento) {
        this.formaApareamiento = formaApareamiento;
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
    public String darDeComer(String comida) {
        if (dieta.equals(comida)) {
            return "El animal esta comiendo: " + dieta;
        }
        return "El animal no puede comer eso";
    }

    @Override
    public String acariciar() {
        if (esPeligroso == false || esVenenoso == true) {
            return "Has acariciado al " + nombre;
        }
        return "No puedes tocar un animal peligroso";
    }

    @Override
    public void datosDelAnimal() {
        super.mostrarDetalles();
        System.out.println("El reptil " + esVenenoso());
        System.out.println("Su tipo de escamas son: " + tipoDeEscamas);
        System.out.println("Este reptil es de " + tipoSangre);
        System.out.println("Estos son " + formaApareamiento + "\n");
    }

    @Override
    public String observar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
