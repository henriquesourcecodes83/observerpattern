package javaobserverpatternapp.demo;

import java.util.ArrayList;
import java.util.List;

public class Car implements ICar {
	
	List<ICarObserver> observers = new ArrayList<ICarObserver>();
	
	private int speed = 0;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		notifyObservers();
	}

	@Override
	public void register(ICarObserver o) {
		// TODO Auto-generated method stub		
		observers.add(o);
	}

	@Override
	public void unregister(ICarObserver o) {
		// TODO Auto-generated method stub		
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for(ICarObserver o : observers) {
			o.update(this.speed);
		}
		
	}
	
}
