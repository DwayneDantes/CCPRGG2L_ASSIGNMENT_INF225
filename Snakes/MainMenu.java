import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon snakeIcon = new ImageIcon("neonman.gif");
        JLabel label = new JLabel();
        label.setIcon(snakeIcon);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Consolas", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        this.add(label);
        this.add(button);


        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 1200);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(new Color(200, 20, 100));
    }

    // Event handler class
    private class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new ColorMenu();
            dispose();
            
        }

        
        }
    }
