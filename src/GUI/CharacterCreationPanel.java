package GUI;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Panel for creating new characters. Handles user input, class/weapon selection, and stat assignment.
// Provides UI for entering name, selecting class and weapon, and randomizing stats.
public class CharacterCreationPanel extends JPanel {

    private JLabel classImageLabel;
    private JLabel weaponImageLabel;

    private JTextField nameField;
    private JLabel selectClassLabel;
    private JLabel selectWeaponLabel;

    private JRadioButton warriorBtn;
    private JRadioButton wizardBtn;
    private JRadioButton clericBtn;

    private JRadioButton daggerBtn;
    private JRadioButton swordBtn;
    private JRadioButton hammerBtn;

    private JTextField hpField;
    private JTextField defenseField;
    private JTextField agilityField;
    private JTextField baseAttackField;

    private JTextField attackModField;
    private JTextField weightField;

    private Player currentPlayer;
    private Weapon currentWeapon;

    // Constructor: sets up the UI components for character creation
    public CharacterCreationPanel(GameFrame frame) {
        setLayout(null);
        setBackground(new Color(153, 153, 204));

        Font labelFont = new Font("Calibri", Font.BOLD, 22);

        // Title
        JLabel title = new JLabel("Character Generator");
        title.setFont(labelFont);
        title.setBounds(40, 20, 300, 30);
        add(title);

        // Name
        JLabel nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(labelFont);
        nameLabel.setBounds(40, 70, 150, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 70, 250, 30);
        add(nameField);

        // Character type
        JLabel typeLabel = new JLabel("Character Type");
        typeLabel.setFont(labelFont);
        typeLabel.setBounds(40, 120, 200, 30);
        add(typeLabel);

        warriorBtn = new JRadioButton("Warrior");
        wizardBtn = new JRadioButton("Wizard");
        clericBtn = new JRadioButton("Cleric");

        warriorBtn.setBounds(40, 160, 150, 25);
        wizardBtn.setBounds(40, 190, 150, 25);
        clericBtn.setBounds(40, 220, 150, 25);

        warriorBtn.setOpaque(false);
        wizardBtn.setOpaque(false);
        clericBtn.setOpaque(false);

        ButtonGroup classGroup = new ButtonGroup();
        classGroup.add(warriorBtn);
        classGroup.add(wizardBtn);
        classGroup.add(clericBtn);

        add(warriorBtn);
        add(wizardBtn);
        add(clericBtn);

        selectClassLabel = new JLabel("Select a Class");
        selectClassLabel.setBounds(210, 190, 150, 25);
        add(selectClassLabel);

        // Class image
        classImageLabel = new JLabel();
        classImageLabel.setBounds(250, 150, 150, 150);
        add(classImageLabel);

        warriorBtn.addActionListener(e -> {
            classImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/fighter.png")));
            setClassDefaults("Warrior");
        });

        wizardBtn.addActionListener(e -> {
            classImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/wizard.png")));
            setClassDefaults("Wizard");
        });

        clericBtn.addActionListener(e -> {
            classImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/dwarf.png")));
            setClassDefaults("Cleric");
        });


        // Character stats labels
        JLabel statsLabel = new JLabel("Character Stats");
        statsLabel.setFont(labelFont);
        statsLabel.setBounds(430, 120, 200, 30);
        add(statsLabel);

        JLabel hpLabel = new JLabel("Hit Points");
        JLabel defLabel = new JLabel("Defense");
        JLabel agiLabel = new JLabel("Agility");
        JLabel atkLabel = new JLabel("Base Attack");

        hpLabel.setBounds(430, 160, 120, 25);
        defLabel.setBounds(430, 190, 120, 25);
        agiLabel.setBounds(430, 220, 120, 25);
        atkLabel.setBounds(430, 250, 120, 25);

        add(hpLabel);
        add(defLabel);
        add(agiLabel);
        add(atkLabel);

        hpField = new JTextField();
        defenseField = new JTextField();
        agilityField = new JTextField();
        baseAttackField = new JTextField();

        hpField.setEditable(false);
        defenseField.setEditable(false);
        agilityField.setEditable(false);
        baseAttackField.setEditable(false);


        hpField.setBounds(560, 160, 80, 25);
        defenseField.setBounds(560, 190, 80, 25);
        agilityField.setBounds(560, 220, 80, 25);
        baseAttackField.setBounds(560, 250, 80, 25);

        add(hpField);
        add(defenseField);
        add(agilityField);
        add(baseAttackField);

        // Reroll button
        JButton rerollButton = new JButton("Reroll");
        rerollButton.setBounds(520, 290, 120, 30);
        add(rerollButton);
        rerollButton.addActionListener(this::rerollStats);

        // Weapon selection
        JLabel weaponLabel = new JLabel("Select Your Weapon");
        weaponLabel.setFont(labelFont);
        weaponLabel.setBounds(40, 320, 260, 30);
        add(weaponLabel);

        daggerBtn = new JRadioButton("Dagger");
        swordBtn = new JRadioButton("Sword");
        hammerBtn = new JRadioButton("Hammer");

        daggerBtn.setBounds(40, 360, 150, 25);
        swordBtn.setBounds(40, 390, 150, 25);
        hammerBtn.setBounds(40, 420, 150, 25);

        daggerBtn.setOpaque(false);
        swordBtn.setOpaque(false);
        hammerBtn.setOpaque(false);

        ButtonGroup weaponGroup = new ButtonGroup();
        weaponGroup.add(daggerBtn);
        weaponGroup.add(swordBtn);
        weaponGroup.add(hammerBtn);

        add(daggerBtn);
        add(swordBtn);
        add(hammerBtn);

        selectWeaponLabel = new JLabel("Select a Weapon");
        selectWeaponLabel.setBounds(210, 390, 150, 25);
        add(selectWeaponLabel);

        // Weapon image
        weaponImageLabel = new JLabel();
        weaponImageLabel.setBounds(250, 360, 150, 150);
        add(weaponImageLabel);

        daggerBtn.addActionListener(e -> {
            weaponImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/dagger.png")));
            updateWeaponStats(new Dagger());
        });

        swordBtn.addActionListener(e -> {
            weaponImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/sword.png")));
            updateWeaponStats(new Sword());
        });

        hammerBtn.addActionListener(e -> {
            weaponImageLabel.setIcon(new ImageIcon(getClass().getResource("/Images/hammer.png")));
            updateWeaponStats(new Hammer());
        });


        // Weapon stats
        JLabel weaponStatsLabel = new JLabel("Weapon Stats");
        weaponStatsLabel.setFont(labelFont);
        weaponStatsLabel.setBounds(430, 320, 200, 30);
        add(weaponStatsLabel);

        JLabel atkModLabel = new JLabel("Attack Modifier");
        JLabel weightLabel = new JLabel("Weight");

        atkModLabel.setBounds(430, 360, 150, 25);
        weightLabel.setBounds(430, 390, 150, 25);

        add(atkModLabel);
        add(weightLabel);

        attackModField = new JTextField();
        weightField = new JTextField();
        attackModField.setEditable(false);
        weightField.setEditable(false);

        attackModField.setBounds(560, 360, 80, 25);
        weightField.setBounds(560, 390, 80, 25);

        add(attackModField);
        add(weightField);

        // Start Battle button
        JButton startBattleButton = new JButton("Start Battle");
        startBattleButton.setBounds(520, 460, 150, 40);
        add(startBattleButton);

        startBattleButton.addActionListener(e -> {
            createPlayerFromUI();
            // simple fixed monster; you could randomize later
            Monster monster = new Monster("Gazer");
            frame.showPanel(new BattleSummaryPanel(frame, currentPlayer, monster));
        });
    }

