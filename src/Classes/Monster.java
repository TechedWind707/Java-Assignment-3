package Classes;

public class Monster extends Character {
    //    Constructor
    public Monster(String name) {
        super(name, 30,40, 50, 50);
    }

    @Override
    public String getCharacterInformString() {
        return "A fearsome monster that wants to eat heroes";
    }

    @Override
    public int calculateAttack() {
        return getBaseAttack();
    }

}