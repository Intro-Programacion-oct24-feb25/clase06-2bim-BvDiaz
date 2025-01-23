/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo093 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingrese un país: ");
                String pais = entrada.nextLine();

                char primerCaracter = Character.toUpperCase(pais.charAt(0));

                if (primerCaracter == 'A' || primerCaracter == 'E' || 
                    primerCaracter == 'I' || primerCaracter == 'O' || 
                    primerCaracter == 'U') {
                    throw new Exception("El país no comienza con una consonante.");
                } else {
                    System.out.printf("El pais es: %s\n", pais);
                    bandera = false;
                }
            } catch (Exception e) {
                System.out.println("Excepción: " + e.getMessage());
            }
        }
    }
}
