package org.example;
import javax.swing.*;
public class Joptionpane {
    public static void main(String args[])
    {
       String temp;
        temp=JOptionPane.showInputDialog(null,"First number");
        int a=Integer.parseInt(temp);

        temp=JOptionPane.showInputDialog(null,"second number");
        int b=Integer.parseInt(temp);

        JOptionPane.showMessageDialog(null, "the asum is" +(a+b));

    }


}
