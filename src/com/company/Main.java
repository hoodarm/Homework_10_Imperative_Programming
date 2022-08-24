package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int a = 112;
        int b = 91;
        int r = a % b;
        while (r >= 0)
        {
            if (r == 0)
            {
                System.out.println(b);
                break;
            }
            else
            {
                a = b;
                b = r;
                r = a % b;
            }
        }
    }
}