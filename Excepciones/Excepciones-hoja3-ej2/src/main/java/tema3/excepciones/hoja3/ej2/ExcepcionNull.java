/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.excepciones.hoja3.ej2;

/**
 *
 * @author iker
 */
class ExcepcionNull {

    String s = "ejercico 2 sobre Excepciones";

    String getString() {
        return s;
    }

    public static void main(String[] args) {
        ExcepcionNull en = null;
        try {
            en.getString();
        } catch (Exception e) {
            System.out.println("Se produjo una expción. " + e.getMessage());
        }
    }
}
