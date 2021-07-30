import java.util.*;
public class sumEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, rem, rev=0, sumEven=0, sumOdd=0, c=1;
		System.out.print("Enter a num: ");
		num = sc.nextInt();
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			if(c%2 == 0)
			{
				sumEven = sumEven + rem^2;
				c++;
			}
			else
			{
				sumOdd = sumOdd + rem^2;
				c++;
			}
			num = num/10;
		}
		System.out.println("sum of even place digits: " +sumEven);
		System.out.println("sum of odd place digits: " +sumOdd);

	}

}
