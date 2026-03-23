package Classes;

import javax.swing.*;

public class Sword extends Weapon {
    private ImageIcon swordPic;

    //Constructors
    public Sword () {
        super(5,10,"Sword");
        //Set image for this weapon
        swordPic = new ImageIcon(this.getClass().getResource("/Images/sword.png"));
    }

    @Override
    public String getWeaponInformString() {
        return "A sword is a good all-round weapon. " +
                "It is not too heavy and inflicts a lot of damage.";
    }

    public ImageIcon getSwordPic() {
        return swordPic;
    }

    public void setSwordPic(ImageIcon swordPic) {
        this.swordPic = swordPic;
    }

}