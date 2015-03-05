package composite;

public interface Pracownik {

	public String getName();
	public double getSalary();
	public String getStanowisko();
	public void info();
	public void addPracownik(Pracownik pracownik);
	public void removePracownik(Pracownik pracownik);
	public Pracownik getChild(int index);
	public String toString();
}
