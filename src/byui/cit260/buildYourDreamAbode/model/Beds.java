/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ambiesnell
 */
public class Beds implements Serializable {
    
    private double length;
    private double width; 

    public Beds() {
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Beds{" + "length=" + length + ", width=" + width + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.length);
        hash = 67 * hash + Objects.hashCode(this.width);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Beds other = (Beds) obj;
        if (!Objects.equals(this.length, other.length)) {
            return false;
        }
        if (!Objects.equals(this.width, other.width)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
