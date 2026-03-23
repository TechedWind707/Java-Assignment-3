package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SplashPanel extends JPanel {

    public SplashPanel(GameFrame frame) {
        setLayout(null); // or a layout manager if you prefer
        setBackground(new Color(153, 153, 204)); // similar to sample

        JLabel titleLabel = new JLabel("Dragons and Dungeons");
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 22));
        titleLabel.setBounds(250, 50, 400, 40);
        add(titleLabel);

        JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("/Images/dd_1400x.jpg")));
        imageLabel.setBounds(50, 100, 700, 500);
        add(imageLabel);

        JButton buildButton = new JButton("Build A Character");
        buildButton.setBounds(300, 650, 200, 40);
        add(buildButton);

        buildButton.addActionListener(e ->
                frame.showPanel(new CharacterCreationPanel(frame)));
    }
}