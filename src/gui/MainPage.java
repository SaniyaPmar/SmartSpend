package loginandsignup;

import gui.Login;

/**
 *
 * @author saniy
 */
public class MainPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Login Loginframe =new Login();
         Loginframe.setVisible(true);
         Loginframe.pack();
        Loginframe.setLocationRelativeTo(null);
    }
    
}
