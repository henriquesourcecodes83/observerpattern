package javaobserverpatternapp.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
		
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	private int _flag;
		
	public int getFlag() {
		return _flag;
	}

	public void setFlag(int flag) {
		this._flag = flag;
		
		notifyObservers();
	}

	@Override
	public void register(IObserver o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for(IObserver o : observers) {
			o.update();
		}
	}

}
