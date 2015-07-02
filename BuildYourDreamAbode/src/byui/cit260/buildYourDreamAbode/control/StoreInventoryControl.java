/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.control;

import byui.cit260.buildYourDreamAbode.model.Game;

/**
 *
 * @author ElisaHutchings
 */
public class StoreInventoryControl {
    
    public int calcBed(int inventory, int want ) {
        
        if (want > inventory) {
            return -1;
        }
        
        if (want == new Game().getNumberOfBedrooms())
           return want; 
        else 
            return -1; 
       
        
        
    }
    
}
