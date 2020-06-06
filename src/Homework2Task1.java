import java.util.Scanner;

public class Homework2Task1
{
    public static void main(String[] args)
    {
        Scanner cn = new Scanner(System.in);
        int n;
        System.out.println("Введите число: ");
         n = cn.nextInt();

          if (n < 0)
          {
              System.out.println("Введена отрицательная переменная.");
          }
          else
          {
            if (n%2==0)
            {
                System.out.println("Переменная чётная!");
            }
            else
                {
                System.out.println("Переменная нечётная!");
                }
          }
    }

}
