/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.model;

import java.io.Serializable;

/**
 *
 * @author ElisaHutchings
 */
public class DesignerInventory implements Serializable{
    
    private int beds;
    private int tables;
    private int chairs;
    private int couches;
    private int paint;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.beds;
        hash = 79 * hash + this.tables;
        hash = 79 * hash + this.chairs;
        hash = 79 * hash + this.couches;
        hash = 79 * hash + this.paint;
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
        final DesignerInventory other = (DesignerInventory) obj;
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
        return true;
    }

    @Override
    public String toString() {
        return "DesignerInventory{" + "beds=" + beds + ", tables=" + tables + ", chairs=" + chairs + ", couches=" + couches + ", paint=" + paint + '}';
    }

    public DesignerInventory() {
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

    
}
