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
    private double numberOfBedrooms;
    private double numberOfBathrooms;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.numberOfBedrooms) ^ (Double.doubleToLongBits(this.numberOfBedrooms) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.numberOfBathrooms) ^ (Double.doubleToLongBits(this.numberOfBathrooms) >>> 32));
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
        if (Double.doubleToLongBits(this.numberOfBedrooms) != Double.doubleToLongBits(other.numberOfBedrooms)) {
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

    public double getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(double numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void getDescription(String your_new_home_is_now_built_Now_it_is_time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getNumberOfBedrooms(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getNumberOfBathrooms(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}