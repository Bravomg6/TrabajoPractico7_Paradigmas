import java.util.ArrayList;
import java.util.Random;

/**
 * Representa la gestión central de una expedición científica.
 * Controla validaciones, excepciones y el log de errores.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class Expedicion {

    private int cupoMaximo = 5;

    private String nombre;
    private String destino;
    private String estado;
    private int codigo;
    private int cupo;
    private ArrayList<Cronograma> cronograma;
    private ModuloDeClima clima;
    private Equipamiento inventario;
    private EquipoDeTrabajo equipo;
    private BitacoraDeHallazgo bitacora;

    public Expedicion(String nombre, String destino) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (destino == null || destino.trim().isEmpty()) throw new IllegalArgumentException("El destino no puede estar vacío.");
        
        this.nombre = nombre;
        this.destino = destino;
        this.estado = "PLANIFICACION";

        Random rand = new Random();
        this.codigo = rand.nextInt(9000) + 1000;
        this.cupo = cupoMaximo;

        this.cronograma = new ArrayList<>();
        this.clima = new ModuloDeClima();
        this.inventario = new Equipamiento();
        this.equipo = new EquipoDeTrabajo();
        this.bitacora = new BitacoraDeHallazgo();
    }

    public String getNombre() { return this.nombre; }
    public String getEstado() { return this.estado; }
    public int getCodigo() { return this.codigo; }
    public EquipoDeTrabajo getEquipo() { return this.equipo; }
    
    public void setClima(ModuloDeClima clima) { this.clima = clima; }
    public void setInventario(Equipamiento inventario) { this.inventario = inventario; }

    /**
     * Añade un investigador controlando el cupo.
     * @throws IllegalArgumentException si el cupo está lleno.
     */
    public void agregarInvestigador(Investigador investigador) throws IllegalArgumentException {
        if (this.cupo <= 0) {
            throw new IllegalArgumentException("El cupo de la expedición (" + this.cupoMaximo + ") está lleno. No se puede añadir a " + investigador.getNombre());
        }
        this.equipo.agregarInvestigador(investigador);
        this.cupo--;
    }

    /**
     * Evalúa todos los requisitos obligatorios antes de iniciar.
     * Si falla, captura la excepción y registra el error en un log (Consola).
     */
    public void iniciarExpedicion() {
        System.out.println("\nIntentando iniciar la expedición: " + this.nombre + "...");

        try {
            Requisitos validador = new Requisitos();
            
            // Evaluamos todos los requisitos
            validador.verificacionClima(this.clima.getAlerta());
            validador.verificacionCupo(this);
            validador.verificacionHerramientas(this.inventario.getHerramientas());

            if (!validador.getAprobado()) {
                // Generamos la excepción personalizada de Java si no se cumple
                throw new IllegalStateException("Falla en los requisitos mínimos. Posibles causas: Alerta climática extrema, falta de herramientas esenciales (PC/Scanner) o equipo sin investigadores.");
            }

            this.estado = "EN CURSO";
            System.out.println("¡Éxito! La expedición ha iniciado y pasado a estado EN CURSO.");

        } catch (IllegalStateException e) {
            // REGISTRO EN LOG DE CONSOLA (Requisito TP)
            System.out.println("*********************************************************");
            System.out.println("LOG DE ERROR AL INICIAR EXPEDICION");
            System.out.println("Motivo: " + e.getMessage());
            System.out.println("Estado actual de la misión: " + this.estado);
            System.out.println("*********************************************************");
        } catch (Exception e) {
            System.out.println("LOG CRÍTICO: Error inesperado del sistema -> " + e.getMessage());
        }
    }

    public void inicioCronograma(String fecha, String hito) {
        try {
            Cronograma nuevoHito = new Cronograma(fecha, hito, false);
            this.cronograma.add(nuevoHito);
            System.out.println("Hito agregado: " + hito);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agendar hito: " + e.getMessage());
        }
    }

    public void nuevoHallazgo(String descripcion) {
        if (this.estado.equals("EN CURSO")) {
            try {
                Hallazgo hallazgo = new Hallazgo(descripcion);
                this.bitacora.nuevoHallazgo(hallazgo);
                System.out.println("Hallazgo guardado: " + hallazgo.getHallazgo());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al registrar hallazgo: " + e.getMessage());
            }
        } else {
            System.out.println("No se puede registrar hallazgos si la expedición no está en curso.");
        }
    }

    public void finExpedicion() {
        this.estado = "FINALIZADA";
        System.out.println("\nExpedición '" + this.nombre + "' FINALIZADA.");
        this.bitacora.historialHallazgos();
    }
}