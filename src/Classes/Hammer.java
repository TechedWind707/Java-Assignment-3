package Classes;

import javax.swing.*;

/**
 * Hammer.java
 * Represents a hammer weapon, a subclass of Weapon.
 * Hammers are light, fast, and effective for certain classes.
 */
public class Hammer extends Weapon {
    private ImageIcon hammerPic;

    //Constructors
    public Hammer() {

        super(3,4,"Hammer");
        //Set image for this weapon
        hammerPic = new ImageIcon(this.getClass().getResource("/Images/hammer.png"));
    }

    /**
     * Returns a description of the hammer
     * @return A string containing the hammer's description
     */
    @Override
    public String getWeaponInformString() {

        return "A hammer is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }

    /**
     * Returns the hammer's image icon
     * @return An ImageIcon object representing the hammer's image
     */
    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    /**
     * Sets the hammer's image icon
     * @param daggerPic An ImageIcon object to be set as the hammer's image
     */
    public void setHammerPic(ImageIcon daggerPic) {
        this.hammerPic = daggerPic;
    }
}