package dp.observer;

public class App {

	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		RadioStation radioStation = new RadioStation(newsAgency);
		TvStation tvStation = new TvStation(newsAgency);
		newsAgency.setNews("Macierewicz zwolniony!");
		System.out.println("-----------");
		LocalNewspaper localNewspaper = new LocalNewspaper(newsAgency);
		newsAgency.setNews("Morawiecki premierem");
		System.out.println("-----------");
		newsAgency.removeObserver(radioStation);
		newsAgency.setNews("Wielka burza!");
	}
}