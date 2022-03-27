import java.util.Scanner;

//Example of typecasting

class AsciValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;
		System.out.print("Enter the value of numbers: \n");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		char ch1 = (char)num1;
		char ch2 = (char)num2;
		char ch3 = (char)num3;
		char ch4 = (char)num4;
		
		System.out.println(num1+"-"+ch1);
		System.out.println(num2+"-"+ch2);
		System.out.println(num3+"-"+ch3);
		System.out.println(num4+"-"+ch4);
		
		

	}

}
