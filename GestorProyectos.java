import java.util.ArrayList;
import java.util.List;

public class GestorProyectos {
    private List<Cliente> clientes;
    private List<Proyecto> proyectos;

    public GestorProyectos() {
        this.clientes = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    // Métodos para seguimiento de proyectos, búsqueda y filtrado de clientes, etc.
}
