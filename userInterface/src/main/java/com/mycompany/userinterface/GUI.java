package com.mycompany.userinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

    JButton blist, bregister;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textusername, textpassword;

    GUI() {

        userLabel = new JLabel();
        userLabel.setText("Username");
        userLabel.setBounds(50, 50, 60, 30);
        textusername = new JTextField();
        textusername.setBounds(120, 50, 100, 30);

        passLabel = new JLabel();
        passLabel.setText("Password");
        passLabel.setBounds(50, 100, 60, 30);
        textpassword = new JPasswordField();
        textpassword.setBounds(120, 100, 100, 30);

        blist = new JButton("LIST");
        blist.setBounds(160, 150, 60, 30);
        bregister = new JButton("REGISTER");
        bregister.setBounds(50, 150, 100, 30);
        
        newPanel = new JPanel();
        newPanel.setLayout(null);
        newPanel.add(userLabel);
        newPanel.add(textusername);
        newPanel.add(passLabel);
        newPanel.add(textpassword);

        newPanel.add(blist);
        newPanel.add(bregister);
        add(newPanel);

        blist.addActionListener(this);
        bregister.addActionListener(this);

    }
  
    public void actionPerformed(ActionEvent GUI) {

        String userValue = textusername.getText();
        String passValue = textpassword.getText();

        dashBoard d = new dashBoard();

        if (GUI.getSource() == bregister) {
            try {
                d.Register(userValue, passValue);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (GUI.getSource() == blist) {
            d.List();
        } else {

        }

    }
}
