/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verduleria_by.me;

import com.sun.source.tree.IfTree;

/**
 *
 * @author darygarav
 */
public class validacionesByme {
    
   public boolean validadorOp (int op){
       
       if (op >=1 && op<= 5 ) {
           return true;
           
       }else{
           System.out.println("Valor ingresado no valido");
           return false;
       }
   }
   
   
   public boolean validadorDerut(int nu) {
       if (nu>=10000000 && nu<=99999999) {
           
           return true;
       }else {
           return false;
       }
   }
    


   public boolean validarRut(int rut, char dv) {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;

        }
        return Character.toUpperCase(dv) == (char) (s != 0 ? s + 47 : 75);
    }
   
   
}