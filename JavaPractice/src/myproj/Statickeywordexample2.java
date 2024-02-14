package myproj;

class Statickeywordexample2 {
int m;
static int n;

  void method1() {
	  m=10;
	  n=20;
  }
  static void method2() {
	  n=30;
	//  m=0;//will throw error hen you try to access a non static member inside a static method
  }
  void display() {
	  System.out.println("m= "+m+ " n= "+n);
  }
  void arearect(int len, int bre) {
	  int area;
	  area= len*bre;
		/* return area; */
	  System.out.println(area);
  }
}
