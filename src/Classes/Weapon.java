package Classes;

public abstract class Weapon {
    private String name;
    private int attackModiifier;
    private int weight;

    public Weapon(int attackModiifier, int weight, String name) {
        this.name = name;
        this.attackModiifier = attackModiifier;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackModiifier() {
        return attackModiifier;
    }

    public void setAttackModiifier(int attackModiifier) {
        this.attackModiifier = attackModiifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //absstract because we don't want to have generic weapons
    public abstract String getWeaponInformString();

}
