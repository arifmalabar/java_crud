/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjava.ui.session;

import crudjava.ui.view.LoginGUI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author arif
 */
public class SessionValidator {
    public static void checkSession(JFrame gui)
    {
        if(!SessionModel.getStatus())
        {
            JOptionPane.showMessageDialog(null, "Session anda sudah habis");
            System.exit(0);
        }
    }
    public static void doLogout(JFrame jf)
    {
        SessionModel.setId_user(0);
        SessionModel.setNama("");
        SessionModel.setPassword("");
        SessionModel.setUsername("");
        SessionModel.setStatus(false);
        jf.hide();
        LoginGUI login = new LoginGUI();
        login.show();
    }
}
