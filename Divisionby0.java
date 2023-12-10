package org.example;

public class Divisionby0 {
    public static void main(String args[])throws java.io.IOException
    {
       for(int i=-5;i<6;i++) {
         //this line is for skipiing below exception  if (i !=0 ? true : false) {
               System.out.println("result=" + 100 / i);
               //Exception in thread "main" java.lang.ArithmeticException: / by zero
               //	at org.example.Divisionby0.main(Divisionby0.java:8)
           }
       }
    }

