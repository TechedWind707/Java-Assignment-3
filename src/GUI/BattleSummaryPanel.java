package GUI;

import Classes.*;
import javax.swing.*;
import java.awt.*;

public class BattleSummaryPanel extends JPanel {

    public BattleSummaryPanel(GameFrame frame, Player player, Monster monster) {
        setLayout(null);
        setBackground(new Color(153, 153, 204));

        Font titleFont = new Font("Calibri", Font.BOLD, 22);

        JLabel title = new JLabel("Battle To The Death!");
        title.setFont(titleFont);
        title.setBounds(280, 20, 300, 30);
        add(title);

        // Player info
        JLabel playerLabel = new JLabel("Player: " + player.getName());
        playerLabel.setBounds(80, 70, 200, 25);
        add(playerLabel);

        // You can swap this for different images per class if you want
        ImageIcon playerIcon = new ImageIcon(getClass().getResource("/Images/fighter.png"));
        JLabel playerPic = new JLabel(playerIcon);
        playerPic.setBounds(80, 100, 150, 150);
        add(playerPic);

        // Monster info
        JLabel monsterLabel = new JLabel("Monster: " + monster.getName());
        monsterLabel.setBounds(480, 70, 200, 25);
        add(monsterLabel);

        ImageIcon monsterIcon = new ImageIcon(getClass().getResource("/Images/gazer.png"));
        JLabel monsterPic = new JLabel(monsterIcon);
        monsterPic.setBounds(480, 100, 150, 150);
        add(monsterPic);

        // Text area with stats
        JTextArea summaryArea = new JTextArea();
        summaryArea.setEditable(false);

        StringBuilder sb = new StringBuilder();
        sb.append("Player: ").append(player.getName()).append("\n")
                .append("----------------------\n")
                .append("Class: ").append(player.getClass().getSimpleName()).append("\n")
                .append("HP: ").append(player.getHitPoints())
                .append("    Defense: ").append(player.getDefense())
                .append("    Agility: ").append(player.getAgility())
                .append("    Base Attack: ").append(player.getBaseAttack()).append("\n")
                .append("Weapon: ").append(player.getWeapon().getName())
                .append("    Attack Mod: ").append(player.getWeapon().getAttackModiifier())
                .append("    Weight: ").append(player.getWeapon().getWeight()).append("\n\n")
                .append("Monster: ").append(monster.getName()).append("\n")
                .append("----------------------\n")
                .append("HP: ").append(monster.getHitPoints())
                .append("    Defense: ").append(monster.getDefense())
                .append("    Agility: ").append(monster.getAgility())
                .append("    Base Attack: ").append(monster.getBaseAttack());

        summaryArea.setText(sb.toString());

        JScrollPane scroll = new JScrollPane(summaryArea);
        scroll.setBounds(80, 280, 600, 220);
        add(scroll);

        // Play Again button
        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(320, 520, 150, 40);
        add(playAgainButton);

        playAgainButton.addActionListener(e ->
                frame.showPanel(new CharacterCreationPanel(frame)));
    }
}
