/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.model;

/**
 *
 * @author ElisaHutchings
 */
public class Game {
    Designer designer;
    public void setDesigner(Designer designer) {
        designer = designer;
    }
    public Designer getDesigner() {
        return designer;
    }

    public void setInventory(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static int bedrooms; 
    public static int getNumberOfBedrooms() {
        return bedrooms;
    }

    public Map getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