    // Sets default stats for the selected class
    private void setClassDefaults(String className) {
        selectClassLabel.setText("");
        switch (className) {
            case "Warrior":
                hpField.setText("100");
                defenseField.setText("60");
                agilityField.setText("40");
                baseAttackField.setText("20");
                break;
            case "Wizard":
                hpField.setText("70");
                defenseField.setText("30");
                agilityField.setText("80");
                baseAttackField.setText("25");
                break;
            case "Cleric":
                hpField.setText("90");
                defenseField.setText("50");
                agilityField.setText("50");
                baseAttackField.setText("18");
                break;
        }
    }

    // Updates weapon stats display when a weapon is selected
    private void updateWeaponStats(Weapon weapon) {
        selectWeaponLabel.setText("");
        currentWeapon = weapon;
        attackModField.setText(String.valueOf(weapon.getAttackModiifier()));
        weightField.setText(String.valueOf(weapon.getWeight()));
    }


    // randomize stats and fill text fields
    private void rerollStats(ActionEvent e) {
        int hp = 70 + (int) (Math.random() * 31);
        int def = 30 + (int) (Math.random() * 31);
        int agi = 30 + (int) (Math.random() * 31);
        int atk = 10 + (int) (Math.random() * 11);

        hpField.setText(String.valueOf(hp));
        defenseField.setText(String.valueOf(def));
        agilityField.setText(String.valueOf(agi));
        baseAttackField.setText(String.valueOf(atk));
    }

    // choose subclass and weapon based on selections
    private void createPlayerFromUI() {
        String name = nameField.getText().trim();
        int baseAttack = Integer.parseInt(baseAttackField.getText());
        int defense = Integer.parseInt(defenseField.getText());
        int agility = Integer.parseInt(agilityField.getText());
        int hp = Integer.parseInt(hpField.getText());

        if (warriorBtn.isSelected()) {
            currentPlayer = new Warrior(name);
        } else if (wizardBtn.isSelected()) {
            currentPlayer = new Wizard(name);
        } else {
            currentPlayer = new Cleric(name);
        }

        // ensure player stats match whatever is in the text fields
        currentPlayer.setHitPoints(hp);
        currentPlayer.setDefense(defense);
        currentPlayer.setAgility(agility);
        currentPlayer.setBaseAttack(baseAttack);

        if (currentWeapon != null) {
            currentPlayer.setWeapon(currentWeapon);
        }
    }
}
