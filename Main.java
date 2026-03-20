
public class Main {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Sistema - Clinica Veterinaria ");
        System.out.println("======================================");
        // ── Integrante 1: Mascota ────────────────────────────────
        Mascota mascota = new Mascota("Firulais", "Perro", "Labrador", 4, 25.0);
        System.out.println("\n" + mascota.toString());
        System.out.println("Es adulto : " + mascota.esAdulto());
        System.out.println("Peso normal : "
                + mascota.estaEnPesoNormal(20.0, 30.0));
        // ── Integrante 2: Dueno ──────────────────────────────────
        Dueno dueno = new Dueno("Carlos", "Perez",
                "0991234567",
                "carlos@gmail.com",
                "1756234890");
        System.out.println("\n" + dueno.toString());
        System.out.println("Nombre completo : " + dueno.getNombreCompleto());
        System.out.println("Email valido : " + dueno.tieneEmailValido());
        // ── Integrante 3: Consulta ───────────────────────────────
        Consulta consulta = new Consulta("15/03/2025",
                "Revision general",
                "Animal saludable",
                45.0, false);
        System.out.println("\n" + consulta.toString());
        System.out.println("Categoria costo : "
                + consulta.calcularCategoriaCosto());
        System.out.println("Es critica : " + consulta.esCritica());
        // ── Integrante 4 (opcional): Veterinario ─────────────────
        // Si el grupo NO tiene Integrante 4, comenta las 4 lineas de abajo
        Veterinario vet = new Veterinario("Ana", "Gomez",
                "VET-001", "Cirugia", 7);
        System.out.println("\n" + vet.toString());
        System.out.println("Es especialista : " + vet.esEspecialista());
        System.out.println("\n=====================================");
    }
}
