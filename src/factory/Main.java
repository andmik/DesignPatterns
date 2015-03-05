package factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		FactoryPatternStatek factoryStatek = new FactoryPatternStatek();
		Statek statek = null;
		
		Scanner userScanner = new Scanner(System.in);
		System.out.println("Wybierz rodzaj statku: G/W");
		
		if( userScanner.hasNextLine() ){
			String wyborStatku = userScanner.nextLine();
			statek = factoryStatek.makeStatek(wyborStatku);	
		}
		if( statek != null ){
			wywolajStatek(statek);
		}else{
			System.out.println("Nale¿y wybraæ G lub W");
		}
		
		userScanner.close();
	}

	public static void wywolajStatek(Statek statek){
		statek.stateNaWidoku();
		statek.statekZaNami();
		statek.statekStrzela();
	}
}
