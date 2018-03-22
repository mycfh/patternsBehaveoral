package patterns204.behavioral.observer;

interface Brocker {
	public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
