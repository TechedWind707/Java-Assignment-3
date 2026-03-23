package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("DND Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);

        //Splash screen
        setContentPane(new SplashPanel(this));
        setVisible(true);
    }

    public void showPanel(JPanel panel) {
        setContentPane(panel);
        revalidate();
        repaint();
    }
}
