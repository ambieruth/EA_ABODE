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
 * @author ElisaHutchings
 */
public class SupplyStore implements Serializable {
    
    //class instance variables
    private String description;
    private double travelTime;
    private String blocked;
    private String symbol;
    private double noOfItems;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.blocked);
        hash = 71 * hash + Objects.hashCode(this.symbol);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.noOfItems) ^ (Double.doubleToLongBits(this.noOfItems) >>> 32));
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
        final SupplyStore other = (SupplyStore) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noOfItems) != Double.doubleToLongBits(other.noOfItems)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SupplyStore{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", symbol=" + symbol + ", noOfItems=" + noOfItems + '}';
    }

    public SupplyStore() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(double noOfItems) {
        this.noOfItems = noOfItems;
    }
    
    
}
