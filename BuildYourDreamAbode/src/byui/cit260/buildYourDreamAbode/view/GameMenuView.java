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
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------"
            +"\n| Game Menu                            |"
            +"\n----------------------------------------"
            +"\nM - Map"
            +"\nI - Your Inventory"
            +"\nQ - Quit"
            +"\n----------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        
        char choice = (char) obj;
        
        switch (choice) {
            case 'M': //Go to the map
                this.map();
                break;
            case 'I': //See Inventory
                this.designerInventory();
                break;
            case 'Q': // Exit the program
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } 
        return true;
    }

    private void map() {
System.out.println("\n*** map stub function called***");    
        }

    private void designerInventory() {
System.out.println("\n*** designerInventory stub function called***");    }

    
}
