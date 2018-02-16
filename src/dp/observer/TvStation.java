package dp.observer;

public class TvStation implements Observer {
	
	private String news;

	private Subject subject;

	public TvStation(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof NewsAgency) {
			NewsAgency newsAgency = (NewsAgency) subject;
			this.news = newsAgency.getNews();
			System.out.println("Showing news in TV: " + this.news);
		}
	}

}
