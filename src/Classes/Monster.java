package Classes;

// Represents a monster character, a subclass of Character.
// Used for enemy entities in the game.
public class Monster extends Character {
    // Constructor: initializes monster stats
    public Monster(String name) {
        super(name, 30,40, 50, 50);
    }

    // Returns a description of the monster
    @Override
    public String getCharacterInformString() {
        return "A fearsome monster that wants to eat heroes";
    }

    // Calculates the monster's attack value
    @Override
    public int calculateAttack() {
        return getBaseAttack();
    }

}