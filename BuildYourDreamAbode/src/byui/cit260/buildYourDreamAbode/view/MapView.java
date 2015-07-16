/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import byui.cit260.buildYourDreamAbode.control.MapControl;
import byui.cit260.buildYourDreamAbode.exceptions.MapControlException;
import byui.cit260.buildYourDreamAbode.model.Designer;

/**
 *
 * @author ambiesnell
 */
public class MapView extends View {

    public MapView() {
        super("\n"
                + "\n------------------------------------------------------"
                + "\n| Map                                                |"
                + "\n| Where would you like to go?                        |"
                + "\n------------------------------------------------------"
                + "\nH - House site"
                + "\nS - Supply store"
                + "\nQ - Quit"
                + "\n------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        Designer designer = null;

        char choice = (char) obj;
        try {
            switch (choice) {
                case 'H': //House site
                    this.house();
                    break;
                case 'S': // Supply Store
                    this.supplyStore();
                    break;
                case 'Q': // Exit the map
                    return false;
                default:

                    break;

            }

            //move actor to specified location
            MapControl.moveActorsToStartingLocation(designer, designer.getCoordinates());
            return true;
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return false;

    }

    private void house() {
        this.console.println("\n*** house stub function called***");
    }

    private void supplyStore() {
        System.out.println("\n*** supplyStore stub function called***");
    }
}
