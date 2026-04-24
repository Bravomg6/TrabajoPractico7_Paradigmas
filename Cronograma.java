
public class Cronograma {
    //atributos
    String fecha;
    String hito;
    Boolean realizado;
    //constructor
    public Cronograma(){
        this.fecha = "";
        this.hito = "";
        this.realizado = false;
    }
    public Cronograma(String fecha, String hito, Boolean realizado){
        this.fecha = fecha;
        this.hito = hito;
        this.realizado = realizado;
    }
    //getters y setters
    public String getfecha(){
        return fecha;
    }
    public String gethito(){
        return hito;
    }
    public Boolean getrealizado(){
        return realizado;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setHito(String hito){
        this.hito = hito;
    }
    public void setRealizado(Boolean realizado){
        this.realizado = realizado;
    }

    //metodos
    void verCronograma(){
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hito: " + this.hito);
        System.out.println("Realizado: " + this.realizado);
    }

}