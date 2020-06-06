import java.util.Scanner;

public class Homework2Task11
{
    public static void main(String[] args)
    {
        long a;
        long j=1;
        Scanner sa = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        a = sa.nextLong();

        if (a < 0)
        {
            System.out.println("Введена отрицательная переменная.");
        } else
            {
               do {
                   if (a%j == 0)
                   {
                       System.out.println("Делители: "+j);
                       j++;
                   }else
                       {
                           j++;
                       }

               } while (j<=a);
            }
    }
}
