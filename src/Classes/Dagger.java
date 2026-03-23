package Classes;

import javax.swing.*;

public class Dagger extends Weapon {
    private ImageIcon daggerPic;

    //Constructors
    public Dagger() {
        // Constructor for Dagger, sets name and attack bonus
        super(3,5,"Dagger");
        //Set image for this weapon
        daggerPic = new ImageIcon(this.getClass().getResource("/Images/dagger.png"));
    }

    @Override
    public String getWeaponInformString() {

        return "A dagger is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }

    public ImageIcon getDaggerPic() {
        return daggerPic;
    }

    public void setDaggerPic(ImageIcon daggerPic) {
        this.daggerPic = daggerPic;
    }
}
