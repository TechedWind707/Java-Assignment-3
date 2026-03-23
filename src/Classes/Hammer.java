package Classes;

import javax.swing.*;

public class Hammer extends Weapon {
    private ImageIcon hammerPic;

    //Constructors
    public Hammer() {

        super(3,4,"Hammer");
        //Set image for this weapon
        hammerPic = new ImageIcon(this.getClass().getResource("/Images/hammer.png"));
    }

    @Override
    public String getWeaponInformString() {

        return "A hammer is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public void setHammerPic(ImageIcon daggerPic) {
        this.hammerPic = daggerPic;
    }
}