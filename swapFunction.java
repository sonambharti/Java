

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Swaping {
	static int[] swap(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		int res[] = new int[2];
		res[0] = a;		
		res[1] = b;
		
		return res;
		
	}
	
	public static void main(String[] args) throws Exception{
		int a, b;
				
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter value of a and b: ");
		
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		
		int res[]=swap(a,b);
		
		System.out.println("After swapping value of a: " + res[0] +" and b is: " +res[1]);
		
				
	}
}
