import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, rem, rev=0, sum=0, pal;
		System.out.print("Enter a num: ");
		num = sc.nextInt();
		pal = num;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;			
		}
		if(pal == rev)
		{
			System.out.println("Given no is palindrome.");
		}
		else
		{
			System.out.println("Given no is not palindrome.");
		}

	}

}
