/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetea;

import java.util.List;
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
        

        //Se elige el treeMap ya que necesitamos que la palabra ext lleve un orden alfabetico
        Traductor traductor = new Traductor();
        
        //Llamamos al método que solicita palabras al usuario
        System.out.println("Introduzca 10 palabras");
        traductor.pedirPalabras();
        
        //Imprimir la lista de palabras
        traductor.imprimirLista();
        //Borrar una entrada
        System.out.println("---------Vamos a borrar una palabra-------");
        traductor.borrarEntradas();
        System.out.println("----Así queda la lista de traducciones----");
        traductor.imprimirLista();
        //Modificar una entrada
        System.out.println("Vamos a modicar la traducción de una palabra");
        traductor.modificarEntrada();
        System.out.println("----Así queda la lista de traducciones----");
        traductor.imprimirLista();
        List<String> palabrasExtrajeras = traductor.listaPalabrasExtrajeras();
        List<String> palabrasSpain = traductor.palabrasSpain();
        System.out.println("Lista de palabras extranjeras: \n" + palabrasExtrajeras);
        System.out.println("Lista de palabras en español: \n" + palabrasSpain);
        
 
        

    }

}
