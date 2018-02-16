package dp.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

	private List<Observer> observers;
	private String news;
	
	public NewsAgency() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int indexOf = this.observers.indexOf(o);
		if(indexOf>=0) {
			this.observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}
	
}