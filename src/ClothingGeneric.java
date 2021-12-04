/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfitmaker;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author julian
 */
public class ClothingGeneric {
    
    private String name;
    private String brand;
    private EnumColor mainColor;
    private EnumColor accentColor;
    private ClothingType type;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public EnumColor getMainColor() {
        return mainColor;
    }

    public EnumColor getAccentColor() {
        return accentColor;
    }

    public ClothingType getType() {
        return type;
    }
    
    public Icon getIcon() throws IOException {
        BufferedImage image = getType().getImage();
        image = replaceColors(image, new Color(255, 0, 0), mainColor.color);
        image = replaceColors(image, new Color(0, 0, 255), accentColor.color);
        return new ImageIcon(image);
    }
    
    public BufferedImage replaceColors(BufferedImage image, Color targetColor, Color preferredColor) {
        int width = image.getWidth();
        int height = image.getHeight();
        int target = targetColor.getRGB();
        int preferred = preferredColor.getRGB();
        BufferedImage newImage = new BufferedImage(width, height, image.getType());
        int color;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                color = image.getRGB(i, j);
                if (color == target) {
                    newImage.setRGB(i, j, preferred);
                }
                else {
                    // if the color is transparent, make it white
                    if ((color>>24) == 0x00) {
                        color = 0xFFFFFF;
                    }
                    newImage.setRGB(i, j, color);
                }
            }
        }
        return newImage;
    }
    
    public int colorToInt(Color color) {
        return 0xFFFF * color.getRed() + 0xFF * color.getGreen() + color.getBlue();
        
    }
    
    public ClothingGeneric(String name, String brand, EnumColor mainColor, EnumColor accentColor, ClothingType type) {
        
        this.name = name;
        this.brand = brand;
        this.mainColor = mainColor;
        this.accentColor = accentColor;
        this.type = type;
        
    }
    
    
    
    
}
