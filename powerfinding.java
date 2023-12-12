package org.example;

public class powerfinding {
    public static void main(String[] args) {
        int e;
        int res;
        for(int i=0;i<10;i++)
        {
            res=1;
            e=i;
            while(e>0)
            {
                res =res*2;
                e--;
                System.out.println("hi");
            }
            System.out.println(res);
        }
    }
}
