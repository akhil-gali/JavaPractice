package myproj;

class Sample {
	int i, j;

	Sample(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void display() {
		System.out.println(i + " " + j);
	}
}

public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample(10, 20);
		sample.display();

	}

}
