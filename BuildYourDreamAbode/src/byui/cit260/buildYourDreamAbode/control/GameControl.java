/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.control;

import buildyourdreamabode.BuildYourDreamAbode;
import byui.cit260.buildYourDreamAbode.model.Designer;

/**
 *
 * @author ElisaHutchings
 */
public class GameControl {

    public static Designer createDesigner(String name) {
        
        if (name == null) {
            return null;
        }
        
        Designer designer = new Designer();
        designer.setName(name);
        
        BuildYourDreamAbode.setDesigner(designer); //save the player
        
        return designer;
    }
    
}
