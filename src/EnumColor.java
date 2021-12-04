/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfitmaker;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author julian
 */
public enum EnumColor {
    
    // define color enums with a name and color
    RED("Red", Color.RED),
    PINK("Pink", new Color(255, 192, 203)),
    LIGHT_BLUE("Light Blue", new Color(51, 153, 255)),
    DARK_BLUE("Dark Blue", new Color(0, 0, 153)),
    GRAY("Gray", Color.GRAY),
    WHITE("White", Color.WHITE),
    BLACK("Black", new Color(25, 25, 25)),
    BROWN("Brown", new Color(102, 51, 0)),
    TAN("Tan", new Color(220, 202, 152)),
    ORANGE("Orange", new Color(0, 102, 0)),
    PURPLE("Purple", new Color(102, 51, 153)),
    YELLOW("Yellow", Color.YELLOW),
    GREEN("Green", new Color(0, 102, 0));

    public final String name;
    public final Color color;
    
    private EnumColor(String name, Color color) {
        this.name = name;
        this.color = color;
    }

}
