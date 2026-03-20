public class Consulta { 
  
    private String fecha; 
    private String motivo; 
    private String diagnostico; 
    private double costo; 
    private boolean requiereCirugia; 
  
    // Constructor 
    public Consulta(String fecha, String motivo, String diagnostico, 
                    double costo, boolean requiereCirugia) { 
        setFecha(fecha); 
        setMotivo(motivo); 
        setDiagnostico(diagnostico); 
        setCosto(costo); 
        this.requiereCirugia = requiereCirugia; 
    } 
  
    // SETTERS con validaciones 
  
    public void setFecha(String fecha) { 
        this.fecha = (fecha == null || fecha.trim().isEmpty()) 
                ? "01/01/2000" 
                : fecha.trim(); 
    } 
  
    public void setMotivo(String motivo) { 
        this.motivo = (motivo == null || motivo.trim().isEmpty()) 
                ? "Sin motivo registrado" 
                : motivo.trim(); 
    } 
  
    public void setDiagnostico(String diagnostico) { 
        this.diagnostico = (diagnostico == null || diagnostico.trim().isEmpty()) 
                ? "Pendiente de diagnóstico" 
                : diagnostico.trim(); 
    } 
  
    public void setCosto(double costo) { 
        this.costo = (costo <= 0) ? 1.0 : costo; 
    } 
  
    public void setRequiereCirugia(boolean requiereCirugia) { 
        this.requiereCirugia = requiereCirugia; 
    } 
  
    // GETTERS 
  
    public String getFecha() { 
        return fecha; 
    } 
  
    public String getMotivo() { 
        return motivo; 
    } 
  
    public String getDiagnostico() { 
        return diagnostico; 
    } 
  
    public double getCosto() { 
        return costo; 
    } 
  
    public boolean isRequiereCirugia() { 
        return requiereCirugia; 
    } 
  
    // MÉTODOS 
  
    public String calcularCategoriaCosto() { 
        if (costo < 50) { 
            return "Bajo"; 
        } else if (costo < 150) { 
            return "Medio"; 
        } else { 
            return "Alto"; 
        } 
    } 
  
    public boolean esCritica() { 
        return requiereCirugia && costo > 200; 
    } 
  
    @Override 
    public String toString() { 
        return "Consulta {" + 
                "\n  Fecha: " + fecha + 
                "\n  Motivo: " + motivo + 
                "\n  Diagnóstico: " + diagnostico + 
                "\n  Costo: $" + costo + 
                "\n  Categoría: " + calcularCategoriaCosto() + 
                "\n  Requiere cirugía: " + (requiereCirugia ? "Sí" : "No") + 
"\n  ¿Es crítica?: " + (esCritica() ? "Sí" : "No") + 
"\n}"; 
} 
}
