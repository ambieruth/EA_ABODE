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
public enum InventoryItem implements Serializable {
    
    Beds("Enjoy a good nights sleep."),
    Tables("You ahve to ahve something to eat on."),
    Chairs("Eating standing up makes no sense."),
    Couches("A necessary item for any living room."),
    Paint("White is just too boring.");
    
   private final int requiredAmount;

    @Override
    public String toString() {
        return "InventoryItem{" + "beds=" + beds + ", tables=" + tables + ", chairs=" + chairs + ", couches=" + couches + ", paint=" + paint + ", requiredAmount=" + requiredAmount + '}';
    }

    InventoryItem(int) {
        this.int = int;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }
    
}