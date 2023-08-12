package Hijo;

import padre.Empleado;

public class ScrumMaster extends Empleado {

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private String departamento;

    public ScrumMaster(String nombre, double sueldo,String chuchito) {
        super(nombre, sueldo);
        this.departamento = chuchito;

    }
 @Override
    public String obtenerDetalles(){
        return "Desde hijo : " + this.getNombre() + ", sueldo: " + this.getSueldo() + " Dire "  + this.getDepartamento();
    }
}
