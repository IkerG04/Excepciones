/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.excepciones.hoja3.ej3;

/**
 *
 * @author iker
 */
public class clase {
    int[] array = {0, 1, 2, 3, 4, 5};
        int getValor(int indice) {
           return array[indice];
        }
        
       public static void main(String[] args) {
            clase ea = new clase();
           try {
               ea.getValor(6);
          } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Excepción: indice de array fuera de limites" + e.getMessage());
          }
       }
   }