/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class Herencias {
    
    public Herencias() {
        home();
    }

    public void home(){
        int word;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu" .toUpperCase());
        System.out.println();
        System.out.println("1. Ingresar Empleado");
        System.out.println("2. Ingresar Cliente");
        System.out.println("3. Ingresar Directivo");
        System.out.println();
        
        System.out.println("Escoja una opcion");
        System.out.print("--> ");
        word = sc.nextInt();
        System.out.println();
        
        if(word == 1){            
            D_empleados();
            System.out.println("************************************************");
            System.out.println();
        }else if(word == 2){
            D_cliente();
            System.out.println("************************************************");
            System.out.println();
        }else if(word == 3){
            D_directivo();
            System.out.println("************************************************");
            System.out.println();
        }else{
            System.out.println("       || error de eleccion ||" .toUpperCase());
            System.out.println();
            System.out.println("************************************************");
            home();
            System.out.println();
            System.out.println("************************************************");
        }
    }
      
        public void D_empleados(){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        
        String word;
        String num;
        String sueld;
        String arreEmpleado[][] = new String[1000][3];
       
        
        System.out.println("Ingrese el nombre: ");
        System.out.print("--> ");
        word = sc.nextLine();
        System.out.println();  
        System.out.println("Ingrese la edad: ");
        System.out.print("--> ");       
        num = sc.nextLine();       
        System.out.println();
        System.out.println("Sueldo Bruto: ");
        System.out.print("--> ");
        sueld = sc.nextLine();
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        
        
        arreEmpleado[0 + contador][0] = word;
        arreEmpleado[0 + contador ][1] = num;
        arreEmpleado[0 + contador][2] = sueld;
      
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arreEmpleado[i][j] + " ");    
            }
            System.out.println(" ");
        }
        contador++;
        
        System.out.println();
        System.out.println("************************************************");
        home();
        System.out.println();
        System.out.println("************************************************");
        
    }
    
    public void D_cliente(){
        int contador = 0;
        Scanner sc = new Scanner(System.in);   
        String palabra;
        String numero;    
        String empresa = "";
        String sueldo = "";
        String arreCliente[][] = new String[1000][4];
        
        System.out.println("Ingrese el nombre: ");
        System.out.print("--> ");
        palabra = sc.nextLine();
        System.out.println();  
        System.out.println("Ingrese la edad: ");
        System.out.print("--> ");
        numero = sc.nextLine();
        System.out.println();
        System.out.println("Nombre de la empresa: ");
        System.out.print("--> ");
        empresa = sc.nextLine();
        System.out.println();
        System.out.println("Sueldo Bruto: ");
        System.out.print("--> ");
        sueldo = sc.nextLine();
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        
        arreCliente[0 + contador][0] = palabra;
        arreCliente[0 + contador ][1] = numero;
        arreCliente[0 + contador][2] = empresa;
        arreCliente[0 + contador][3] = sueldo;
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.print(arreCliente[i][j] + " ");    
            }
            System.out.println(" ");
            
        }
        contador++;
        
        System.out.println();
        System.out.println("************************************************");
        home();
        System.out.println();
        System.out.println("************************************************");

    }
    
    public void D_directivo(){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        String word;
        String num;
        String categoria;
        String arreDirectivo[][] = new String[1000][3];
        
        System.out.println("Ingrese el nombre: ");
        System.out.print("--> ");
        word = sc.nextLine();
        System.out.println();  
        System.out.println("Ingrese la edad: ");
        System.out.print("--> ");
        num = sc.nextLine();
        System.out.println();
        System.out.println("Categoria: ");
        System.out.print("--> ");
        categoria = sc.nextLine();
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        
        arreDirectivo[0 + contador][0] = word;
        arreDirectivo[0 + contador ][1] = num;
        arreDirectivo[0 + contador][2] = categoria;
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arreDirectivo[i][j] + " ");    
            }
            System.out.println(" ");
            
        }
        contador++;
        
        System.out.println();
        System.out.println("************************************************");
        home();
        System.out.println();
        System.out.println("************************************************");

    }
    
    
    public static void main(String[] args) {
        
        /*Empleado emp = new Empleado("Gerson", 25, 2545);
        Cliente cli = new Cliente("Juan", 36, "HCH", 548752);
        Directivo dir = new Directivo("German", 45, "Gerente");
        
        emp.mostrar("Datos");       
        cli.mostrar("Datos");
        dir.mostrar("Datos");*/

        Herencias call = new Herencias();
        call.home();
    
    } 
         
}