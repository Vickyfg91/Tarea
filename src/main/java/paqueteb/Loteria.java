/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Victoria
 */
public class Loteria {

    private String numDecimo;
    private int premio;
    private Map<String, Integer> loteria;

    public Loteria() {
        this.loteria = new HashMap<>();
         for (int i = 1; i <= 1000; i++) {
             // Asegura que haya ceros a la izquierda
            String numDecimo = String.format("%05d", i); 
            // Premio aleatorio entre 0 y 9999
            int premio = (int) (Math.random() * 10000); 
            
        }
        
    }

    public Loteria(String numDecimo, int premio, LinkedHashMap<String, Integer> loteria) {
        this.numDecimo = numDecimo;
        this.premio = premio;
        this.loteria = new LinkedHashMap<>();
    }

    public String getNumDecimo() {
        return numDecimo;
    }

    public void setNumDecimo(String numDecimo) {
        this.numDecimo = numDecimo;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public Map<String, Integer> getLoteria() {
        return loteria;
    }

    public void setLoteria(Map<String, Integer> loteria) {
        this.loteria = loteria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loteria{");
        sb.append("numDecimo=").append(numDecimo);
        sb.append(", premio=").append(premio);
        sb.append(", loteria=").append(loteria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.numDecimo);
        hash = 83 * hash + this.premio;
        hash = 83 * hash + Objects.hashCode(this.loteria);
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
        final Loteria other = (Loteria) obj;
        if (this.premio != other.premio) {
            return false;
        }
        if (!Objects.equals(this.numDecimo, other.numDecimo)) {
            return false;
        }
        return Objects.equals(this.loteria, other.loteria);
    }
    //Método para mostrar los registros
    
   
    // Método para añadir registros
    public void agregarRegistro(String numDecimo, int premio) {
        loteria.put(numDecimo, premio);
    }
    
    public int consultarPremio(String numDecimo) {
        return loteria.getOrDefault(numDecimo, -1); // Devuelve -1 si no se encuentra el número
    }
    
    

}
