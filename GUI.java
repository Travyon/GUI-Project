

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;


public class GUI{

    public GUI(){
       
        JFrame frame = new JFrame();
        
       JButton button = new JButton("Click me");
    
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.add(button);

        

    
       
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Travyon Stevens GUI");
        frame.pack();
        frame.setVisible(true);

    }

   
    public static void main(String[] args){
       
      new GUI(); 
    }  
    
    

}
