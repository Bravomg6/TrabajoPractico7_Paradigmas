import java.util.ArrayList;
public class BitacoraDeHallazgo{
    //Atributos
    private ArrayList<Hallazgo> hallazgos;
    //Constructor
    public BitacoraDeHallazgo(){
        this.hallazgos = new ArrayList<>();
    }
    public BitacoraDeHallazgo(ArrayList<Hallazgo> hallazgos){
        this.hallazgos = hallazgos;
    }
    //Set y get
    public ArrayList<Hallazgo> getHallazgos(){
        return hallazgos;
    }
    public void setHallazgos(ArrayList<Hallazgo> hallazgos){
        this.hallazgos = hallazgos;
    }
    //Metodos
    public void nuevoHallazgo(Hallazgo hallazgo){
        this.hallazgos.add(hallazgo);
    }
    public void historialHallazgos(){
        for(Hallazgo hallazgo : this.hallazgos){
            System.out.println(hallazgo.getHallazgo());
        }
    }
}