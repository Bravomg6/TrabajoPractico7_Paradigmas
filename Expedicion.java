java
.util.ArrayList;

public class Expedicion {

    //Atributos de la clase
    private String nombre;
    private String estado;
    private int codigo;
    private int cupo;
    private ArrayList<Cronograma> cronograma;
    private ModuloDeClima clima;
    private Equipamiento inventario;
    private EquipoDeTrabajo equipo;
    private BitacoraDeHallazgo bitacora;

    //Constructor
    public Expedicion() {
        this.nombre = "";
        this.estado = "";
        this.codigo = 0;
        this.cupo = 0;
        this.cronograma = new ArrayList<>();
        this.clima = new ModuloDeClima();
        this.inventario = new Equipamiento();
        this.equipo = new EquipoDeTrabajo();
        this.bitacora = new BitacoraDeHallazgo();
    }
    public Expedicion(String nombre, String estado, int codigo, int cupo, ArrayList<Cronograma> cronograma, ModuloDeClima clima, Equipamiento inventario, EquipoDeTrabajo equipo, BitacoraDeHallazgo bitacora) {
        this.nombre = nombre;
        this.estado = estado;
        this.codigo = codigo;
        this.cupo = cupo;
        this.cronograma = cronograma;
        this.clima = clima;
        this.inventario = inventario;
        this.equipo = equipo;
        this.bitacora = bitacora;
    }
    //Set y get
    public String nombre(){
        return nombre;
    }
    public String estado(){
        return estado;
    }
    public int codigo(){
        return codigo;
    }
    public int cupo(){
        return cupo;
    }
    public ArrayList<Cronograma> cronograma(){
        return cronograma;
    }
    public ModuloDeClima clima(){
        return clima;
    }
    public Equipamiento inventario(){
        return inventario;
    }
    public EquipoDeTrabajo equipo(){
        return equipo;
    }
    public BitacoraDeHallazgo bitacora(){
        return bitacora;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setCupo(int cupo){
        this.cupo = cupo;
    }
    public void setArrayListCronograma(ArrayList<Cronograma> cronograma){
        this.cronograma = cronograma;
    }
    public void setClima(ModuloDeClima clima){
        this.clima = clima;
    }
    public void setInventario(Equipamiento inventario){
        this.inventario = inventario;
    }
    public void setEquipo(EquipoDeTrabajo equipo){
        this.equipo = equipo;
    }
    public void setBitacora(BitacoraDeHallazgo bitacora){
        this.bitacora = bitacora;
    }

    //metodos
    
}
