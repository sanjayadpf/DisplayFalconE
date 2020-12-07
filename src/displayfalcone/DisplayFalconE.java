/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayfalcone;

import com.formdev.flatlaf.IntelliJTheme;
import javax.swing.UIManager;

/**
 *
 * @author sanja
 */
public class DisplayFalconE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //UIManager.put( "Component.hideMnemonics", false );  
          UIManager.put( "ScrollBar.showButtons", true );
          UIManager.put( "ScrollBar.width", 16);
          // IntelliJTheme.install(CloudMachineInterfaceApp.class.getResourceAsStream("/Cyantheme.json" ) );
          //IntelliJTheme.install(CloudMachineInterfaceApp.class.getResourceAsStream("/arc-theme-orange.theme.json" ) );
           IntelliJTheme.install(DisplayFalconE.class.getResourceAsStream("/dark.theme.json" ));
          //IntelliJTheme.install(CloudMachineInterfaceApp.class.getResourceAsStream("/darkOrange.json" ) );
            //UIManager.setLookAndFeel(new );
            new Display().setVisible(true);
        
    }
    
}
