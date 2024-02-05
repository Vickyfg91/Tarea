/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Loteria loteria = new Loteria();
        
        System.out.println("Ingrese el número del décimo para consultar el premio:");
        String numDecimo = scanner.next();

        int premio = loteria.consultarPremio(numDecimo);
        if (premio != -1) {
            System.out.println("¡Enhorabuena! Su premio es:" + premio);
        } else {
            System.out.println("Lo siento, el décimo ingresado no fue premiado.");
        }
    }
    
}
