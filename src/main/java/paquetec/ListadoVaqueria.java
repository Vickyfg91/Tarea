/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Victoria
 */
public class ListadoVaqueria {

    private Map<Integer, VaqueriaOrdenada> listadoVaquerias;

    public ListadoVaqueria() {
        this.listadoVaquerias = new HashMap<>();
    }

    public Map<Integer, VaqueriaOrdenada> getListadoVaquerias() {
        return listadoVaquerias;
    }

    public void setListadoVaquerias(Map<Integer, VaqueriaOrdenada> listadoVaquerias) {
        this.listadoVaquerias = listadoVaquerias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.listadoVaquerias);
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
        final ListadoVaqueria other = (ListadoVaqueria) obj;
        return Objects.equals(this.listadoVaquerias, other.listadoVaquerias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListadoVaqueria{");
        sb.append("listadoVaquerias=").append(listadoVaquerias);
        sb.append('}');
        return sb.toString();
    }
    
    //Método para encontrar vaquerias por id
    public VaqueriaOrdenada encontrarVaqueria(int id){
        return listadoVaquerias.get(id);
        
    }
    
    //Método imprimir lista de vaquerias
    public void listadoVaquerias(){
        listadoVaquerias.forEach((k, v) -> System.out.println(v));
    }
    
    //Método para obtener una vqueria
    public void obtenerListadoVq(){
        ArrayList<VaqueriaOrdenada> listadoVq = new ArrayList<>();
        listadoVq = listadoVaquerias.values();
                
    }
        
}
