
package controlador;

import java.util.ArrayList;
import modelo.Asignatura;
import servicio.AsignaturaServiceImpl;

public class ControladorAsignatura {
    private AsignaturaServiceImpl asigServImpl =  new AsignaturaServiceImpl();
    
    private boolean validarNumeros(int cred, int numEst, int niv){
        if(cred<=0 || numEst<=0){
            
            return false;
        }
        return true;
    }
    
    private boolean validarInfo(String cod, String nom){
        if(nom.length()==0 || cod.length()==0 ){
            return false;
        }
        return true;
    }
    
    public boolean anadirAsignatura(String cod, String nom, int niv, int cred, int numEst){
        
        if(validarNumeros(cred, numEst, niv) && validarInfo(cod, nom)){
            asigServImpl.anadirAsignatura(new Asignatura(cod, nom, niv, cred, numEst));
            return true;
        }else{
            
            System.err.println("Datos mal ingresados");
            return false;
        }
    }
    
    public void borrarAsignatura(int i){
        asigServImpl.borrarAsignatura(i);
    }
    
    public boolean modificarAsignatura(int i,String cod, String nom, int niv, int cred, int numEst){
        if(validarNumeros(cred, numEst, niv) && validarInfo(cod, nom) ){
            asigServImpl.modificarAsignatura(i,new Asignatura(cod, nom, niv, cred, numEst));
            return true;
        }else{
            System.err.println("Datos mal ingresados");
            return false;
        }
    }
    
    public ArrayList<Asignatura> getLista(){
        return asigServImpl.getLista();
    }
}
