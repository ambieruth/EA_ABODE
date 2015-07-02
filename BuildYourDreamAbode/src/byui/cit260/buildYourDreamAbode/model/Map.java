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
public class Map implements Serializable{
    
    //class instance variables
    private int rowCount;
    private int columnCount;
    
    private Map map;
    private HouseSite houseSite;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.rowCount;
        hash = 97 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public Map() {
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public HouseSite getHouseSite() {
        return houseSite;
    }

    public void setHouseSite(HouseSite houseSite) {
        this.houseSite = houseSite;
    }
    
}
