/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamabode;

import byui.cit260.buildYourDreamAbode.control.GameControl;
import byui.cit260.buildYourDreamAbode.model.Designer;
import byui.cit260.buildYourDreamAbode.model.Game;
import byui.cit260.buildYourDreamAbode.model.House;
import byui.cit260.buildYourDreamAbode.model.HouseSite;
import byui.cit260.buildYourDreamAbode.model.InventoryItem;
import byui.cit260.buildYourDreamAbode.model.Map;
import byui.cit260.buildYourDreamAbode.model.SupplyStore;
import byui.cit260.buildYourDreamAbode.view.StartProgramView;

/**
 *
 * @author ambiesnell
 */
public class BuildYourDreamAbode {

    private static GameControl currentGame = null;
    private static Designer designer = null;
    
    public static void main(String[] args) {
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        Designer designerOne = new Designer();
        
        designerOne.setName("Mark Jacobs");
        designerOne.setCoordinates("You are currently at the House Site.");
        
        String designerInfo = designerOne.toString();
        System.out.println(designerInfo);
        
        House houseOne = new House ();
        
        houseOne.setDescription("Your new home is now built. Now it is time to furnish it.");
        houseOne.setNumberOfBedrooms(5);
        houseOne.setNumberOfBathrooms(5.5);
        
        String houseInfo=houseOne.toString();
        System.out.println(houseInfo);
        
        SupplyStore supplyStore = new SupplyStore();
        
        supplyStore.setDescription("This is where you will buy all your supplies.");
        
        String supplyStoreInfo = supplyStore.toString();
        System.out.println(supplyStoreInfo);
        
        HouseSite houseSite = new HouseSite();
        
        houseSite.setDescription("Welcome to the house site.");
        
        String houseSiteInfo = houseSite.toString();
        System.out.println(houseSiteInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(4);
        mapOne.setColumnCount(4);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        InventoryItem inventory= new InventoryItem();
        
        inventory.setBeds(5);
        inventory.setRequiredAmount(5);
        inventory.setTables(2);
        inventory.setCouches(3);
        inventory.setChairs(12);
        inventory.setPaint(10);
        
        String inventoryInfo=inventory.toString();
        System.out.println(inventoryInfo);
        
    }
public static GameControl getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(GameControl currentGame) {
        BuildYourDreamAbode.currentGame = currentGame;
    }

    public static Designer getDesigner() {
        return designer;
    }

    public static void setDesigner(Designer designer) {
        BuildYourDreamAbode.designer = designer;
    }

    public static void setCurrentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}