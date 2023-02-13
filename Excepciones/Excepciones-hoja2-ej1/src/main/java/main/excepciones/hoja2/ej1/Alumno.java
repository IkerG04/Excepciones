/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.excepciones.hoja2.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW106
 */
public class Alumno {

    String nombre;
    int[] notas;

    public Alumno(int n) {
        System.out.println("Nombre:");
        nombre = new Scanner(System.in).nextLine();
        notas = new int[n];
        boolean valido = false;
        do {
            try {
                for (int i = 0; i < notas.length; i++) {
                    System.out.println("Nota numero " + (1 + i));
                    notas[i] = new Scanner(System.in).nextInt();
                    if (notas[i] < 0 || notas[i] > 10) {
                        throw new Exception("La nota no esta en el rango entre 0 y 10");
                    }
                }
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("La nota no es numerica");
            } catch (Exception e) {
                e.getMessage();
            }
        } while (!valido);
        valido = false;
    }

}
