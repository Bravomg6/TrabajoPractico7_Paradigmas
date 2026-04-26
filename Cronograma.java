public class Cronograma {
    //Atributos
    // CORRECCIÓN: Agregué 'private' a todos los atributos.
    private String fecha;
    private String hito;
    private boolean realizado;

    //Constructor
    public Cronograma(){
        this.fecha = "";
        this.hito = "";
        this.realizado = false;
    }
    public Cronograma(String fecha, String hito, boolean realizado){
        this.fecha = fecha;
        this.hito = hito;
        this.realizado = realizado;
    }

    //Getters y setters
    public String getFecha(){
        return fecha;
    }
    public String getHito(){
        return hito;
    }
    public boolean getRealizado(){
        return realizado;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setHito(String hito){
        this.hito = hito;
    }
    public void setRealizado(boolean realizado){
        this.realizado = realizado;
    }

    //Metodos
    public void verCronograma(){
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hito: " + this.hito);
        System.out.println("Realizado: " + this.realizado);
    }
}