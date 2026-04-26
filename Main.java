/**
 * Clase ejecutable principal del Sistema de Gestión de Expediciones.
 * Demuestra el uso de pruebas manuales y excepciones requeridas,
 *
 * @author C. Guadalupe Bravo Maggio, Martin Ezequiel Suarez
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EXPEDICIONES ===\n");

        // 1. CREACIÓN CON VALIDACIÓN
        Expedicion expedicion = null;
        try {
            expedicion = new Expedicion("", "Polo Norte");
        } catch (IllegalArgumentException e) {
            System.out.println("Advertencia al crear expedición: " + e.getMessage());
            System.out.println("Se creará con datos por defecto.");
            expedicion = new Expedicion("Misión de Rescate", "Polo Norte");
        }

        System.out.println("\n--- Preparando " + expedicion.getNombre() + " (Cod: " + expedicion.getCodigo() + ") ---");

        // 2. FORZANDO ERRORES EN REQUISITOS (Clima extremo y 0 herramientas)
        ModuloDeClima climaMalo = new ModuloDeClima(50.0, 40.0, -20.0); // 50 supera la máxima de 40
        climaMalo.consultarClima(); // Enciende la alerta
        expedicion.setClima(climaMalo);

        Herramientas herramientasMalas = new Herramientas(0, 0); // 0 computadoras y 0 scanners
        Suministros suministros = new Suministros(100, 200);
        Equipamiento inventarioMalo = new Equipamiento(suministros, herramientasMalas);
        expedicion.setInventario(inventarioMalo);

        // 3. ASIGNANDO PERSONAL 
        System.out.println("\nAsignando personal al equipo...");
        for (int i = 1; i <= 6; i++) {
            try {
                Investigador inv = new Investigador("Investigador " + i, "General", "Especialista", true);
                expedicion.agregarInvestigador(inv);
            } catch (IllegalArgumentException e) {
                // Va a tirar error cuando llegue a 6
                System.out.println("No se pudo agregar personal: " + e.getMessage());
            }
        }

        // 4. PRIMER INTENTO DE INICIO (Va a fallar y mostrará el LOG de consola)
        System.out.println("\n--- 1er Intento de Inicio ---");
        expedicion.iniciarExpedicion();

        // 5. CORRIGIENDO LOS REQUISITOS 
        if (!expedicion.getEstado().equals("EN CURSO")) {
            System.out.println("\nCorrigiendo problemas climáticos y de inventario...");
            
            // Creamos un clima normal y lo asignamos
            ModuloDeClima climaBueno = new ModuloDeClima(10.0, 40.0, -20.0);
            climaBueno.consultarClima(); // Apaga la alerta
            expedicion.setClima(climaBueno);

            // Creamos herramientas válidas y las asignamos
            Herramientas herramientasBuenas = new Herramientas(2, 2);
            Equipamiento inventarioBueno = new Equipamiento(suministros, herramientasBuenas);
            expedicion.setInventario(inventarioBueno);

            System.out.println("--- 2do Intento de Inicio ---");
            expedicion.iniciarExpedicion();
        }

        // 6. DESARROLLO DE LA MISIÓN
        if (expedicion.getEstado().equals("EN CURSO")) {
            System.out.println("\n--- Desarrollo de la Misión ---");
            
            // Agregamos múltiples hitos usando tu método
            expedicion.inicioCronograma("15/05/2026", "Llegada al campamento base");
            expedicion.inicioCronograma("18/05/2026", "Exploración de la caverna norte");
            expedicion.inicioCronograma("20/05/2026", "Recolección de muestras");

            // Registramos hallazgos exitosos
            expedicion.nuevoHallazgo("Mineral brillante desconocido en la caverna.");
            expedicion.nuevoHallazgo("Fósil prehistórico en el hielo.");
            
            // Forzamos un hallazgo vacío para probar que no se rompe el programa
            try {
                expedicion.nuevoHallazgo("");
            } catch (IllegalArgumentException e) {
                System.out.println("Error al registrar hallazgo: " + e.getMessage());
            }

            // Fin de la expedición (Muestra la bitácora)
            expedicion.finExpedicion();
        }
    }
}