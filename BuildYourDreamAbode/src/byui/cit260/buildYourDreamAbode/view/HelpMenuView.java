/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

/**
 *
 * @author ElisaHutchings
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nG - What is the goal of tha game?"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;
        try {
            switch (choice) {
                case 'G': //Goal
                    this.goal();
                    break;
                case 'Q': // Exit the program
                    return false;
                default:

                    break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return true;
    }

    private void goal() {
        this.console.println("\n*** goal stub function called***");
    }
}
