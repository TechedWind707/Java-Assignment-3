package Classes;

public class Player extends Character {

    public Player(String name, int baseAttack, int defense, int agility, int hitPoints) {
        super(name, baseAttack, defense, agility, hitPoints);
    }


    public String getWeaponInformString() {
        return "Weapons are used to increase the attack of the player. They have different attack modifiers and weights.";
    }

    @Override
    public int calculateAttack() {
        return getBaseAttack() + (getWeapon() != null ? getWeapon().getAttackModiifier() : 0);
    }

    public void rerollStats() {
        // example ranges, up to you
        setHitPoints(70 + (int)(Math.random() * 31));   // 70–100
        setDefense(30 + (int)(Math.random() * 31));     // 30–60
        setAgility(30 + (int)(Math.random() * 31));     // 30–60
        setBaseAttack(10 + (int)(Math.random() * 11));  // 10–20
    }

}