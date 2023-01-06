
package servicio;

import java.util.ArrayList;
import modelo.Asignatura;

public class AsignaturaServiceImpl implements AsignaturaService{

    private ArrayList<Asignatura> lstAsig= new ArrayList<>();
    
    @Override
    public void anadirAsignatura(Asignatura a) {
        lstAsig.add(a);
    }

    @Override
    public void borrarAsignatura(int i) {
        lstAsig.remove(i);
    }

    @Override
    public void modificarAsignatura(int i, Asignatura a) {
        lstAsig.set(i, a);
    }

    @Override
    public ArrayList<Asignatura> getLista() {
        return lstAsig;
    }
    
}
