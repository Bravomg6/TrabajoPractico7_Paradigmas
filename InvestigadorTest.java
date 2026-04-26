import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InvestigadorTest {

    // Prueba 1: Verifica que el sistema bloquee nombres vacíos
    @Test
    public void pruebaNombreVacioLanzaExcepcion() {
        Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
            new Investigador("", "Biología", "Senior", true);
        });
        assertEquals("El nombre del investigador no puede ser nulo o vacío.", excepcion.getMessage());
    }

    // Prueba 2: Verifica que el sistema bloquee especialidades vacías
    @Test
    public void pruebaEspecialidadVaciaLanzaExcepcion() {
        Exception excepcion = assertThrows(IllegalArgumentException.class, () -> {
            new Investigador("Dr. Grant", "", "Líder", true);
        });
        assertEquals("La especialidad no puede ser nula o vacía.", excepcion.getMessage());
    }

    // Prueba 3: Verifica que SI pones todo bien, el objeto se cree correctamente
    @Test
    public void pruebaCreacionExitosa() {
        Investigador inv = new Investigador("Dr. Grant", "Paleontología", "Líder", true);
        
        // Verifica que los atributos se guardaron correctamente
        assertEquals("Dr. Grant", inv.getNombre());
        assertEquals("Paleontología", inv.getEspecialidad());
        assertTrue(inv.getGps()); // Verifica que el GPS sea true
    }
}