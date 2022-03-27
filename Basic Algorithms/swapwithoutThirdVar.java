import java.io.BufferedReader;
import java.io.InputStreamReader;


public class swapwithoutThirdVar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a,b;
		
		System.out.println("Enter value of a and b: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(bf.readLine());
		b = Integer.parseInt(bf.readLine());
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.printf("After swaping....\nValue of a: %d and b: %d", a, b);


	}

}
