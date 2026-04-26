
/**
 * Representa a un profesional que participa en la expedición.
 * Cumple con el Requerimiento 2 del TP.
 */
public class Investigador {

    // atributos
    private String nombre;
    private String especialidad;
    private String rango;
    private boolean gps;

    // constructor
    public Investigador() {
        this.nombre = "";
        this.especialidad = "";
        this.rango = "";
        this.gps = false;
    }

    public Investigador(String nombre, String especialidad, String rango, boolean gps) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.rango = rango;
        this.gps = gps;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getRango() {
        return rango;
    }

    public boolean getGps() {
        return gps;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
}
