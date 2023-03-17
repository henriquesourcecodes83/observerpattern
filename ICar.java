package javaobserverpatternapp.demo;

public interface ICar {
	void register(ICarObserver o);
	void unregister(ICarObserver o);
	void notifyObservers();
}
