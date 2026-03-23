package Classes;

import javax.swing.*;

/**
 * Dagger.java
 * Represents a dagger weapon, a subclass of Weapon.
 * Daggers are light, fast, and suitable for agile classes.
 */
public class Dagger extends Weapon {
    private ImageIcon daggerPic;

    //Constructors
    /**
     * Constructor: initializes dagger stats and image
     */
    public Dagger() {
        // Constructor for Dagger, sets name and attack bonus
        super(3,5,"Dagger");
        //Set image for this weapon
        daggerPic = new ImageIcon(this.getClass().getResource("/Images/dagger.png"));
    }

    /**
     * Returns a description of the dagger
     * @return A string containing the dagger's description
     */
    @Override
    public String getWeaponInformString() {

        return "A dagger is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }

    /**
     * Returns the dagger's image icon
     * @return An ImageIcon object representing the dagger's image
     */
    public ImageIcon getDaggerPic() {
        return daggerPic;
    }

    /**
     * Sets the dagger's image icon
     * @param daggerPic An ImageIcon object to represent the dagger's image
     */
    public void setDaggerPic(ImageIcon daggerPic) {
        this.daggerPic = daggerPic;
    }
}
