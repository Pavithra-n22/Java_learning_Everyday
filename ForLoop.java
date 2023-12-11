package org.example;

public class ForLoop {
    public static void main(String[] args)
    {
        int i; double ans = 0;
        for(i=0;i<100;i++)
        {
            ans=Math.sqrt(i);
            System.out.println(i +"="+ans);
            double re=i-(ans * ans);
            System.out.println("rounderror" +"="+re);

        }
        //computing rounding error

    }
}
