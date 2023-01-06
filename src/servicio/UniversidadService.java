package servicio;

import java.util.ArrayList;
import modelo.Universidad;

public interface UniversidadService {
    public void anadirUniversidad(Universidad u);
    public void borrarUniversidad(int i);
    public void modificarUniversidad(int i, Universidad u);
    public ArrayList<Universidad> getLista();
}
