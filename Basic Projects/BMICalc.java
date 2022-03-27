import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BMICalc {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		// BMI = (weight in pounds /(height in inches * height in inches)) * 703;
		// BMI = (weight in kilograms /(height in meters * height in meters));
		
		float wIk, hIm;
		float mBMI;
		float wIp, hIf;
		float sBMI;
		Scanner sc =new Scanner(System.in);
		System.out.println("Meteric BMI calculator");
		System.out.println("Enter your weight in kilograms");
		wIk = sc.nextFloat();

		System.out.println("Enter your height in meters");
		hIm = sc.nextFloat();
		
		mBMI = (wIk/(hIm * hIm));
		System.out.println("BMI(metric) = "+ mBMI);
		System.out.println("****************************************************");
		
		System.out.println("Standard BMI Calculator.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your weight in pounds.");
		wIp = Float.parseFloat(br.readLine());
		
		System.out.println("Enter your height in feet.");
		hIf = Float.parseFloat(br.readLine());
		
		sBMI = (wIp/(hIf * hIf))* 703;
		System.out.println("BMI(standard) = "+ sBMI);
		
		/* BMI Categories:
			Underweight = <18.5
			Normal weight = 18.5–24.9
			Overweight = 25–29.9
			Obesity = BMI of 30 or greater */
		
		if(mBMI <= 18.5){
			System.out.println("Under Weight");
		}
		
		else if(mBMI >= 18.5 && mBMI <=24.9){
			System.out.println("Normal Weight");
		}
		
		else if(mBMI >= 25 && mBMI <=29.9){
			System.out.println("Normal Weight");
		}
		
		else(mBMI > 30){
			System.out.println("Obasity");
		}



		
		

	}

}
