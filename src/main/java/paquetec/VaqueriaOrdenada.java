/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Victoria
 */
public class VaqueriaOrdenada {

   private Set<Vaca> vaqueriaOrdenada;

    public VaqueriaOrdenada() {

        this.vaqueriaOrdenada = new TreeSet<>();

        vaqueriaOrdenada.add(new Vaca(1, "Vaca frisona, de color negro", LocalDate.of(2020, 4, 21)));
        vaqueriaOrdenada.add(new Vaca(2, "Vaca charolaise, de color marrón", LocalDate.of(2019, 7, 18)));
        vaqueriaOrdenada.add(new Vaca(3, "Vaca Holstein, de color blanco y negro", LocalDate.of(2022, 2, 2)));
        vaqueriaOrdenada.add(new Vaca(4, "Vaca Angus, de color negro", LocalDate.of(2022, 2, 2)));

    }
    // Método para saber el número de vacas

    public int numeroDeVacas() {
        return vaqueriaOrdenada.size();
    }

    // Método para añadir una vaca a la vaquería
    public void agregarVaca(Vaca vaca) {
        vaqueriaOrdenada.add(vaca);
    }
    //Método para comprobar si esta ordenada
    public void listaOrdenada(){
    for (Vaca vaquita : vaqueriaOrdenada) {
            System.out.println(vaquita);
        }
    }
    // Método para saber si la vaquería tiene vacas
    public boolean tieneVacas() {
        return vaqueriaOrdenada.isEmpty();
    }

    // Método para saber si un animal está en la vaquería
    public boolean animalEnVaqueria(Vaca vaca) {
        return vaqueriaOrdenada.contains(vaca);
    }

    //Método para imprimir los animale como ArrayList
    public void imprimirLista() {
        for (Vaca vaquitas : vaqueriaOrdenada) {
            //vaqueria.forEach(System.out::println);
            System.out.println(vaquitas);
        }
    }
    
    

    // Método para borrar una vaca por ID
     public void borrarVacaPorId(int id) {
        Iterator<Vaca> iterator = vaqueriaOrdenada.iterator();
        while (iterator.hasNext()) {
            Vaca vaca = iterator.next();
            if (vaca.getId() == id) {
                iterator.remove();
            }
        }
    }
}
