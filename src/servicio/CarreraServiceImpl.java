/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import modelo.Carrera;

public class CarreraServiceImpl implements CarreraService{
    
    private ArrayList<Carrera> lstCarrera = new ArrayList<>();

    @Override
    public void anadirCarrera(Carrera c) {
        lstCarrera.add(c);
    }

    @Override
    public void borrarCarrera(int i) {
        lstCarrera.remove(i);
    }

    @Override
    public void modificarCarrera(int i, Carrera c) {
        lstCarrera.set(i, c);
    }

    @Override
    public ArrayList<Carrera> getLista() {
        return lstCarrera;
    }
    
}
