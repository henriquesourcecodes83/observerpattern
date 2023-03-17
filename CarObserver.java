package javaobserverpatternapp.demo;

public class CarObserver implements ICarObserver {

	@Override
	public void update(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Speed changed ... to " + speed);
	}

}
