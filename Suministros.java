/**
 * Modela los víveres de supervivencia básica.
 *
 * @author Tu Nombre
 * @version 1.0
 */

public class Suministros {
    //Atributos 
    private int paqueteComida;
    private int botellaAgua;

    //Constructores
    public Suministros() {
        this.paqueteComida = 0;
        this.botellaAgua = 0;
    }

    /**
     * @throws IllegalArgumentException si las cantidades son negativas.
     */
 public Suministros(int paqueteComida, int botellaAgua) {
        if (paqueteComida < 0 || botellaAgua < 0) {
            throw new IllegalArgumentException("Las cantidades de suministros no pueden ser negativas.");
        }
        this.paqueteComida = paqueteComida;
        this.botellaAgua = botellaAgua;
    }

    //Set y get 
    public void setPaqueteComida(int paqueteComida) {
        this.paqueteComida = paqueteComida;
    }
    public void setBotellaAgua(int botellaAgua) {
        this.botellaAgua = botellaAgua;
    }
    public int getPaqueteComida() {
        return paqueteComida;
    }
    public int getBotellaAgua() {
        return botellaAgua;
    }

    //Metodo
    public void mostrarSuministros() {
        System.out.println("Paquete de comida: " + this.paqueteComida);
        System.out.println("Botella de agua: " + this.botellaAgua);
    }
    public void nuevosSuministros(int paqueteComida, int botellaAgua) {
        this.paqueteComida += paqueteComida;
        this.botellaAgua += botellaAgua;
    }
}