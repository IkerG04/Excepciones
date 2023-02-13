/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main.excepciones.hoja7.ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class ExcepcionesHoja7Ej5 {

    public static int dividir(int dividendo,int divisor ) {
        int resul=0;     
            try{
                if(divisor==0){
                    throw new ArithmeticException();
                }
                resul=dividendo/divisor;
            }catch(ArithmeticException Ae){
                System.out.println("Division entre 0,no se realiza la operación");
            }
    return resul;
    }

    public static int IntroducirEntero(){
        boolean valido=false;
        int num=0;
        
        do{
            System.out.println("Introduce un valor entero:");
            try{
                num= new Scanner(System.in).nextInt();
                valido=true;
            }catch(InputMismatchException Ae){
                System.out.println("Tipo de dato incorrecto,vuelve a intentarlo"); 
            }
        }while(!valido);
        valido=false;
    return num;
    }
    public static void main(String[] args) {
   int num1,num2;
   int resul=0;
   num1=IntroducirEntero();
   num2=IntroducirEntero();
   resul=dividir(num1,num2);
   System.out.println("El resultado es "+resul);
    }
}
