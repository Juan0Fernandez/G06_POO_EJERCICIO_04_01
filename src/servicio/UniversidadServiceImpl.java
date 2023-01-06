package servicio;

import java.util.ArrayList;
import modelo.Carrera;
import modelo.Universidad;

public class UniversidadServiceImpl implements UniversidadService{
    private ArrayList<Universidad> lstUniversidad = new ArrayList<>();
    
    @Override
    public void anadirUniversidad(Universidad u){
        lstUniversidad.add(u);
    }

    @Override
    public void borrarUniversidad(int i) {
        lstUniversidad.remove(i);
    }

    @Override
    public ArrayList<Universidad> getLista() {
        return lstUniversidad;
    }

    @Override
    public void modificarUniversidad(int i, Universidad u) {
        lstUniversidad.set(i,u);
    }
    
}
