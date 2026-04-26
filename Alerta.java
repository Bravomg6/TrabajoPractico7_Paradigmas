/**
 * Representa una alerta del sistema de clima.
 * Permite almacenar y consultar su estado.
 *
 * @author C. Guadalupe Bravo Maggio, Martin Ezequiel Suarez
 * @version 1.0
 */
public class Alerta {

    //Atributos
    private boolean estadoAlerta;

    /**
     * Constructor por defecto. Inicializa la alerta como desactivada.
     */
    public Alerta() {
        this.estadoAlerta = false;
    }

    /**
     * Constructor parametrizado.
     * @param estadoAlerta Estado inicial de la alerta.
     */
    public Alerta(boolean estadoAlerta) {
        this.estadoAlerta = estadoAlerta;
    }

    /**
     * Modifica el estado de la alerta.
     * @param estadoAlerta Nuevo estado a asignar.
     */
    public void setEstadoAlerta(boolean estadoAlerta) {
        this.estadoAlerta = estadoAlerta;
    }

    /**
     * Obtiene el estado actual de la alerta.
     * @return boolean con el estado (true si está encendida, false si no).
     */
    public boolean getEstadoAlerta() {
        return estadoAlerta;
    }

    /**
     * Muestra por consola si la alerta está activada o desactivada.
     */
    public void mostrarAlerta() {
        if (this.estadoAlerta) {
            System.out.println("La alerta esta encendida\n");
        } else {
            System.out.println("La alerta esta desactivada\n");
        }
    }
}