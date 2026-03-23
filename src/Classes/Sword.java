package Classes;

import javax.swing.*;

/**
 * Sword.java
 * Represents a sword weapon, a subclass of Weapon.
 * Swords are balanced weapons suitable for most classes.
 */
public class Sword extends Weapon {
    private ImageIcon swordPic;

    //Constructors
    public Sword () {
        super(5,10,"Sword");
        //Set image for this weapon
        swordPic = new ImageIcon(this.getClass().getResource("/Images/sword.png"));
    }

    /**
     * Returns a description of the sword
     * @return A string describing the sword
     */
    @Override
    public String getWeaponInformString() {
        return "A sword is a good all-round weapon. " +
                "It is not too heavy and inflicts a lot of damage.";
    }

    /**
     * Returns the sword's image icon
     * @return The image icon representing the sword
     */
    public ImageIcon getSwordPic() {
        return swordPic;
    }

    /**
     * Sets the sword's image icon
     * @param swordPic The image icon to represent the sword
     */
    public void setSwordPic(ImageIcon swordPic) {
        this.swordPic = swordPic;
    }

}