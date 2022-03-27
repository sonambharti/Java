import java.util.Scanner;


public class BitwiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		System.out.println("Enter value of a and b: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.printf("After swaping....\nValue of a: %d and b: %d", a, b);

	}

}
