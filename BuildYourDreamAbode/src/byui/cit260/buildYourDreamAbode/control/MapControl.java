/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.control;

import byui.cit260.buildYourDreamAbode.model.Designer;
import byui.cit260.buildYourDreamAbode.model.Map;

/**
 *
 * @author ElisaHutchings
 */
public class MapControl {

    static Map createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToStartingLocation(Actor actor, Point coordinates) {
        throws MapControlException {
        
        Map map = BuildYourDreamAbode.getCurretnGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
                newColumn < 0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException("Can not move designer to location " + coordinates.x + ", " + coordinates.y + " because that location is outside " + " the bounds of the map.");
                    }
                    }
    }

    public static int moveActorsToStartingLocation(Map map) {
        throws MapControlException {
        //for every designer
        Designer[] designer = Designer.values();
        
        for (Designer designer : designers) {
            Point coordinates = designer.getCoordinates();
            int returnValue = MapControl.moveActorsToStartingLocation(designer, coordinates);
            
            
        }
        return 0;
    }
}
}
