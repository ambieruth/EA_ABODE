/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElisaHutchings
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nM - Map"
                + "\nI - Your Inventory"
                + "\nQ - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;

        try {
            switch (choice) {
                case 'M': //Go to the map
                    this.map();
                    break;
                case 'I': //See Inventory
                    this.designerInventory();
                    break;
                case 'R': //Print Report
                    this.report();
                    break;
                case 'Q': // Exit the program
                    return false;
                default:

                    break;
            }
        } catch (Exception e) {
            ErrorView.display(this, getClass().getName(), "Error reading input" + e.getMessage());
        }
        return true;
    }

    private void map() {
        this.console.println("\n*** map stub function called***");
    }

    private void designerInventory() {
        designerInventory(this.console);
    }

    private void designerInventory(PrintWriter out) {
        out.println("\n\n*********************************************");

        out.println("*                                         *"
                + "\n* Report of Inventory Items     *"
                + "\n* -------------------------------------------       *"
                + "\n* DESCRIPTION      REQUIRED        IN STOCK            *"
                + "\n* Beds             5               2                     *"
                + "\n* Tables           2               2                     *"
                + "\n* Chairs           14              10                    *"
                + "\n* Couches          4               6                     *"
                + "\n* Paint            20              30                    *");

        out.println("*************************************************");
    }

    private void report() {
        PrintWriter printFile = null;
        try {
            File outFile = new File("InventoryReport.txt");
            printFile = new PrintWriter(outFile);
            designerInventory(printFile);
            printFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printFile.close();
        }

    }
}
