

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Swaping {
	static void swap(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a: " + a +" and b is: " +b);
	}
	
	public static void main(String[] args) throws Exception{
		int a, b;
				
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter value of a and b: ");
		
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		
		swap(a,b);
		
				
	}
}
