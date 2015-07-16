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
public class StoreView extends View {

    public StoreView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n|   Store                            |"
                + "\n----------------------------------------"
                + "\nB - Beds"
                + "\nT - Tables"
                + "\nC - Chairs"
                + "\nS - Couches"
                + "\nP - Paint"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;
        try {
            switch (choice) {
                case 'B': //create and start a new game
                    this.getBeds();
                    break;
                case 'T': //get and start and existing game
                    this.getTables();
                    break;
                case 'C': //display the help menu
                    this.getChairs();
                    break;
                case 'S': //save the current game
                    this.getCouches();
                    break;
                case 'P': //save the current game
                    this.getPaint();
                    break;
                case 'E': // Exit the program
                    return false;
                default:

                    break;
            }
            return true;
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return false;
    }

    private void getBeds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getTables() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getChairs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getCouches() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPaint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
