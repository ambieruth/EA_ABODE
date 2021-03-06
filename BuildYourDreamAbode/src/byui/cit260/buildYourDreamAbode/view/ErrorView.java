/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.buildYourDreamAbode.view;

import buildyourdreamabode.BuildYourDreamAbode;
import java.io.PrintWriter;

/**
 *
 * @author ElisaHutchings
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = BuildYourDreamAbode.getOutFile();
    private static final PrintWriter logFile = BuildYourDreamAbode.getLogFile();
    private static final PrintWriter reportFile = BuildYourDreamAbode.getReportFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "---------------------------------------------------------------------"
        +"\n- ERROR - " + errorMessage
        +"\n-----------------------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
        
        //report error
        logFile.println(className + "-" + errorMessage);
    }

    static void display(GameMenuView aThis, String name, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
