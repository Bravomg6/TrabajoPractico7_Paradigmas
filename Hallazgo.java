public class Hallazgo{
    //Atributos
    private String hallazgo;
    //Constructor
    public Hallazgo(){
        this.hallazgo = "";
    }
    public Hallazgo(String hallazgo){
        this.hallazgo = hallazgo;
    }
    //Set y get
    public void setHallazgo(String hallazgo){
        this.hallazgo = hallazgo;
    }
    public String getHallazgo(){
        return hallazgo;
    }
}