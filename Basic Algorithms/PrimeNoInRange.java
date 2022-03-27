import java.util.Scanner;

public class PrimeNoInRange {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    	//range
        int min, max;
        System.out.println("Enter min value for given range:");
        min = sc.nextInt();
        System.out.println("Enter max value for given range:");
        max = sc.nextInt();
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}