/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verduleria_by.me;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Verduleria_byMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      
        Scanner ls = new Scanner (System.in);
        
        int opcion ;
        String ejemplo= "este_es_un_ejemplo";
        int rut,telefono;
        char dv;
        String nom,meil,direccion;
        
        int ops;
        boolean trigger1,trigger2;
       validacionesByme valida= new validacionesByme();
       Cliente cliente1= new Cliente();
       Cliente cliente2= new Cliente();
               
          
        
        do {            
            
        
            System.out.println("---- Hola Bienvenido a su verduleria Juanito ----");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Solicitud y sus Productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Ver Solicitud");
            System.out.println("5. Salir");

            opcion = ls.nextInt();
            trigger1=valida.validadorOp(opcion);

                switch (opcion) {
                    case 1:
                        
                        do {                            
                            System.out.println("Ingrese su Rut (sin digito verificador):");
                            rut= ls.nextInt();
                            
                            trigger2=valida.validadorDerut(rut);
                        
                            
                            
                        } while (trigger2==false);
                        
                        cliente1.setRut(rut);
                        System.out.println("su rut es: "+cliente1.getRut());
                        
                          
                           System.out.println("Ingrese su digito verificador (si termina en :");
                                dv= ls.next().charAt(0);
                                
                                
                                System.out.println("Ingrese su nombre:");
                                nom= ls.next();
                                
                                
                                
                                
                                
                                
                                
                                
                            
                                    
                            
                            
                    
                        
                            

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("  ");
                        System.out.println("Adios!"); 
                        break;
                    default:

                        throw new AssertionError();
                }
        } while (trigger1==false);
        
          
    
           
        }
    }
   
 

        
