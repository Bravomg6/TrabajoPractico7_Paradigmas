public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE EXPEDICIONES ===\n");

        // 1. Crear Expedición
        Expedicion expedicion = new Expedicion();
        expedicion.setNombre("Misión Amazonas");
        expedicion.setDestino("Selva Amazónica");
        System.out.println("Código generado: " + expedicion.getCodigo());

        // 2. Configurar Clima (Clima normal, sin alertas)
        ModuloDeClima clima = new ModuloDeClima(25.0, 40.0, -10.0);
        clima.consultarClima(); // Actualiza la alerta
        expedicion.setClima(clima);

        // 3. Configurar Equipamiento (Con herramientas esenciales para que apruebe)
        Herramientas herramientas = new Herramientas(101, 202); 
        Suministros suministros = new Suministros(50, 100);
        Equipamiento inventario = new Equipamiento(suministros, herramientas);
        expedicion.setInventario(inventario);

        // 4. Agregar Investigadores (Manejo de la excepción de cupo)
        try {
            Investigador inv1 = new Investigador("Dr. Alan", "Biología", "Líder", true);
            Investigador inv2 = new Investigador("Dra. Ellie", "Botánica", "Senior", true);
            
            expedicion.agregarInvestigador(inv1);
            expedicion.agregarInvestigador(inv2);
            
            // Si intentaras agregar 6 investigadores aquí, el sistema lanzaría el error y no dejaría.
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n--- Validación e Inicio ---");
        // 5. Iniciar la expedición (Aquí entra en juego tu clase Requisitos)
        expedicion.iniciarExpedicion();

        // 6. Cronograma y Hallazgos
        if (expedicion.getEstado().equals("EN CURSO")) {
            System.out.println("\n--- Desarrollo de la Misión ---");
            expedicion.inicioCronograma("15/05/2026", "Llegada al campamento");
            
            Hallazgo hallazgo1 = new Hallazgo("Se descubrió una nueva especie de orquídea.");
            expedicion.nuevoHallazgo(hallazgo1);
            
            // 7. Fin de la misión
            expedicion.finExpedicion();
        }
    }
}