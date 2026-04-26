
/**
 * Representa a un profesional que participa en la expedición.
 *
 * @author Tu Nombre
 * @version 1.0
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

  /**
     * Constructor que valida que los textos no estén vacíos.
     * @throws IllegalArgumentException si algún texto es nulo o vacío.
     */
    public Investigador(String nombre, String especialidad, String rango, boolean gps) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del investigador no puede ser nulo o vacío.");
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede ser nula o vacía.");
        }
        if (rango == null || rango.trim().isEmpty()) {
            throw new IllegalArgumentException("El rango no puede ser nulo o vacío.");
        }
        
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
