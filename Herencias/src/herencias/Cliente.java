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
public class Cliente extends Persona{
    private int telefono_de_contacto;

    public Cliente(String nombre, int edad, String nombre_empresa, int telefono_de_contacto) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    @Override
    public void mostrar(String metodo){
        super.mostrar(metodo);
        System.out.println("Telefono de contacto: " + telefono_de_contacto);
        System.out.println();
    }
    
}
