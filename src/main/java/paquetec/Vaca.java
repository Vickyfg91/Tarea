/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;


import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Victoria
 */
public class Vaca implements Comparable<Vaca> {
    
    //Atributos
    private int id;
    private String descripcion;
    private LocalDate fechaNacimiento;

    public Vaca() {
    }

    public Vaca(int id, String descripcion, LocalDate fechaNacimiento) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaNacimiento = fechaNacimiento;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.descripcion);
        hash = 29 * hash + Objects.hashCode(this.fechaNacimiento);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("id=").append(id);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
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
        final Vaca other = (Vaca) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.fechaNacimiento, other.fechaNacimiento);
    }
    
  /*  @Override
    public int compareTo(Vaca o) {
        return this.id.compareToIgnoreCase(o.id);
    }*/

    @Override
    public int compareTo(Vaca otraVaca) {
        return Integer.compare(this.id, otraVaca.id);
    }
    
}
