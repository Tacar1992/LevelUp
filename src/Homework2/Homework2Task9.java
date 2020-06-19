package Homework2;

public class Homework2Task9
{
    public static void main(String[] args)
    {

      int i = 2;
      int j = 1;
      do
          {
              if (i%2 == 0 )
              {
                  System.out.print(+i+ " ");
                  i =i * 2;
                  j ++;
              }
              else
                  j++;
          }while (j < 21);
    }
}
