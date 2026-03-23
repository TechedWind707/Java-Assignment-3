package Classes;

// Weapon.java
// Abstract base class for all weapons.
// Defines weapon attributes and methods for subclasses.

public abstract class Weapon {
    private String name;
    private int attackModiifier;
    private int weight;

    // Constructor: initializes weapon stats
    public Weapon(int attackModiifier, int weight, String name) {
        this.name = name;
        this.attackModiifier = attackModiifier;
        this.weight = weight;
    }

    // Returns the weapon's name
    public String getName() {
        return name;
    }

    // Sets the weapon's name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the weapon's attack bonus
    public int getAttackModiifier() {
        return attackModiifier;
    }

    // Sets the weapon's attack bonus
    public void setAttackModiifier(int attackModiifier) {
        this.attackModiifier = attackModiifier;
    }

    // Returns the weapon's weight
    public int getWeight() {
        return weight;
    }

    // Sets the weapon's weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Abstract method for weapon description
    // We don't want to have generic weapons
    public abstract String getWeaponInformString();

}
