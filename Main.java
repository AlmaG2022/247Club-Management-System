public class Main {
    public static void main(String[] args) {
        // Crear instancias de clientes y proyectos
        Cliente cliente1 = new Cliente("Cliente 1", "Dirección 1", "correo1@example.com");
        Cliente cliente2 = new Cliente("Cliente 2", "Dirección 2", "correo2@example.com");

        Proyecto proyecto1 = new Proyecto("Proyecto 1", cliente1, "En proceso");
        Proyecto proyecto2 = new Proyecto("Proyecto 2", cliente2, "Finalizado");

        // Agregar clientes y proyectos al gestor
        GestorProyectos gestor = new GestorProyectos();
        gestor.agregarCliente(cliente1);
        gestor.agregarCliente(cliente2);

        gestor.agregarProyecto(proyecto1);
        gestor.agregarProyecto(proyecto2);

        // Aquí puedes realizar otras operaciones según sea necesario
    }
}
