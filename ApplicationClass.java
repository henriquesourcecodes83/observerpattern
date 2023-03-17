package javaobserverpatternapp.demo;

public class ApplicationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		
		CarObserver o1 = new CarObserver();
		CarObserver o2 = new CarObserver();
		
		c.register(o1);
		c.register(o2);
		
		c.setSpeed(150);
		
	}

}
