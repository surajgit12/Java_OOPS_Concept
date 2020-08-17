package Polymorphism;

public class MethodOveloading {

	void sum(int a) {

		System.out.println(a + a); // 20

	}
	void sum(int a, int b) {
		System.out.println(a + b);  // 30
	}

	void sum(double d, double d1) {

		System.out.println(d + d1); //21.0

	}
	
	void sum(float a, float b) {
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOveloading m = new MethodOveloading();
		
		m.sum(10);
		m.sum(10, 20);
	     m.sum(10.5, 10.5);
		m.sum(10.5f, 10.5f);
		
		
		//m.sum(10.5, b);//
		

	}

}
