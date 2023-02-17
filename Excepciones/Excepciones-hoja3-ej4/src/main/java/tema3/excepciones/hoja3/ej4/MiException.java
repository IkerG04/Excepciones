/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.excepciones.hoja3.ej4;

/**
 *
 * @author iker
 */
public class clase extends Exception {
    String mensaje;
       public clase(String mensaje) {
           this.mensaje = mensaje;
       }
        public String getMensaje() {
            return mensaje;
        }
    }
    
   public class PropiaClaseExcepcion {
      public static void main(String[] args) {
           try {
               throw new Excepcion("mi propia Excepción");
           } catch(MiExcepcion e) {
              System.out.println("excepción: " + e.getMensaje());
           }        
       }
   }
  