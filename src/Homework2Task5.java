import java.util.Arrays;
import java.util.Scanner;

public class Homework2Task5
{
    public static void main(String[] args)
    {
        long a;
        long b;
        long c;

        Scanner sa = new Scanner(System.in);
        System.out.println("Введите переменную а: ");
        a = sa.nextLong();

        Scanner sb = new Scanner(System.in);
        System.out.println("Введите переменную b: ");
        b = sa.nextLong();
        if (b == a)
        {
            System.out.println("Переменные не должны бать равными.");
        }
        else
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите переменную с: ");
                c = sc.nextLong();
                if (c == a | c == b)
                {
                    System.out.println("Переменные не должны бать равными.");
                }
                else
                    {
                        System.out.println("Числа в переменных a, b, c: " + a + ", " + b + ", " + c);
                    }
                long [] array = {a,b,c};
                Arrays.sort(array,0,3);
                System.out.println("Возрастающая последовательность: " + Arrays.toString(array));
            }
    }
}
