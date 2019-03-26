public class Persona {

    private int edad;
    private long dni;

    public Persona(int edad, long dni) {
        this.edad = edad;
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", dni=" + dni +
                "}";
    }
}
