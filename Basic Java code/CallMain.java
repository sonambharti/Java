import java.lang.*;

class Class1{
    public static void main(String args[]){
        for(String s: args){
            System.out.println("Input String is: :"+s);
        }
    }
}

class CallMain{
    public static void main(String args[]){
        String names[] = {"Komal", "Gopi", "Vijay", "Satyam"};
        Class1.main(names);
    }
}