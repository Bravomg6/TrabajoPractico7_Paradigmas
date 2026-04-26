/**
 * Gestiona el inventario completo necesario para la expedición.
 *
 * @author C. Guadalupe Bravo Maggio, Martin Ezequiel Suarez
 * @version 1.0
 */
public class Equipamiento{
    //Atributos 
    private Suministros suministros;
    private Herramientas herramientas;
    //Constructor
    public Equipamiento(){
        this.suministros = new Suministros();
        this.herramientas = new Herramientas();
    }
    /**
     * 
     */
  public Equipamiento(Suministros suministros, Herramientas herramientas) {
        if (suministros == null || herramientas == null) {
            throw new IllegalArgumentException("Suministros y Herramientas no pueden ser nulos.");
        }
        this.suministros = suministros;
        this.herramientas = herramientas;
    }
    //Set y get
    public Suministros getSuministros(){
        return suministros;
    }
    public Herramientas getHerramientas(){
        return herramientas;
    }
    //Metodos
    public void mostrarInventario(){
        System.out.println("Suministros:");
        this.suministros.mostrarSuministros();
        System.out.println("Herramientas:");
        this.herramientas.mostrarHerramientas();
    }
    public void AgregarInventario(int paqueteComida, int botellaAgua, int codComputadora, int codScanner){
        this.suministros.nuevosSuministros(paqueteComida, botellaAgua);
        this.herramientas.nuevasHerramientas(codComputadora, codScanner);
    }
}