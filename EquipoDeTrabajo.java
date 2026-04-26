import java.util.ArrayList;

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
    public void agregarInvestigador(Investigador investigador) { 
        this.investigadores.add(investigador);
    }

    public int cantidadDeInvestigadores() {
        return this.investigadores.size();
    }
}