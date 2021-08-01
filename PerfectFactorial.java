//Find a number for the given factorial

import java.util.Scanner;
 public class PerfectFactorial{
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int count=0;
         System.out.println("Enter the factorial:");
         int num=in.nextInt();         
         if(num>0)
         {
             for(int i=1;i<=num;i++)
             {
                 if(num%i==0)
                 {
                     num = num/i;
                     count=count+1;
                 }
                 else
                 {
                     break;
                 }
             }     
             if(num == 1)
             {
                 System.out.print(count);
             }
             else
             {
                  System.out.print("Sorry.The given number is not a perfect factorial");
             }
         }
         else if(num <= 0)
         {
              System.out.print("Invalid Input");
         }         
     }
 }