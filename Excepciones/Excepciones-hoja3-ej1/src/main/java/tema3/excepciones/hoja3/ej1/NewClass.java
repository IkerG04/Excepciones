/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.excepciones.hoja3.ej1;
import java.lang.String;
/**
 *
 * @author iker
 */
public class NewClass {

    public static void main(String[] args){
          try {
               throw new Exception("Esto es una ExcepciÃ³n");
           } catch(Exception e) {
             System.out.println("Se produjo un excepciÃ³n: " + e.getMessage());
           } finally {
             System.out.println("Esto se ejecuta sin importar si se presentan errores");
          }
      }
}
