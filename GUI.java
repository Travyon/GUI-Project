//import the frame from the library


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;




/* Make the GUI Object in the main method so when 
   you press run it will make it with the constructor.
*/

public class GUI{



    //Constructor method is where the objects will go.
    public GUI(){
        //Frame
        JFrame frame = new JFrame();
        
        //Button
        JButton button = new JButton("Click me");
    
        //Panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.add(button);

        

        
    
        //frame
       
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Travyon Stevens GUI");
        frame.pack();
        frame.setVisible(true);

    }

    //Main method
    public static void main(String[] args){
       
       /* Running the main method will prompt the
       constructor which, will create the object
       */

      //Constructor
      new GUI(); 
    }  
    
    

}
