import java.util.*;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i;
		System.out.printf("Enter a number: ");
		num = sc.nextInt();
		
		for(i=2; i<=num/2; i++)
		{
			while(num%i == 0)
			{
				System.out.printf(i+" ");
				num = num/i;
			}
		}
		if(num > 2)
		{
			System.out.println(num);
		}

	}

}
