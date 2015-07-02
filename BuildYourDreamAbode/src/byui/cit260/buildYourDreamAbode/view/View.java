/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import java.util.Scanner;

/**
 *
 * @author ElisaHutchings
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
            }
    
    @Override        
    public void display() {
        char selection = ' ';
        do{
            
            System.out.println(this.promptMessage); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
        
        } while (selection != 'Q'); // an selection is not "Exit"

    }

    @Override
    public String getInput() {
        
        boolean valid = false; //indicates of the name has been retrieved
        String getInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the designer's name
            System.out.println("Enter your choice below:");
            
            //get the name from the keyboard and trim off the blanks
            getInput = keyboard.nextLine();
            getInput = getInput.trim();
            
            //if the name is invalid)less than two characters in length)
            if (getInput.length() > 1) {
                System.out.println("Invalid choice - too many characters");
                continue; //and repeat again
                
            }
            break; //out of the (exit) the repetition
        }
        
        return getInput; //return the name

    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
}
