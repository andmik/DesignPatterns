package composite;

public class Programista implements Pracownik{

	private String name;
	private double salary;
	private String stanowisko;
	
	public Programista(){}

	public Programista(String name, double salary, String stanowisko){
		this.name = name;
		this.salary = salary;
		this.stanowisko = stanowisko;
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
	}

	@Override
	public void addPracownik(Pracownik pracownik) {
		
	}

	@Override
	public void removePracownik(Pracownik pracownik) {
		
	}

	@Override
	public Pracownik getChild(int index) {
		return null;
	}
	
	public String toString(){
		return "Name: " + this.getName() + ", salary: " + getSalary();
	}
}
