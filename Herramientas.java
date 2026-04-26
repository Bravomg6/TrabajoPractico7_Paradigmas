/**
 * Maneja las herramientas tecnológicas requeridas.
 *
 * @author  C. Guadalupe Bravo Maggio, Martin Ezequiel Suarez
 * @version 1.0
 */
public class Herramientas {
    //Atributos
    private int cantComputadoras;
    private int cantScanner;

    //Constructores
    public Herramientas(){
        this.cantComputadoras = 0;
        this.cantScanner = 0;
    }

    /**
     * @throws IllegalArgumentException si las cantidades son negativas.
     */
    public Herramientas(int cantComputadoras, int cantScanner) {
        if (cantComputadoras < 0 || cantScanner < 0) {
            throw new IllegalArgumentException("La cantidad de herramientas no puede ser negativa.");
        }
        this.cantComputadoras = cantComputadoras;
        this.cantScanner = cantScanner;
    }

    //Set y get (CORREGIDOS CON MAYÚSCULA EN LA 'C')
    public void setCantComputadoras(int cantComputadoras){
        this.cantComputadoras = cantComputadoras;
    }
    
    public void setCantScanner(int cantScanner){
        this.cantScanner = cantScanner;
    }
    
    public int getCantComputadoras(){
        return this.cantComputadoras;
    }
    
    public int getCantScanner(){
        return this.cantScanner;
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