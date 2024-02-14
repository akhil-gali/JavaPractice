



		/*This program is to give overview about how inheritence 
		works in Java
		Note: The class object dosen't child the data of parent class but
		child class object can access the data members and methods of
		 parent class*/
		


package myproj;

class Base {
	int i;
	int j;

	void inputIJ(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void displayIJ() {
		System.out.println("i= " + i + " j= " + j);
	}

}

class Derived extends Base {
	int k;

	void inputK(int k) {
		this.k = k;
	}

	void dispalyK() {
		System.out.println("k= " + k);
	}
}

public class InheritenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base(); // object for Base class
		Derived d = new Derived(); // object for child(Derived) class
		b.inputIJ(10, 20);
		b.displayIJ();
		d.displayIJ(); // default values
		d.inputIJ(25, 30); // assigning values to base class using the object of child class
		d.inputK(90);
		d.displayIJ();
		d.dispalyK();
		b.displayIJ(); // displaying the data members values of base class

	}

}
