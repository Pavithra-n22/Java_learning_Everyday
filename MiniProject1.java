package org.example;

public class MiniProject1 {
    public static void main(String args[])throws java.io.IOException
    {
        System.out.println("you have two choice pick if or switch/n 1.if 2.switch");
        char ch;
        ch =(char)System.in.read();
        switch (ch)
        {
            case ('1'):
            {
                System.out.println("if chosed");
                 break;
            }

            case ('2'):
            {
                System.out.println("switch chosed");
                break;
            }

        }



    }
}
