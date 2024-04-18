package clubmanagementsystem;

public class Cliente {
    private final String nombre;
    private final String direccion;
    private final String correoElectronico;

    public Cliente(String nombre, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}