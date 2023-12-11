package org.example;

import javax.swing.*;

public class UserInputToStoptheloop {
    public static void main(String args[])throws java.io.IOException
    {
        JOptionPane.showMessageDialog(null,"press S to stop");
        for(int i=0; (char)System.in.read() !='s'; )
        {
            System.out.println(i+"pass");
            i++;
        }
    }//can be used in guessing game if emplty loop  for(; i<10;)
}
