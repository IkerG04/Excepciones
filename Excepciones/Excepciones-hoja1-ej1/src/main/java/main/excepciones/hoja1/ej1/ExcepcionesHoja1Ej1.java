/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.excepciones.hoja1.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class ExcepcionesHoja1Ej1 {

    public static void main(String[] args) {
        System.out.println("primero");
         boolean datoNoValido = true;
         int dato=0;
         while(datoNoValido){
        try{ 
             System.out.println("Introduzca un numero entero");
             dato=new Scanner(System.in).nextInt();
             datoNoValido=false;
         } catch (InputMismatchException e){
             System.out.println("Has introducido mal el numero,vuelve a introducirlo:");
             dato=new Scanner(System.in).nextInt();
         }
         }
         System.out.println("segundo");
          boolean datosNoValidos = true;
          double datos;
         while(datosNoValidos){
        try{ 
             System.out.println("Introduzca un numero double");
             datos=new Scanner(System.in).nextDouble();
             datosNoValidos=false;
         } catch (Exception d){
             System.out.println("Has introducido mal el numero,vuelve a introducirlo");
             
         }
         }
         
    }
}
