package org.example;

public class tryit {
    public static void main(String args[])
    {     char a='a';

        for (int i=0;i<10;i++)
        {

          // a = (char)(a++);
           //System.out.println(i +"="+a);
            a = (char) ('a' + i);  // Initialize and increment a
            System.out.println(i + "=" + a);

        }
    }


}
