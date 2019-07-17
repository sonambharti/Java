/*Write a program to show how to take input. */
import java.util.*;
public class Input
{
    public static void main(String[] arg)
    {
        System.out.print("Enter any no.: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(++s);
    }
}