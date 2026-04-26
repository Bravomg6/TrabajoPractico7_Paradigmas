import java.util.ArrayList;
import java.util.Random;

/**
 * Representa la gestión central de una expedición científica.
 * Utiliza la clase Requisitos para validar su inicio.
 * * @author Tu Nombre
 * @version 1.0
 */
public class Expedicion {

    public int cupoMaximo = 5;

    // Atributos
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

    /**
     * Constructor por defecto.
     */
    public Expedicion() {
        this.nombre = "";
        this.destino = "";
        this.estado = "PLANIFICACION"; 
        
        // Generar código aleatorio
        Random rand = new Random();
        this.codigo = rand.nextInt(9000) + 1000; 
        
        this.cupo = cupoMaximo; // Inicializamos el cupo disponible con el máximo
        
        this.cronograma = new ArrayList<>();
        this.clima = new ModuloDeClima();
        this.inventario = new Equipamiento();
        this.equipo = new EquipoDeTrabajo();
        this.bitacora = new BitacoraDeHallazgo();
    }

    // ==========================================
    // GETTERS Y SETTERS 
    // ==========================================
    public String getNombre() { return nombre; }
    public String getDestino() { return destino; }
    public String getEstado() { return estado; }
    public int getCodigo() { return codigo; }
    public int getCupo() { return cupo; }
    public ArrayList<Cronograma> getCronograma() { return cronograma; }
    public ModuloDeClima getClima() { return clima; }
    public Equipamiento getInventario() { return inventario; }
    public EquipoDeTrabajo getEquipo() { return equipo; }
    public BitacoraDeHallazgo getBitacora() { return bitacora; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setCupo(int cupo) { this.cupo = cupo; }
    public void setCronograma(ArrayList<Cronograma> cronograma) { this.cronograma = cronograma; }
    public void setClima(ModuloDeClima clima) { this.clima = clima; }
    public void setInventario(Equipamiento inventario) { this.inventario = inventario; }
    public void setEquipo(EquipoDeTrabajo equipo) { this.equipo = equipo; }
    public void setBitacora(BitacoraDeHallazgo bitacora) { this.bitacora = bitacora; }

    // ==========================================
    // MÉTODOS DE COMPORTAMIENTO 
    // ==========================================

    /**
     * Agrega un investigador al equipo.
     * Uso obligatorio de throw: Lanza error si no hay cupo.
     * * @param investigador El investigador a agregar.
     * @throws Exception Si el cupo es menor o igual a 0.
     */
    public void agregarInvestigador(Investigador investigador) throws Exception {
        if (this.cupo <= 0) {
            // Lanza la excepción estándar de Java
            throw new Exception("Error: No se puede añadir al investigador. El cupo está lleno.");
        }
        this.equipo.agregarInvestigador(investigador);
        this.cupo--; // Reducimos el cupo disponible
        System.out.println("Investigador agregado. Cupo restante: " + this.cupo);
    }

    /**
     * Intenta iniciar la expedición validando con la clase Requisitos.
     * Uso obligatorio de try-catch.
     */
    public void iniciarExpedicion() {
        System.out.println("Intentando iniciar la expedición: " + this.nombre + "...");
        
        try {
            // Instanciamos tu clase Requisitos
            Requisitos validador = new Requisitos();
            
            // Verificamos todo
            validador.verificacionClima(this.clima.getAlerta());
            validador.verificacionCupo(this);
            validador.verificacionHerramientas(this.inventario.getHerramientas());
            
            // Si la variable de Requisitos pasó a 'false', lanzamos error
            if (validador.getAprobado() == false) {
                throw new Exception("Los requisitos obligatorios no se cumplen (Falla en Clima, Cupo o Herramientas).");
            }
            
            // Si todo está bien, inicia
            this.estado = "EN CURSO";
            System.out.println("¡Éxito! La expedición ha pasado a estado EN CURSO.");
            
        } catch (Exception e) {
            // Registra el error en consola (Log)
            System.err.println("LOG DE ERROR: No se pudo iniciar. " + e.getMessage());
        }
    }

    /**
     * Inicia el cronograma agregando un hito.
     */
    public void inicioCronograma(String fecha, String hito) {
        Cronograma nuevoHito = new Cronograma(fecha, hito, false);
        this.cronograma.add(nuevoHito);
        System.out.println("Hito agregado: " + hito);
    }

    /**
     * Registra un nuevo hallazgo.
     */
    public void nuevoHallazgo(Hallazgo hallazgo) {
        if (this.estado.equals("EN CURSO")) {
            this.bitacora.nuevoHallazgo(hallazgo);
            System.out.println("Hallazgo guardado: " + hallazgo.getHallazgo());
        }
    }

    /**
     * Finaliza la expedición y muestra la bitácora.
     */
    public void finExpedicion() {
        this.estado = "FINALIZADA";
        System.out.println("\nExpedición FINALIZADA exitosamente.");
        System.out.println("--- Historial de Hallazgos ---");
        this.bitacora.historialHallazgos();
    }
}