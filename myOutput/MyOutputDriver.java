
/**
 * Write a description of class MyOutputDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyOutputDriver
{
    public static void main(String [] args)
    {
        for (int r = 1;r < 5; r++)
        {
            for (int c = 1; c < 7; c++)
            {
                if (c == r)
                {
                    int number;
                    number = c * 2;
                    System.out.print(number);
                }else
                {
                    System.out.print("-");
                }
            }
            System.out.print("\n");
        }
    }
}
