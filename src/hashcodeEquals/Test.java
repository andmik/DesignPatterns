package hashcodeEquals;

import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Country c1 = new Country("Indie", 1000000);
		Country c2 = new Country("Indie", 1500000);
		
		System.out.println("equals: " + c1.equals(c2));
		
		HashMap<Country, String> countries = new HashMap<Country, String>();
			countries.put(c1, "Delhi");
			countries.put(c2, "Delhi");
		Iterator<Country> itr = countries.keySet().iterator();
		
		while( itr.hasNext() ){
			Country c = itr.next();
			System.out.println("name: " + c.getName() + ", population: " + c.getPopulation());
		}
	}

}