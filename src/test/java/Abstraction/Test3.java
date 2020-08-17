package Abstraction;

public class Test3 extends Test2 {

	@Override
	void m2() {

		System.out.println("m2 methods");
	}

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.m1();
		t.m2();
		
	}

}
