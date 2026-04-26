import java.util.ArrayList;

/**
 * Representa el registro de todos los hallazgos de la expedición.
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class BitacoraDeHallazgo {
    private ArrayList<Hallazgo> hallazgos;

    public BitacoraDeHallazgo() {
        this.hallazgos = new ArrayList<>();
    }

    public BitacoraDeHallazgo(ArrayList<Hallazgo> hallazgos) {
        if (hallazgos == null) {
            throw new IllegalArgumentException("La lista de hallazgos no puede ser nula.");
        }
        this.hallazgos = hallazgos;
    }

    public ArrayList<Hallazgo> getHallazgos() {
        return this.hallazgos;
    }

    public void setHallazgos(ArrayList<Hallazgo> hallazgos) {
        if (hallazgos == null) throw new IllegalArgumentException("La lista no puede ser nula.");
        this.hallazgos = hallazgos;
    }

    /**
     * Agrega un nuevo registro a la bitácora validando que no sea nulo.
     * @param hallazgo el objeto Hallazgo a guardar
     */
    public void nuevoHallazgo(Hallazgo hallazgo) {
        if (hallazgo == null) {
            throw new IllegalArgumentException("El hallazgo a registrar no puede ser nulo.");
        }
        this.hallazgos.add(hallazgo);
    }

    public void historialHallazgos() {
        System.out.println("---------- HISTORIAL DE HALLAZGOS ---------");
        if (hallazgos.isEmpty()) {
            System.out.println("- No hay hallazgos registrados.");
        } else {
            for (Hallazgo hallazgo : this.hallazgos) {
                System.out.println("- " + hallazgo.getHallazgo());
            }
        }
    }
}