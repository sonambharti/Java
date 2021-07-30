import java.util.*;
import java.lang.*;


public class DefangIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required ip address:");
		String str = sc.nextLine();
		String defangIp = "";
		String ipaddress ="";
		for(int i=0; i<str.length(); i++)
		{
			ipaddress = ((str.charAt(i)) == '.') ?
					(defangIp+="[.]" ):(defangIp += (str.charAt(i)));
		}
		
		System.out.println("New IP Address: " + ipaddress);
		

	}

}
