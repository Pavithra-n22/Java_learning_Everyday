package org.example;

public class NestedIf {
    public static void main(String args[]) throws  java.io.IOException
    {
        char answer='k';
        char a;
        a= (char)System.in.read();
        if (a==answer)
        {
            System.out.println("the guess is correct");

        }
        else {
            if(a>answer)
            {
                System.out.println("the guess is  too high");
            }
            else {
                System.out.println("the guess is  too low");
            }
        }

    }

}
