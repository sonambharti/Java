import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,sum=0,n;
		System.out.println("Enter a number till when we want the series: ");
		n = sc.nextInt();
		a = 0;
		b = 1;
		System.out.println("Your fibonacci Series is....");
		System.out.print(a+" "+b );	
		for(int i=0; i<n-2; i++)
		{
			sum = a+b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
		}
		

	}

}
