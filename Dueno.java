public class Dueno {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cedula;

    public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setCedula(cedula);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() == 0) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.length() == 0) {
            this.apellido = "Desconocido";
        } else {
            this.apellido = apellido;
        }
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() == 10) {
            this.telefono = telefono;
        } else {
            this.telefono = "0000000000";
        }
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            this.email = "sin@email.com";
            return;
        }

        String[] partes = email.split("@");

        if (partes.length < 2 || !partes[1].contains(".")) {
            this.email = "sin@email.com";
        } else {
            this.email = email;
        }
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.length() == 0) {
            this.cedula = "0000000000";
        } else {
            this.cedula = cedula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean tieneEmailValido() {
        if (!email.contains("@")) {
            return false;
        }

        String[] partes = email.split("@");

        if (partes.length < 2 || !partes[1].contains(".")) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "Nombre: " + getNombreCompleto()
             + "Telefono: " + telefono
             + "Email: " + email
             + "Cedula: " + cedula;
    }
}