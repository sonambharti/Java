import java.util.Scanner;


public class TriangleValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 1st side of triangle: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd side of triangle: ");
		b = sc.nextInt();
		System.out.println("Enter 3rd side of triangle: ");
		c = sc.nextInt();
		
		if((a<=0) || (b<=0) || (c<=0))
		{
			System.out.println("Invalid Input...");
		}
		else
		{
			if((a+b > c) && (a+c > b) && (b+c > a))
			{
				System.out.println("Sides form a triangle.");
			}
			else
			{
				System.out.println("Sides not form a triangle.");
			}
		}

	}

}
