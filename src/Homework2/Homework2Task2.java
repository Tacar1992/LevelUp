package Homework2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Homework2Task2
{
    public static void main(String[] args)
    {
        double m;
        double n;
        double a;

        Scanner sa = new Scanner(System.in);
        System.out.println("Введите переменную a: ");
        a = sa.nextDouble();
        if (a < 0)
        {
            System.out.println("Введена отрицательная переменная!");
        }
        else
            {
            Scanner sm = new Scanner(System.in);
            System.out.println("Введите переменную m: ");
            m = sm.nextDouble();
            if (m < 0)
            {
                System.out.println("Введена отрицательная переменная!");
            }
            else
                {
                Scanner sn = new Scanner(System.in);
                System.out.println("Введите переменную n:");
                n = sn.nextDouble();
                if (n < 0)
                {
                    System.out.println("Введена отрицательная переменная!");
                }
                else
                    {
                    double c = Math.abs(m - a);
                    double z = Math.abs(n - a);
                    if (z == c)
                    {
                        System.out.println("Переменные равноудалены от "+a);
                    }
                    else
                        if (z < c)
                        {
                        System.out.println("Ближаейшая переменная к " + a + ": " + n);
                        }
                        else
                            {
                                System.out.println("Ближаейшая переменная к " + a + ": " + m);
                            }

                }
            }


        }

    }
}