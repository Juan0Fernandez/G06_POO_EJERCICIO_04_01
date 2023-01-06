
package servicio;

import java.util.ArrayList;
import modelo.Asignatura;

public interface AsignaturaService {
    public void anadirAsignatura(Asignatura a);
    public void borrarAsignatura(int i);
    public void modificarAsignatura(int i, Asignatura a);
    public ArrayList<Asignatura> getLista();
}
