package factory;

public abstract class Statek {

	private String name;
	private double silaOgnia;
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	
	public double getSilaOgnia(){return silaOgnia;}
	public void setSilaOgnia(double silaOgnia){this.silaOgnia = silaOgnia;}
	
	public void stateNaWidoku(){
		System.out.println( getName() + " pojawil sie na widoku." );
	}
	
	public void statekZaNami(){
		System.out.println( getName() + " plynie za nami.");
	}
	
	public void statekStrzela(){
		System.out.println( getName() + " do nas strzela i zabiera " + getSilaOgnia() + " obrazen.");
	}
}
