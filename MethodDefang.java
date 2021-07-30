import java.util.*;
import java.lang.*;
class MethodDefang
{  
    public static String defangIPaddr(String address) 
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter required ip address:");
		String address = sc.nextLine();
        System.out.println(defangIPaddr(address));
    }
}