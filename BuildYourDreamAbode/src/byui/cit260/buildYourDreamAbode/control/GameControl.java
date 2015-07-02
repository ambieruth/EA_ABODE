/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.control;

import buildyourdreamabode.BuildYourDreamAbode;
import byui.cit260.buildYourDreamAbode.model.Designer;

/**
 *
 * @author ElisaHutchings
 */
public class GameControl {
    
    public static void createNewGame(Designer designer) {
        
        Game game = new Game(); //create new game
        BuildYourDreamAbode.setCurrentGame(game); //save in BuildYourDreamAbode
        
        game.setDesigner(designer); //save player in game
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    
    public static void startNewGame()

    public static Designer createDesigner(String name) {
        
        if (name == null) {
            return null;
        }
        
        Designer designer = new Designer();
        designer.setName(name);
        
        BuildYourDreamAbode.setDesigner(designer); //save the player
        
        return designer;
    }
    
}
