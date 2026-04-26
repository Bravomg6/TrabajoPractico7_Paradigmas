/**
 * Supervisa el entorno meteorológico en la zona.
 *
 * @author C. Guadalupe Bravo Maggio, Martin Ezequiel Suarez
 * @version 1.0
 */
public class ModuloDeClima {
    //Atributos
    private double temperatura;
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private Alerta alerta;

    //Constructores
    public ModuloDeClima(){
        this.temperatura = 0;
        this.temperaturaMaxima = 0;
        this.temperaturaMinima = 0;
        this.alerta = new Alerta();
    }
 /**
     * @throws IllegalArgumentException si la mínima es mayor a la máxima.
     */
    public ModuloDeClima(double temperatura, double temperaturaMaxima, double temperaturaMinima) {
        if (temperaturaMinima >= temperaturaMaxima) {
            throw new IllegalArgumentException("Error en Clima: La temperatura mínima no puede ser mayor o igual a la máxima.");
        }
        this.temperatura = temperatura;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.alerta = new Alerta();
    }

    //Set y get
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    public void setTemperaturaMaxima(double temperaturaMaxima){
        this.temperaturaMaxima = temperaturaMaxima;
    }
    public void setTemperaturaMinima(double temperaturaMinima){
        this.temperaturaMinima = temperaturaMinima;
    }
    public void setAlerta(Alerta alerta){
        this.alerta = alerta;
    }
    public double getTemperatura(){
        return temperatura;
    }
    public double getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
    public double getTemperaturaMinima(){
        return temperaturaMinima;
    }
    public Alerta getAlerta(){
        return alerta;
    }

    //Metodos
    public void  consultarClima(){
        if(this.temperatura > this.temperaturaMaxima){
            this.alerta.setEstadoAlerta(true);
        }
        else if(this.temperatura < this.temperaturaMinima){
            this.alerta.setEstadoAlerta(true);
        }
    }

}