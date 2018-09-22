/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Hosanna
 */
public class Empleado extends Persona{
    private int sueldo_bruto;

    public Empleado(String nombre, int edad, int sueldo_bruto) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
        
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    @Override
    public void mostrar(String metodo){
        super.mostrar(metodo);
        System.out.println("Sueldo Bruto: " + sueldo_bruto);
        System.out.println();
    }
    
    public void calcularSalarioNeto(){
        
    }
    
}
