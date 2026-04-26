/**
 * Representa el validador de los requisitos mínimos para iniciar una expedición.
 * * Permite comprobar de manera centralizada el estado del clima, el cupo 
 * y las herramientas necesarias antes de iniciar la misión.
 * * @author Tu Nombre
 * @version 1.0
 */
public class Requisitos {
    // Atributos
    private boolean aprobado;

    // Constructores
    /**
     * Constructor por defecto. 
     * Inicializamos en true asumiendo que todo está bien, y si algún requisito falla, lo cambiamos a false.
     */
    public Requisitos() {
        this.aprobado = true; 
    }
    
    /**
     * Constructor parametrizado.
     * @param aprobado Estado inicial de la aprobación.
     */
    public Requisitos(boolean aprobado) {
        this.aprobado = aprobado;
    }

    // Setters y Getters
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    
    public boolean getAprobado() {
        return aprobado;
    }

    // Métodos
    
    /**
     * Verifica que no haya alertas climáticas activas.
     * @param alerta Objeto Alerta proveniente del ModuloDeClima.
     */
    public void verificacionClima(Alerta alerta) {
        if(alerta.getEstadoAlerta() == true){
            this.aprobado = false; 
        }
    }

    /**
     * Verifica que la expedición tenga cupos disponibles (mayor a cero).
     * @param expedicion La expedición que se desea validar.
     */
    public void verificacionCupo(Expedicion expedicion) {
        if(expedicion.getCupo() <= 0){
            this.aprobado = false; // Si no hay cupo, se cancela la aprobación.
        }
    }

    /**
     * Verifica que el inventario cuente con las herramientas esenciales.
     * @param herramientas Las herramientas que posee el equipo.
     */
  public void verificacionHerramientas(Herramientas herramientas){
        if(herramientas.getcantComputadoras() == 0 || herramientas.getcantScanner() == 0){
            this.setAprobado(false); // Si falta alguna herramienta, se cancela.
        }
    }
}