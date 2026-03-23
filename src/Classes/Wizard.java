package Classes;

public class Wizard extends Player {

    public Wizard(String name) {
        super(name, 15, 30, 60, 70);
    }

    // Returns a description of the wizard class
    @Override
    public String getCharacterInformString() {
        return "Wizards are usually elf. Have higher hit points but low defense ";
    }

    // Calculates the wizard's attack value
    @Override
    public int calculateAttack() {
        return super.calculateAttack() + 3;
    }
}