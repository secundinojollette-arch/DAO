public class Main {
    public static void main(String[] args) {
        DAO<Estudiante> estudianteDAO = new EstudianteDAOArchivo();

        Estudiante nuevoEstudiante = new Estudiante(2525035, "Jollette plata Secundino");
        estudianteDAO.guardar(nuevoEstudiante);

        for (Estudiante e : estudianteDAO.obtenerTodos()) {
            System.out.println("ID: " + e.getId() + " | Nombre: " + e.getNombre());
        }
    }
}