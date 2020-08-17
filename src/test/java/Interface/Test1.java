package Interface;

public class Test1 implements Itr {

	public static void main(String[] args) {

    /*  Test1 t = new Test1();
      t.m1();
      t.m2();*/
      
      
      Itr  t1 = new Test1();  // dynamic polymo  /
      
      t1.m1();
      t1.m2();
      
     /// WebDriver driver  = new FireFoxDriver();

	}

	@Override
	public void m1() {

		System.out.println("M1 Method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 Method");
	}

}
