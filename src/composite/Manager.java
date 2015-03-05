package composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager implements Pracownik{

	private String name;
	private double salary;
	private String stanowisko;
	
	private List<Pracownik> listaPracownicy;
	
	public Manager(){}

	public Manager(String name, double salary, String stanowisko){
		this.name = name;
		this.salary = salary;
		this.stanowisko = stanowisko;
		listaPracownicy = new ArrayList<Pracownik>();
	}
	
	@Override
	public String getName() {return this.name;}
	public void setName(String name){this.name = name;}
	
	@Override
	public double getSalary() {return this.salary;}
	public void setSalary(double salary){this.salary = salary;}
	
	@Override
	public String getStanowisko() {return stanowisko;}
	public void setStanowisko(String stanowisko){this.stanowisko = stanowisko;}
	
	@Override
	public void info() {
		System.out.println("-----");
		System.out.println("Name: " + getName()
				+"\nsalary: " + getSalary()
				+"\nstanowisko: " + getStanowisko());
		System.out.println("-----");
		
		Iterator<Pracownik> itr = listaPracownicy.iterator();
		while( itr.hasNext() ){
			Pracownik pracownik = itr.next();
			pracownik.info();
		}
	}

	@Override
	public void addPracownik(Pracownik pracownik) {
		this.listaPracownicy.add(pracownik);
	}

	@Override
	public void removePracownik(Pracownik pracownik) {
		System.out.println("Zostanie skasowany pracownik:"
				+ "\n" + pracownik.toString() );
		this.listaPracownicy.remove(pracownik);
	}

	@Override
	public Pracownik getChild(int index) {
		return listaPracownicy.get(index);
	}
	
	public String toString(){
		return "Name: " + this.getName() + ", salary: " + getSalary();
	}

}