// SplashPanel.java
// This panel displays the splash screen at the start of the game.
// It shows the game title, a background image, and a button to proceed to character creation.

package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SplashPanel extends JPanel {
    /**
     * Constructs the splash screen panel.
     * @param frame The main game frame, used to switch panels when the button is clicked.
     */
    public SplashPanel(GameFrame frame) {
        // Set layout to null for absolute positioning
        setLayout(null); // or a layout manager if you prefer
        // Set background color to a light purple shade
        setBackground(new Color(153, 153, 204)); // similar to sample

        // Title label for the game
        JLabel titleLabel = new JLabel("Dragons and Dungeons");
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 22));
        titleLabel.setBounds(250, 50, 400, 40);
        add(titleLabel);

        // Main splash image
        JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("/Images/dd_1400x.jpg")));
        imageLabel.setBounds(50, 100, 700, 500);
        add(imageLabel);

        // Button to proceed to character creation
        JButton buildButton = new JButton("Build A Character");
        buildButton.setBounds(300, 650, 200, 40);
        add(buildButton);

        //Test Button
        JButton testButton = new JButton("Added this for the code review");
        testButton.setBounds(300,700,250,40);
        add(testButton);

        // When the button is clicked, show the character creation panel
        buildButton.addActionListener(e ->
                frame.showPanel(new CharacterCreationPanel(frame)));
    }
}