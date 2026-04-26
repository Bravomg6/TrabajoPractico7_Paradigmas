/**
 * Representa un descubrimiento puntual.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class Hallazgo{
    //Atributos
    private String hallazgo;
    //Constructor
    public Hallazgo(){
        this.hallazgo = "";
    }
 /**
     * @throws IllegalArgumentException si la descripción está vacía.
     */
    public Hallazgo(String hallazgo) {
        if (hallazgo == null || hallazgo.trim().isEmpty()) {
            throw new IllegalArgumentException("El hallazgo no puede estar vacío.");
        }
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