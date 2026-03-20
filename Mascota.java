public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;

    // Constructor
    public Mascota(String nombre, String especie, String raza, int edad, double peso) {
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setPeso(peso);
    }

    // SETTERS con validaciones

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty())
                ? "Sin nombre"
                : nombre.trim();
    }

    public void setEspecie(String especie) {
        this.especie = (especie == null || especie.trim().isEmpty())
                ? "Desconocida"
                : especie.trim();
    }

    public void setRaza(String raza) {
        this.raza = (raza == null || raza.trim().isEmpty())
                ? "Mestizo"
                : raza.trim();
    }

    public void setEdad(int edad) {
        this.edad = (edad < 0) ? 0 : edad;
    }

    public void setPeso(double peso) {
        this.peso = (peso <= 0) ? 0.1 : peso;
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    // Método toString
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    // Método esAdulto
    public boolean esAdulto() {
        return edad >= 3;
    }

    // Método estaEnPesoNormal
    public boolean estaEnPesoNormal(double pesoMin, double pesoMax) {
        return peso >= pesoMin && peso <= pesoMax;
    }
}