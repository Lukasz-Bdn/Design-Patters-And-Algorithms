package dp.observer;

public class RadioStation implements Observer {
	
	private String news;
	
	private Subject subject;
	
	public RadioStation(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof NewsAgency) {
			NewsAgency newsAgency = (NewsAgency) subject;
			this.news = newsAgency.getNews();
			System.out.println("Radio station broadcasting news: " + this.news);
		}
	}
	
}
