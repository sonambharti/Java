import java.util.Scanner;


public class NumToMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("Enter a number: ");
		month = sc.nextInt();
		
		String mon[] = {"January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		
		if (month>12 || month<1)
		{
			System.out.println("No month for this given number "+month);
		}
		else
		{
			System.out.println(mon[month-1]);
		}
		

	}

}
