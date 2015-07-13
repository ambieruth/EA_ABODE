/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.control;

import buildyourdreamabode.BuildYourDreamAbode;
import byui.cit260.buildYourDreamAbode.exceptions.MapControlException;
import byui.cit260.buildYourDreamAbode.model.Designer;
import byui.cit260.buildYourDreamAbode.model.Map;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ElisaHutchings
 */
public class MapControl {

    static Map createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToStartingLocation(Designer designer, Point coordinates)
            throws MapControlException {

        Map map = BuildYourDreamAbode.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            try {
                throw new MapControlException("Can not move designer to location " + coordinates.x + ", " + coordinates.y + " because that location is outside " + " the bounds of the map.");
            } catch (MapControlException ex) {
                Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
