package clubmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Proyecto> proyectos = new ArrayList<>();

        // Crear instancias de la interfaz de usuario, seguridad y exportador de datos
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        Seguridad seguridad = new Seguridad();
        ExportadorDatos exportadorDatos = new ExportadorDatos();

        // Mostrar el menú de opciones al usuario
        interfazUsuario.mostrarMenu();

        // Implementar la lógica para interactuar con el usuario, gestionar clientes y proyectos, etc.

        // Ejemplo de uso de la seguridad
        String nombreUsuario = "usuario";
        String contraseña = "contraseña";
        if (seguridad.autenticarUsuario(nombreUsuario, contraseña)) {
            System.out.println("Usuario autenticado correctamente");
        } else {
            System.out.println("Error de autenticación");
        }

        // Ejemplo de uso del exportador de datos
        Cliente cliente = new Cliente("Nombre Cliente", "Dirección Cliente", "correo@cliente.com");
        Proyecto proyecto = new Proyecto("Nombre Proyecto", cliente, "En proceso");
        exportadorDatos.exportarDatos(cliente, proyecto);
    }
}