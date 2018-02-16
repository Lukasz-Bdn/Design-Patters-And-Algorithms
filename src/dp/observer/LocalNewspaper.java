package dp.observer;

public class LocalNewspaper implements Observer {
	
	private String news;

	private Subject subject;
	
	public LocalNewspaper(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if (subject instanceof NewsAgency) {
			NewsAgency newsAgency = (NewsAgency) subject;
			this.news = newsAgency.getNews();
			System.out.println("Local newspaper printing news: " + this.news);
		}
	}

}
