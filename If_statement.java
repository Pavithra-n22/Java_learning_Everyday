package org.example;

public class If_statement {
    public static void main(String args[])throws java.io.IOException
    {

       char  answer='k';
       char a;
       System.out.println("guess the number");
       a= (char)System.in.read();
       if (a==answer)
       {
           System.out.println("you are correct");
       }


    }
}
