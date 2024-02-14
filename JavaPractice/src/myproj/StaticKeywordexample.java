package myproj;

public class StaticKeywordexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statickeywordexample2 ske1=new Statickeywordexample2();
		Statickeywordexample2 ske2=new Statickeywordexample2();
		ske1.method1();
		ske1.display();//m=10 n=20// printing the values of n(Static) and m using first object
		ske2.display();//m=0 n=20//trying to print the values of n(Static) and m using second object
		               //with out calling any method and it prints default value for non static member
		               // prints value that assigned through first method for static member
		               //which means only one memory will be created to static members irrespective of objects
		ske1.method2();
		ske2.display();//m=0 n=30//trying to print using second object by changing the value using first object
		Statickeywordexample2.n=50; //static members can be accessible using class name.. which means 
		                            //static members are related to class memory
		ske1.display();//m=10 n=50  static member value has been changed to 50 
		ske2.display();//m=0 n=50   static member value has been changed to 50 
		ske1.arearect(10,20);
	}

}
