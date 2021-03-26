

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Login {
   
   
    public static void main(String[] args){

        //Objects
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Travyon");
    
        //Set frame size
        frame.setSize(100, 100);

        //Will close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //Will make frame visible
        frame.setVisible(true);

        
        frame.add(panel);
        panel.setLayout(null);
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        
        

    }

    



        
        

      
       
}
