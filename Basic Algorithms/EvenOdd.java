/*Write a program to enter a no. find even or odd.....*/
import java.util.*;
public class EvenOdd
{
    public static void main(String[] arg)
    {
        System.out.println("Enter the no. to be checked: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s%2 == 0)
        {
            System.out.println("Given no. is Even...");
        }
        else
        System.out.println("Given no. is odd....");
    }
}