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
public class Directivo extends Persona{
    private String categoria;

    public Directivo(String nombre, int edad, String categoria) {
        super(nombre, edad);
        this.categoria = categoria;
    }

    

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void mostrar(String metodo){
        super.mostrar(metodo);
        System.out.println("Categoria: " + categoria);
        System.out.println();
    }
    
    
}
