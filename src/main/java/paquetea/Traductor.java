/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Victoria
 */
public class Traductor implements Comparable<Traductor> {

    private Map<String, String> traductor;
    private String palabraEs;
    private String palabraExt;

    public Traductor() {
        
    }

    public Traductor(String palabraEs, String palabraExt) {
        traductor = new TreeMap<>();
        this.palabraEs = palabraEs;
        this.palabraExt = palabraExt;
    }

    public Map<String, String> getTraductor() {
        return traductor;
    }

    public void setTraductor(Map<String, String> traductor) {
        this.traductor = traductor;
    }

    public String getPalabraEs() {
        return palabraEs;
    }

    public void setPalabraEs(String palabraEs) {
        this.palabraEs = palabraEs;
    }

    public String getPalabraExt() {
        return palabraExt;
    }

    public void setPalabraExt(String palabraExt) {
        this.palabraExt = palabraExt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("palabraEs=").append(palabraEs);
        sb.append(", palabraPt=").append(palabraExt);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.palabraEs);
        hash = 97 * hash + Objects.hashCode(this.palabraExt);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        if (!Objects.equals(this.palabraEs, other.palabraEs)) {
            return false;
        }
        return Objects.equals(this.palabraExt, other.palabraExt);
    }

    @Override
    public int compareTo(Traductor o) {
        return this.palabraExt.compareToIgnoreCase(o.palabraExt);
    }
    
    //Método para introducir 
    
    //Método para ordenar las palabras extrangeras
    public void guardarPalabra(String palabraExt, String palabraEs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la palabra extranjera:");
        palabraExt = scanner.nextLine();
        System.out.println("Introduce la palabra en español:");
        palabraEs = scanner.nextLine();

        traductor.put(palabraExt, palabraEs);
    }

    //Método para pedir 10 palabras
    public void pedirPalabras() {
        //Pruebas int numPalabras = 2;
        int numPalabras = 10;
        for (int i = 0; i < numPalabras; i++) {
            System.out.println("Palabra número: " + (1 + i));
            guardarPalabra(palabraExt, palabraEs);

        }
    }

    //Método para borrar entradas KEY
    public void borrarEntradas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que palabra quiere borrar?");
        palabraExt = scanner.nextLine();
        traductor.remove(palabraExt);
    }

    //Método para modificar entradas
    public void modificarEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca palabra extranjera: ");
        palabraExt = scanner.nextLine();
        System.out.println("Introduzca nueva palabra en Español");
        String nuevaPalabraEs = scanner.nextLine();
        traductor.replace(palabraExt, nuevaPalabraEs);
        
    }

    //Método para imprimir la lista
    public void imprimirLista() {
        System.out.println("Lista de palabras: ");
        for (String key: traductor.keySet()) {
            System.out.printf("%s --> %s %n", key, traductor.get(key));
        }
    }
    //Mostrar los valores key
    public Set<String> mostrarKey(){
        return this.traductor.keySet();
    }
   //Método mostrar con un Entry
    public void mostrarTodo(){
        for (Map.Entry<String, String> entrada : this.traductor.entrySet())
            System.out.println(entrada.getKey());
    }
    //Método para obtener una lista con las palabras extranjeras
    public List<String> listaPalabrasExtrajeras(){
        List<String> palabrasExtrajeras = new ArrayList<>();
        for (String palabrasExt : traductor.keySet()){
            palabrasExtrajeras.add(palabrasExt);
        } return palabrasExtrajeras;
    }
    
    //Método para obtener las palabras en español
   public List<String> palabrasSpain() {
        List<String> palabrasSpain = new ArrayList<>(traductor.values());
        return palabrasSpain;
    }
}


