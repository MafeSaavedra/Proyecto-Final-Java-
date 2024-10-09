import java.util.HashSet;
import java.util.Set;

public class Escuela {
    private Set<Estudiante> estudiantes;

    // Constructor
    public Escuela() {
        estudiantes = new HashSet<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getNumeroIdentificacion() == estudiante.getNumeroIdentificacion()) {
                System.out.println("Error: Número de identificación ya existe.");
                return false;
            }
        }
        return estudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(int numeroIdentificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroIdentificacion() == numeroIdentificacion) {
                return estudiante;
            }
        }
        return null;
    }

    public boolean actualizarEstudiante(int numeroIdentificacion, String nuevoNombre, double nuevaCalificacion) {
        Estudiante estudiante = buscarEstudiante(numeroIdentificacion);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setCalificacion(nuevaCalificacion);
            return true;
        }
        return false;
    }

    public boolean eliminarEstudiante(int numeroIdentificacion) {
        Estudiante estudiante = buscarEstudiante(numeroIdentificacion);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }
}
