package Homework3;

import java.util.Scanner;

public class Calculator
{
    private static double result;

    public static void main(String[] args)
    {
        long a;
        double b;
        int c;
        char d;

        Scanner sa = new Scanner(System.in);
        System.out.println("Введите переменную a типа long: ");
        a = sa.nextLong();

       Scanner sb = new Scanner(System.in);
       System.out.println("Введите переменную b типа double: ");
       b = sb.nextDouble();

       Scanner sc = new Scanner(System.in);
       System.out.println("Введите переменную c типа int: ");
       c = sc.nextInt();

       Scanner sd = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        d = sd.next().charAt(0);

        result = calc(a, b, c, d);

        System.out.println("Результат операции: "+result);
    }

         static double calc (long a, double b, int c, char d)
         {
             if(d=='+')
                 result = a + b + c;
             else
                 {
                     System.out.println("Что-то пошло не так!");
                 }
             return result;
         }

         static double calc (int a, double b, long c, char d)
         {
             if(d=='-')
                 result = a - b - c;
             else
             {
                 System.out.println("Что-то пошло не так!");
             }
             return result;
         }
         static double calc (double a, double b, double c, char d)
         {
             if(d=='*')
                 result = a * b * c;
             else
             {
                 System.out.println("Что-то пошло не так!");
             }
             return result;
         }
          static double calc (int a, long b, double c, char d)
         {
             if(d=='/')
                 result = a / b / c;
             else
             {
                 System.out.println("Что-то пошло не так!");
             }
             return result;
         }
}
