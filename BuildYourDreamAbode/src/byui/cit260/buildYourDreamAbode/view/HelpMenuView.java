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
public class HelpMenuView {
    private final String MENU = "\n"
            +"\n----------------------------------------"
            +"\n| Help Menu                            |"
            +"\n----------------------------------------"
            +"\nG - What is the goal of tha game?"
            +"\nQ - Quit"
            +"\n----------------------------------------";
    
    void displayMenu() {
char selection = ' ';
        do{
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); //do action based on selection
        
        } while (selection != 'Q'); // an selection is not "Exit"

    }

    private String getInput() {
        
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

    private void doAction(char choice) {
        
        switch (choice) {
            case 'G': //Goal
                this.goal();
                break;
            case 'Q': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    
}
    }
    private void goal() {
System.out.println("\n*** goal stub function called***");    }
}
