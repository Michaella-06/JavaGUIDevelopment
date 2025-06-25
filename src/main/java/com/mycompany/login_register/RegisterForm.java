/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login_register;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Michaella Eroles
 */
public class RegisterForm {
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<String> email = new ArrayList<>();
    public static ArrayList<String> password = new ArrayList<>();
    
    public static void registerUser (String uname, String uemail, String upass){
        name.add(uname);
        email.add(uemail);
        password.add(upass);
    }
    public static void findUser(String uname, String upass){
        for(int i = 0; i <name.size(); i++){
            if (uname.equals(name.get(i))&& (upass.equals(password.get(i)))){
                System.out.print("hello");
                JOptionPane.showMessageDialog(null, "Welcome\n" + name.get(i));
            }
        }
    
    }
}

