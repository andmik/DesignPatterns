package hashcodeEquals;

public class Country {

	private String name;
	private long population;
	
	public Country(){}
	
	public Country(String name, long population){
		this.name = name;
		this.population = population;
	}
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public long getPopulation(){return population;}
	public void setPopulation(long population){this.population = population;}
	
	public boolean equals(Object obj){
		if( this == obj )
			return true;
		if( obj == null )
			return false;
		if( this.getClass() != obj.getClass() )
			return false;
		Country otherObject = (Country) obj;
		return this.getName().equals(otherObject.getName());
	}
	
	public int hashCode(){
		final int wartosc = 31;
		int result = 1;
		result = wartosc * result + ((this.getName() == null) ? 0 : this.getName().hashCode());
		return result;
	}
}
