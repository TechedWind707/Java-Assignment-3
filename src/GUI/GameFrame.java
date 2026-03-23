package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// GameFrame.java
// Main window frame for the game GUI. Handles switching between panels and sets up the main window properties.

public class GameFrame extends JFrame {
    // Constructor: initializes the main game window and shows the splash screen
    public GameFrame() {
        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        //Splash screen
        setContentPane(new SplashPanel(this));
        setVisible(true);
    }

    // Method to switch the displayed panel in the frame
    public void showPanel(JPanel panel) {
        setContentPane(panel);
        revalidate();
        repaint();
    }
}
