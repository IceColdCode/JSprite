package JSprite.elements;

import java.awt.*;
import java.awt.event.*
import javax.swing.*
import javax.imageio.ImageIO;

public class Menu extends JPanel {
  
  String[] menuOptions;
  BufferedImage background;
  
  // constructor time!
  public Menu(String backgroundFileName, int height, int width, String[] optionsToUse) {
    
    int i;
    while(i != null) {
      
      menuOptions[i] += optionsToUse[i];
      
    }
    
    background = new BufferedImage(backgroundFileName)
    
  }
  
}
