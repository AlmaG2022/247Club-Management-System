package clubmanagementsystem;

import java.util.List;

public class GestorProyectos {
    private final List<Cliente> clientes;
    private final List<Proyecto> proyectos;

    public GestorProyectos(List<Cliente> clientes, List<Proyecto> proyectos) {
        this.clientes = clientes;
        this.proyectos = proyectos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }
}