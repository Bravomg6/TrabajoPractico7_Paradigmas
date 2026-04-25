public class Alerta {
    //Atributos
    private boolean estadoAlerta;

    //Constructores 
    public Alerta(){
        this.estadoAlerta = false;
    }
    public Alerta(boolean estadoAlerta){
        this.estadoAlerta = estadoAlerta;
    }

    //Set y get 
    public void setEstadoAlerta(boolean estadoAlerta){
        this.estadoAlerta = estadoAlerta;
    }
    public boolean getEstadoAlerta(){
        return estadoAlerta;
    }
    //Metodo
    public void mostrarAlerta(){
        if(this.estadoAlerta){
            System.out.println("La alerta esta encendida\n");
        }
        else if(!this.estadoAlerta){
            System.out.println("La alerta esta desactivada\n");
        }
    }
}