package org.example;

public class Switchandnestedswitch {
    public static void main(String args[])
    {
        switch (2)
        {
            case(1):
            {
                System.out.println("the case input is 1");
            }
            case(2):
            {
                System.out.println("the case input is 2");

                switch (3)
                {
                    case(3):
                    {
                        System.out.println("the case input is 3");
                    }
                }
            }
        }
    }
}
//nested if