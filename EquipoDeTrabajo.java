import java.util.ArrayList;
/**
 * Gestiona el grupo de investigadores asignados a la expedición.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class EquipoDeTrabajo {
    //Atributos
    private ArrayList<Investigador> investigadores;

    //Constructores
    public EquipoDeTrabajo() {
        this.investigadores = new ArrayList<>();
    }

    public EquipoDeTrabajo(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    //Getters y setters
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void setInvestigadores(ArrayList<Investigador> investigadores) {
        this.investigadores = investigadores;
    }
    
    //Metodos
   /**
     * Agrega un investigador validando que no sea nulo.
     * @throws IllegalArgumentException si el objeto es nulo.
     */
    public void agregarInvestigador(Investigador investigador) {
        if (investigador == null) {
            throw new IllegalArgumentException("No se puede agregar un investigador nulo al equipo.");
        }
        this.investigadores.add(investigador);
    }

    public int cantidadDeInvestigadores() {
        return this.investigadores.size();
    }
}