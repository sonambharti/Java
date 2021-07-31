import java.util.Scanner;


public class Factorial {
	static int fact(int num)
	{
		if (num == 1 || num == 0)
			return 1;
		else
			return num*fact(num-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number to find factorial:");
		num = sc.nextInt();
		if (num<0)
		{
			System.out.println("Invalid Number...\nCan't find Factorial.");
		}
		else
		{
			System.out.println("Factorial of "+num+" is: "+fact(num));
		}

	}

}
