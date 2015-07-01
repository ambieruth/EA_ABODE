/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamabode;

import byui.cit260.buildYourDreamAbode.model.Beds;
import byui.cit260.buildYourDreamAbode.model.Chairs;
import byui.cit260.buildYourDreamAbode.model.Couches;
import byui.cit260.buildYourDreamAbode.model.Designer;
import byui.cit260.buildYourDreamAbode.model.House;
import byui.cit260.buildYourDreamAbode.model.HouseSite;
import byui.cit260.buildYourDreamAbode.model.InventoryItem;
import byui.cit260.buildYourDreamAbode.model.Location;
import byui.cit260.buildYourDreamAbode.model.Map;
import byui.cit260.buildYourDreamAbode.model.Paint;
import byui.cit260.buildYourDreamAbode.model.Player;
import byui.cit260.buildYourDreamAbode.model.SupplyStore;
import byui.cit260.buildYourDreamAbode.model.Tables;

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
        
        SupplyStore supplyStore = new SupplyStore();
        
        supplyStore.setDescription("This is where you will buy all your supplies.");
        supplyStore.setNoOfItems(4);
        
        String supplyStoreInfo = supplyStore.toString();
        System.out.println(supplyStoreInfo);
        
        HouseSite houseSite = new HouseSite();
        
        houseSite.setDescription("Welcome to the house site.");
        
        String houseSiteInfo = houseSite.toString();
        System.out.println(houseSiteInfo);
        
        Location location = new Location();
        
        location.setRow(3);
        location.setColumn(3);
        location.setAmountRemaining(2);
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        Designer designerOne = new Designer();
        
        designerOne.setName("Mark Jacobs");
        designerOne.setDescription("Mark is the preeminent designer in the category of ultra modern.");
        designerOne.setCoordinates("You are currently at the House Site.");
        
        String designerInfo = designerOne.toString();
        System.out.println(designerInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(4);
        mapOne.setColumnCount(4);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        InventoryItem inventory= new InventoryItem();
        
        inventory.setInventoryType("Bed");
        inventory.setQuantityInStock(3);
        inventory.setRequiredAmount(4);
        
        String inventoryInfo=inventory.toString();
        System.out.println(inventoryInfo);
        
        Beds bed = new Beds ();
        
        bed.setWidth(Double.NaN);
        bed.setLength(Double.NaN);
        
        String bedInfo=bed.toString();
        System.out.println(bedInfo);
        
        Paint paint = new Paint ();
        
        paint.setColor("white");
        paint.setAmount(Double.NaN);
        
        String paintInfo=paint.toString();
        System.out.println(paintInfo);
        
        Couches couch = new Couches ();
        
        couch.setLength(Double.NaN);
        couch.setWidth(Double.NaN);
        couch.setColor("yellow");
        
        String couchInfo=couch.toString();
        System.out.println(couchInfo);
        
        Chairs chair = new Chairs ();
        
        chair.setLength(Double.NaN);
        chair.setWidth(Double.NaN);
        chair.setColor("brown");
        
        String chairInfo=chair.toString();
        System.out.println(chairInfo);
        
        Tables table = new Tables ();
        
        table.setLength(Double.NaN);
        table.setWidth(Double.NaN);
        table.setColor("blue");
        
        String tableInfo=table.toString();
        System.out.println(tableInfo);
        
    }
    
}