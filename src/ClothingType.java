/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfitmaker;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author julian
 */
public enum ClothingType {
    
    GRAPHIC_TEE,
    STRIPED_CREWNECK,
    STRIPED_SWEATER,
    HOODIE,
    JEANS,
    SHORTS,
    CREWNECK,
    BLOCK_STRIPED_SWEATER,
    STRIPED_LONG_SLEEVE,
    DUAL_COLOR_LONG_SLEEVE,
    CENTER_STRIPED_SWEATER,
    BEAD_BRACELET,
    DIGITAL_WATCH,
    ANALOG_WATCH,
    NAIL_POLISH,
    NONE;
    
    private final String name;
    private final String fileName;
    
    private ClothingType() {

        this.name = camelcasify(this.toString().toLowerCase());
        
        this.fileName = this.toString().toLowerCase().replace("_", "")+".png";

    }
    
    public BufferedImage getImage() throws IOException {
        
        return ImageIO.read(new File("src/assets/"+fileName));
        
    }
    
    public static String camelcasify(String in) {
    StringBuilder sb = new StringBuilder();
    boolean capitalizeNext = false;
    for (char c : in.toCharArray()) {
        if (c == '_') {
            capitalizeNext = true;
        } else {
            if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
    }
    return sb.toString();
}
    
}
