public class Herramientas{
    //Atributos
    private int cantComputadoras;
    private int cantScanner;
    //Constructores
    public Herramientas(){
        this.cantComputadoras = 0;
        this.cantScanner = 0;
    }
    public Herramientas(int cantComputadoras, int cantScanner){
        this.cantComputadoras = cantComputadoras;
        this.cantScanner = cantScanner;
    }
    //Set y get
    public void setcantComputadoras(int cantComputadoras){
        this.cantComputadoras = cantComputadoras;
    }
    public void setcantScanner(int cantScanner){
        this.cantScanner = cantScanner;
    }
    public int getcantComputadoras(){
        return cantComputadoras;
    }
    public int getcantScanner(){
        return cantScanner;
    }
    //Metodos
    public void mostrarHerramientas(){
        System.out.println("Codigo de computadora: " + this.cantComputadoras);
        System.out.println("Codigo de scanner: " + this.cantScanner);
    }
    public void nuevasHerramientas(int cantComputadoras, int cantScanner){
        this.cantComputadoras = cantComputadoras;
        this.cantScanner = cantScanner;
    }
}