package dp.factory.pizza;

import java.util.ArrayList;

import dp.factory.additions.Cheese;
import dp.factory.additions.Sauce;

public abstract class Pizza {
	protected String name;
	protected ArrayList<String> additions = new ArrayList<>();
	public Cheese cheese;
	protected Sauce sauce;
	
	protected abstract void prepare();
	
}