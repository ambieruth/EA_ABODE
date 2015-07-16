/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import buildyourdreamabode.BuildYourDreamAbode;
import byui.cit260.buildYourDreamAbode.control.GameControl;

/**
 *
 * @author ElisaHutchings
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nN - Start Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;
        try {
            switch (choice) {
                case 'N': //create and start a new game
                    this.startNewGame();
                    break;
                case 'G': //get and start an existing game
                    this.startExistingGame();
                    break;
                case 'H': //display the help menu
                    this.displayHelpMenu();
                    break;
                case 'S': //save the current game
                    this.saveGame();
                    break;
                case 'E': // Exit the program
                    return false;
                default:

                    break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());

        }
        return true;
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(BuildYourDreamAbode.getDesigner());

        //disaply the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        this.console.println("*** saveGame function called***");
    }

}
