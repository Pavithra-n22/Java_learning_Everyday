package org.example;

public class IfelseIfladder {
    public static void main(String args[])throws  java.io.IOException
    {
        char ans='k';
        char a;
        System.out.println("enter the guess");
        a=(char)System.in.read();
        if(a==ans)
        {
            System.out.println("the guess is correct");

        } else if(a>ans)
        {
            System.out.println("the guess is high");
        }
        else if(a<ans)
        {
            System.out.println("the guess is low");
        }
        else {
            System.out.println(" plese enter valid charater");
        }

    }
}
