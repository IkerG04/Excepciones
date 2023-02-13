/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main.excepciones.hoja1.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class ExcepcionesHoja1Ej2 {

    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int result=0;
        boolean division = true;
        do{
            System.out.println("Introduce un valor entero");
            try{
                num1=new Scanner(System.in).nextInt();
                division=true;
            }catch (InputMismatchException io){
                System.out.println("Tipo de dato incorrecto,vuelve a intentarlo");
            }
        }while(!division);
        division=false;
        do{
            System.out.println("Introduce un numero entero");
            try{
                num2= new Scanner(System.in).nextInt();
                division=true;
            } catch (ArithmeticException io){
                System.out.println("La division se divide entre 0,por favor,introduzca otros numeros");
            }
        }while(!division);
        division=false;
        }
        
}
        
           
            
        
    
         
    
