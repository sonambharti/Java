import java.util.Scanner;

public class PalindromeRange {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    	//range
        int min, max, pcount=0;
        System.out.println("Enter min value for given range:");
        min = sc.nextInt();
        System.out.println("Enter max value for given range:");
        max = sc.nextInt();
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPalindrome(n)) {
                System.out.println(n);
                pcount++;
            }
        }
        System.out.println("Total no of palindrome nos are: "+pcount);
    }
     
    public static boolean isPalindrome(int num) {  
    	int pal, rem, rev=0;
    	pal = num;
		while(num > 0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;			
		}
		if(pal == rev)
		{
			return true;
		}
		return false;
    }
}