class Child extends Parent{
public void Child(){
	System.out.println("it is invoked");
}
public void toTest(){
	super();-> This is used for a constructor chaining to ease relationship in the inheritance
System.out.println("child is invoked");
}
/*public static void main(String args[]){
    Child child = new Child();
	child.business();
}*/
}
