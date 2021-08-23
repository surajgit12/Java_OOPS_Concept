package Polymorphism;

public class Child extends Parent {

	  public void eat() throws InterruptedException {
		  
		Thread.sleep(5000); //
		System.out.println("Eating Pani Puri");
		
	}
	  
	  public void play() throws InterruptedException {
		  Thread.sleep(5000); //
			System.out.println("Playing Cricket");
	  }

	public static void main(String[] args) throws InterruptedException {

		  Parent p = new Child(); // run time

		  p.eat();

	}

}
