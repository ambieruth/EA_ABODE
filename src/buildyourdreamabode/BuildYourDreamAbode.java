/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamabode;

import byui.cit260.buildYourDreamAbode.model.House;
import byui.cit260.buildYourDreamAbode.model.Player;

/**
 *
 * @author ambiesnell
 */
public class BuildYourDreamAbode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne= new Player();
        
        playerOne.setName("Joe Smith");
        playerOne.setBestTime(12.00);
        
        String playerInfo=playerOne.toString();
        System.out.println(playerInfo);
        
        House houseOne = new House ();
        
        houseOne.setDescription("Your new home is now built. Now it is time to furnish it.");
        houseOne.setNumberOfBedrooms(5);
        houseOne.setNumberOfBathrooms(5.5);
        
        String houseInfo=houseOne.toString();
        System.out.println(houseInfo);
    }
    
}
