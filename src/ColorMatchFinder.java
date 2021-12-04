/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfitmaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author julian
 */
public class ColorMatchFinder {
    
    // match each EnumColor to an array of matching EnumColors
    private HashMap<EnumColor, List<EnumColor>> matches = new HashMap<>();
    
    public ColorMatchFinder() {
        matches.put(EnumColor.PINK, Arrays.asList(new EnumColor[]{EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.GRAY, EnumColor.WHITE, EnumColor.BLACK, EnumColor.RED, EnumColor.TAN, EnumColor.PINK}));
        matches.put(EnumColor.RED, Arrays.asList(new EnumColor[]{EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.GRAY, EnumColor.WHITE, EnumColor.BLACK, EnumColor.RED, EnumColor.TAN, EnumColor.PINK}));
        matches.put(EnumColor.ORANGE, Arrays.asList(new EnumColor[]{EnumColor.GREEN, EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.WHITE, EnumColor.BLACK, EnumColor.ORANGE, EnumColor.TAN, EnumColor.BROWN}));
        matches.put(EnumColor.TAN, Arrays.asList(new EnumColor[]{EnumColor.DARK_BLUE, EnumColor.PURPLE, EnumColor.BROWN, EnumColor.WHITE, EnumColor.BLACK, EnumColor.YELLOW, EnumColor.TAN, EnumColor.ORANGE}));
        matches.put(EnumColor.YELLOW, Arrays.asList(new EnumColor[]{EnumColor.GREEN, EnumColor.DARK_BLUE, EnumColor.WHITE, EnumColor.YELLOW, EnumColor.BLACK, EnumColor.TAN}));
        matches.put(EnumColor.GREEN, Arrays.asList(new EnumColor[]{EnumColor.ORANGE, EnumColor.PURPLE, EnumColor.WHITE, EnumColor.GREEN, EnumColor.BLACK, EnumColor.YELLOW, EnumColor.LIGHT_BLUE}));
        matches.put(EnumColor.LIGHT_BLUE, Arrays.asList(new EnumColor[]{EnumColor.PINK, EnumColor.RED, EnumColor.ORANGE, EnumColor.WHITE, EnumColor.BLACK, EnumColor.DARK_BLUE, EnumColor.PURPLE, EnumColor.LIGHT_BLUE}));
        matches.put(EnumColor.DARK_BLUE, Arrays.asList(new EnumColor[]{EnumColor.PINK, EnumColor.RED, EnumColor.YELLOW, EnumColor.WHITE, EnumColor.BLACK, EnumColor.DARK_BLUE, EnumColor.PURPLE, EnumColor.LIGHT_BLUE, EnumColor.GRAY}));
        matches.put(EnumColor.PURPLE, Arrays.asList(new EnumColor[]{EnumColor.ORANGE, EnumColor.GRAY, EnumColor.GREEN, EnumColor.WHITE, EnumColor.BLACK, EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.PURPLE}));
        matches.put(EnumColor.BROWN, Arrays.asList(new EnumColor[]{EnumColor.TAN, EnumColor.ORANGE, EnumColor.WHITE, EnumColor.BROWN, EnumColor.BLACK}));
        matches.put(EnumColor.GRAY, Arrays.asList(new EnumColor[]{EnumColor.PINK, EnumColor.RED, EnumColor.PURPLE, EnumColor.DARK_BLUE, EnumColor.BLACK, EnumColor.WHITE}));
        matches.put(EnumColor.BLACK, Arrays.asList(new EnumColor[]{EnumColor.PINK, EnumColor.RED, EnumColor.ORANGE, EnumColor.TAN, EnumColor.YELLOW, EnumColor.GREEN, EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.PURPLE, EnumColor.BROWN, EnumColor.GRAY, EnumColor.BLACK, EnumColor.WHITE}));
        matches.put(EnumColor.WHITE, Arrays.asList(new EnumColor[]{EnumColor.PINK, EnumColor.RED, EnumColor.ORANGE, EnumColor.TAN, EnumColor.YELLOW, EnumColor.GREEN, EnumColor.LIGHT_BLUE, EnumColor.DARK_BLUE, EnumColor.PURPLE, EnumColor.BROWN, EnumColor.GRAY, EnumColor.BLACK, EnumColor.WHITE}));
    }
    
    public List<EnumColor> getMatches(EnumColor color) {
        return (matches.get(color));
    }
    
    public boolean checkMatch(EnumColor color1, EnumColor color2) {
        List<EnumColor> colorOptions = matches.get(color1);
        return colorOptions.contains(color2);
    }
    
}
