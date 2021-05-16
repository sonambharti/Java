class MyTest2{
    public void objmain(){
        System.out.println(" Method called using object");
    }
    public static void main(String args[]){
        MyTest2 obj = new MyTest2();
        obj.objmain();
        System.out.println("In main");
    }
}