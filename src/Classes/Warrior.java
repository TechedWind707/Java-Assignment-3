// Warrior.java
// Represents a warrior character, a subclass of Player.
// Warriors have high HP and defense but lower agility.

package Classes;

public class Warrior extends Player {

    // Constructor for Warrior, sets name, health, attack, and defense
    public Warrior(String name) {
        super(name, 20, 60, 40, 100);
    }

    // Returns a description of the warrior class
    @Override
    public String getCharacterInformString() {
        return "Fighters are often human.Have higher HP and defence but low agility.";
    }

    // Calculates the warrior's attack value
    @Override
    public int calculateAttack() {
        return super.calculateAttack() + 2;
    }
}