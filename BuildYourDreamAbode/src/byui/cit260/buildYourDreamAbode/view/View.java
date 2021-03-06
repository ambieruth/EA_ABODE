/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import buildyourdreamabode.BuildYourDreamAbode;
import byui.cit260.buildYourDreamAbode.control.GameControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElisaHutchings
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = BuildYourDreamAbode.getInFile();
    protected final PrintWriter console = BuildYourDreamAbode.getOutFile();
   

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    public View(){
        
    }

    @Override
    public void display() {
        char selection = ' ';
        do {

            this.console.println(this.promptMessage); //display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); //do action based on selection

        } while (selection != 'Q'); // an selection is not "Exit"

    }

    @Override
    public String getInput() {

        boolean valid = false; //indicates of the name has been retrieved
        String selection = null;

        while (!valid) { try {
            //while a valid name has not been retrieved
            
            //prompt for the designer's name
            this.console.println("Enter your choice below:");

            //get the name from the keyboard and trim off the blanks
            selection = this.keyboard.readLine();
            selection = selection.trim();

            //if the name is invalid)less than two characters in length)
            if (selection.length() < 1) {
               
                continue; //and repeat again

            }
            break; //out of the (exit) the repetition
            } catch (IOException ex) {
                 ErrorView.display(this.getClass().getName(), "Error reading inpute: " + ex.getMessage());
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return selection; //return the name

    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game " + "is to be saved.");
        String filePath = this.getInput();

        try {
            //save the game to the specified file
            GameControl.saveGame(BuildYourDreamAbode.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

}
