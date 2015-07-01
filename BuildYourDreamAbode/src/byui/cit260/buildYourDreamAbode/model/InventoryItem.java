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
public class InventoryItem implements Serializable {
    
    //class instance variable
    private int beds;
    private int tables;
    private int chairs;
    private int couches;
    private int paint;
    private int requiredAmount;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.beds;
        hash = 71 * hash + this.tables;
        hash = 71 * hash + this.chairs;
        hash = 71 * hash + this.couches;
        hash = 71 * hash + this.paint;
        hash = 71 * hash + this.requiredAmount;
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.beds != other.beds) {
            return false;
        }
        if (this.tables != other.tables) {
            return false;
        }
        if (this.chairs != other.chairs) {
            return false;
        }
        if (this.couches != other.couches) {
            return false;
        }
        if (this.paint != other.paint) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "beds=" + beds + ", tables=" + tables + ", chairs=" + chairs + ", couches=" + couches + ", paint=" + paint + ", requiredAmount=" + requiredAmount + '}';
    }

    public InventoryItem() {
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getCouches() {
        return couches;
    }

    public void setCouches(int couches) {
        this.couches = couches;
    }

    public int getPaint() {
        return paint;
    }

    public void setPaint(int paint) {
        this.paint = paint;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    
}