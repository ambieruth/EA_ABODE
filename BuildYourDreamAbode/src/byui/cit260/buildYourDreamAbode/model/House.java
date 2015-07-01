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
public class House implements Serializable {
    
    //class instance variables
    private String description;
    private int numberOfBedrooms;
    private double numberOfBathrooms;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.numberOfBedrooms;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numberOfBathrooms) ^ (Double.doubleToLongBits(this.numberOfBathrooms) >>> 32));
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
        final House other = (House) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.numberOfBedrooms != other.numberOfBedrooms) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfBathrooms) != Double.doubleToLongBits(other.numberOfBathrooms)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "House{" + "description=" + description + ", numberOfBedrooms=" + numberOfBedrooms + ", numberOfBathrooms=" + numberOfBathrooms + '}';
    }

    public House() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    
}