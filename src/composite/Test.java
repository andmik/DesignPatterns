package composite;

public class Test {

	public static void main(String[] args) {
		Pracownik manager1 = new Manager("Paul Pola", 8000.0d, "Manager");
		Pracownik p1 = new Programista("John Deer", 6000.0d, "programista");
		Pracownik p2 = new Programista("Keen Kuun", 7000.0d, "programista");
		
		manager1.addPracownik(p1);
		manager1.addPracownik(p2);
		
		Pracownik managerLiniowy = new Manager("Naun Mion", 8500.0d, "manager liniowy");
		Pracownik p3 = new Programista("Prod Mundi", 7600.0d, "programista");
		
		managerLiniowy.addPracownik(manager1);
		managerLiniowy.addPracownik(p3);
		
		managerLiniowy.info();
		System.out.println("\n\n");
		manager1.info();
		
	}

}