/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import byui.cit260.buildYourDreamAbode.control.GameControl;
import byui.cit260.buildYourDreamAbode.model.Designer;
import java.util.Scanner;

/**
 *
 * @author ElisaHutchings
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    public void startProgram(){
        
        //BEGIN
        //Display the banner screen
        this.displayBanner();
        
        //Get the players name
        String designersName = this.getDesignersName();
        
        //Create a new player
        Designer designer = GameControl.createDesigner(designersName);
        
        //DISPLAY a customized welcome message
        this.displayWelcomMessage(designer);
        
        //DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
        //END
    }

    private void displayBanner() {
        System.out.println("\n\n*********************************************");
        
        System.out.println("*                                         *"
                + "\n* This is the game of Build Your Dream Abode     *"
                + "\n* In this game you will be a designer and        *"
                + "\n* furnish your new home.                         *");
        
        System.out.println("*                                         *"
                + "\n* Make sure to have fun designing your home!     *"
                + "\n*                                                *");
        
        System.out.println("*************************************************");
    }

    private String getDesignersName() {
        boolean valid = false; //indicates of the name has been retrieved
        String designersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the designer's name
            System.out.println("Enter your name below:");
            
            //get the name from the keyboard and trim off the blanks
            designersName = keyboard.nextLine();
            designersName = designersName.trim();
            
            //if the name is invalid)less than two characters in length)
            if (designersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank or less than two characters");
                continue; //and repeat again
                
            }
            break; //out of the (exit) the repetition
        }
        
        return designersName; //return the name
    }

    public void displayWelcomMessage(Designer designer) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + designer.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=================================================");

    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
