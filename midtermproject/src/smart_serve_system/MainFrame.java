package smart_serve_system;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("SmartServe System");
        setSize(450, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new AdminLogin()); // start with login panel
        setVisible(true);
    }

    public void switchPanel(JPanel panel) {
        setContentPane(panel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}