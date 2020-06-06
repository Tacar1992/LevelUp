import java.util.Scanner;

public class Homework2Task10
{
    public static void main(String[] args)
    {
        long a;

        Scanner sa = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        a = sa.nextLong();

        System.out.println("Факториал переменной: " +factorial(a));
    }

    static long factorial(long a)
    {
        int b=1;

        for (int i = 1; i<=a; i++)
        {
            b=b*i;
        }
        return b;
    }


}
