/**
 * Representa un evento o hito dentro de la planificación de la expedición.
 *
 * @author Tu Nombre
 * @version 1.0
 */

public class Cronograma {
    //Atributos
    private String fecha;
    private String hito;
    private boolean realizado;

    //Constructor
    public Cronograma(){
        this.fecha = "";
        this.hito = "";
        this.realizado = false;
    }
    
    /**
     * Constructor con validación de datos.
     * @throws IllegalArgumentException si la fecha o el hito están vacíos.
     */
  public Cronograma(String fecha, String hito, boolean realizado) {
        if (fecha == null || fecha.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha no puede ser nula o vacía.");
        }
        if (hito == null || hito.trim().isEmpty()) {
            throw new IllegalArgumentException("El hito no puede ser nulo o vacío.");
        }
        this.fecha = fecha;
        this.hito = hito;
        this.realizado = realizado;
    }

    //Getters y setters
    public String getFecha(){
        return fecha;
    }
    public String getHito(){
        return hito;
    }
    public boolean getRealizado(){
        return realizado;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setHito(String hito){
        this.hito = hito;
    }
    public void setRealizado(boolean realizado){
        this.realizado = realizado;
    }

    //Metodos
    public void verCronograma(){
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hito: " + this.hito);
        System.out.println("Realizado: " + this.realizado);
    }
}