package co.edu.udea.edatos.dao.impl;

import co.edu.udea.edatos.dao.EmpleadoDAO;
import co.edu.udea.edatos.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOList implements EmpleadoDAO {
    public static List<Empleado> empleadoBD = new ArrayList<>();

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoBD.add(empleado);
        System.out.println("Empleado guardado en DAO "+empleado.toString());


    }

    @Override
    public Empleado consultarEmpleadoPorIdentificacion(String id) {
        for (Empleado e: empleadoBD){
            if (id.equals(e.getIdentificacion())){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Empleado> conusltarEmpleados() {
        return empleadoBD;
    }
}
