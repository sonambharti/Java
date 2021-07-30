import java.util.Scanner;


public class sumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, rem, sum=0;
		System.out.print("Enter a num: ");
		num = sc.nextInt();
		while(num != 0)
		{
			rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println("Sum of digits of given no.: " +sum);

	}

}
