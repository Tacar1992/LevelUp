
import java.util.Random;

public class Homework2Task4
{
    public static void main(String[] args)
    {
    Random s = new Random();
    int a = s.nextInt(900)+100;
        System.out.println("Сгенерированное число " + a);
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;
        if (b >= c & b > d || b > c & b >= d)
        {
            System.out.println("Наибольшая цифра в числе " + a + " - " + b);
        }
        else
            {
                if (c >= b & c > d)
                {
                    System.out.println("Наибольшая цифра в числе " + a + " - " + c);
                }
                else
                    {
                        System.out.println("Наибольшая цифра в числе " + a + " - " + d);
                    }
            }
    }
}
