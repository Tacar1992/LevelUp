import java.util.Random;

public class Homework2Task3
{
    public static void main(String[] args)
    {
Random r = new Random();
int a = r.nextInt(150)+5;
        System.out.println("Сгенерированное число " +a);
if (a > 25 && a < 100)
{
    System.out.println("Число " + a + " содержиться в интервале (25,100)");
}
 else
     {
         System.out.println("Число " + a + " не содержиться в интервале (25,100)");
     }
    }
}
