/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main.excepciones.hoja1.ej3;

import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class ExcepcionesHoja1Ej3 {

    public static void main(String[] args) {
        int x;
        boolean valido = true;
        do {
            System.out.println("Introduce el valor de x,entre 0 y 100");
            try {
                x = new Scanner(System.in).nextInt();
                valido = true;
                if (x < 0 || x > 100) {
                    throw new Exception("No es un numero entre 1 y 100,por favor,vuelve a introducir un numero");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                valido = false;
            }
        } while (!valido);
        valido = false;

    }
}
