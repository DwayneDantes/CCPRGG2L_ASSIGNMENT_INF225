import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;



public class ColorMenu extends JFrame {
    private String[] colorNameArray = {"GREY","LIGHT GREY","WHITE"};
    private Color[] colorListArray = {Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.BLACK};
    
    JList colorList;
    
    ColorMenu(){
        JLabel label = new JLabel();
        label.setText("Choose your color");
        label.setFont(new Font("Arial",Font.BOLD,25));
        this.add(label);


        //JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);
        this.add(colorList);
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
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            Gamepanel gp = new Gamepanel();
            gp.gameBackgroundColor = colorListArray[colorList.getSelectedIndex()];

            new GameFrame();
            dispose();
        }
    }
}
