/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outfitmaker;

/**
 *
 * @author julian
 */
public class Outfit {
    
    private ClothingGeneric top;
    private ClothingGeneric bottom;
    private ClothingGeneric accessory;
    private ClothingGeneric nailPolish;

    public ClothingGeneric getTop() {
        return top;
    }

    public ClothingGeneric getBottom() {
        return bottom;
    }
    
    public ClothingGeneric getAccessory() {
        return accessory;
    }
    
    public ClothingGeneric getNailPolish() {
        return nailPolish;
    }
    
    public Outfit(ClothingGeneric top, ClothingGeneric bottom, ClothingGeneric accessory, ClothingGeneric nailPolish) {
        this.top = top;
        this.bottom = bottom;
        this.accessory = accessory;
        this.nailPolish = nailPolish;
    }
    
    public void printOutfit() {
        System.out.println("TOP:");
        System.out.println("-Name: "+top.getName());
        System.out.println("-Brand: "+top.getBrand());
        System.out.println("-Main Color: "+top.getMainColor().name);
        System.out.println("-Accent Color: "+top.getAccentColor().name);
        System.out.println("\n");
        System.out.println("BOTTOM:");
        System.out.println("-Name: "+bottom.getName());
        System.out.println("-Brand: "+bottom.getBrand());
        System.out.println("-Main Color: "+bottom.getMainColor().name);
        System.out.println("-Accent Color: "+bottom.getAccentColor().name);
    }
    
    
}
