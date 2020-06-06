public class Homework2Task7
{
    public static void main(String[] args)
    {
//        for (int i = 1; i < 200; i +=2)
//        {
//            System.out.print(i +" ");
//        }

        int i = 1; // вводим значение начала отсчета последовательности
        int j = 1; // вводим значение начала
        do
            {
            if (i%2 != 0)
            {
                System.out.print(i+ " ");
                i++;
                j++;
            }
            else
                i++;

        } while (j < 56);
    }
}
