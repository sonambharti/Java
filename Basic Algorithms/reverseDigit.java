import java.util.Scanner;


public class reverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, rem, rev=0;
		System.out.print("Enter a num: ");
		num = sc.nextInt();
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("Reverse of the no is: " +rev);

	}

}
