/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildyourdreamabode;

import byui.cit260.buildYourDreamAbode.control.GameControl;
import byui.cit260.buildYourDreamAbode.model.Designer;
import byui.cit260.buildYourDreamAbode.model.House;
import byui.cit260.buildYourDreamAbode.model.HouseSite;
import byui.cit260.buildYourDreamAbode.model.Map;
import byui.cit260.buildYourDreamAbode.model.SupplyStore;
import byui.cit260.buildYourDreamAbode.view.StartProgramView;
import java.util.logging.Level;

/**
 *
 * @author ambiesnell
 */
public class BuildYourDreamAbode {

    private static GameControl currentGame = null;
    private static Designer designer = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    private static PrintWriter reportFile = null;

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try{
            
            //open character stream files for end user input and output
            BuildYourDreamAbode.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            BuildYourDreamAbode.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            BuildYourDreamAbode.logFile = new PrintWriter(filePath);
            
            //Report file
            String filePath = "report.txt";
            BuildYourDreamAbode.reportFile = new PrintWriter(filepath);
            
            //create StartProgramView and start the program
            startProgramView.startProgram();
        }catch (Throwable te) {
            this.console.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
        finally {
            try{
                if (BuildYourDreamAbode.inFile != null)
                    BuildYourDreamAbode.inFile.close();
                
                if (BuildYourDreamAbode.outFile != null)
                    BuildYourDreamAbode.outFile.close();
                
                if(BuildYourDreamAbode.logFile != null)
                    BuildYourDreamAbode.logFile.close();
                if(BuildYourDreamAbode.reportFile != null)
                    BuildYourDreamAbode.reportFile.close();
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }
    }
    }
    
    private void startSavedGame(){
        
        //prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path where the game " + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    public static void setDesigner(Designer designer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        Designer designerOne = new Designer();
        
        //designerOne.setName("Mark Jacobs");
        //designerOne.setCoordinates("You are currently at the House Site.");
        
        //String designerInfo = designerOne.toString();
        //System.out.println(designerInfo);
        
        House houseOne = new House ();
        
       // houseOne.setDescription("Your new home is now built. Now it is time to furnish it.");
       // houseOne.setNumberOfBedrooms(5);
        //houseOne.setNumberOfBathrooms(5.5);
        
        //String houseInfo=houseOne.toString();
        //System.out.println(houseInfo);
        
        SupplyStore supplyStore = new SupplyStore();
        
        //supplyStore.setDescription("This is where you will buy all your supplies.");
        
        //String supplyStoreInfo = supplyStore.toString();
        //System.out.println(supplyStoreInfo);
        
        HouseSite houseSite = new HouseSite();
        
        //houseSite.setDescription("Welcome to the house site.");
        
        //String houseSiteInfo = houseSite.toString();
        //System.out.println(houseSiteInfo);
        
        Map mapOne = new Map();
        
       // mapOne.setRowCount(4);
       // mapOne.setColumnCount(4);
        
        //String mapInfo = mapOne.toString();
        //System.out.println(mapInfo);
        
        //InventoryItem inventory= new InventoryItem();
        
        //inventory.setBeds(5);
       // inventory.setRequiredAmount(5);
        //inventory.setTables(2);
        //inventory.setCouches(3);
        //inventory.setChairs(12);
        //inventory.setPaint(10);
        
        //String inventoryInfo=inventory.toString();
        //System.out.println(inventoryInfo);
        
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

public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BuildYourDreamAbode.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BuildYourDreamAbode.inFile = inFile;
    }

public static PrintWriter getLogFile() {
return logFile;
}

public static void setLogFile(PrintWriter logFile) {
BuildYourDreamAbode.logFile = logFile;
}

public static PrintWriter getReportFile() {
        return reportFile;
    }

    public static void setReportFile(PrintWriter reportFile) {
        BuildYourDreamAbode.reportFile = reportFile;
    }