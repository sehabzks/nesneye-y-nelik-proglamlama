package com.mycompany.userinterface;

import javax.swing.JOptionPane;

public class UserInterface {

    public static void main(String[] args) {
       try {

            GUI form = new GUI();
            form.setSize(300, 300);
            form.setVisible(true);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
