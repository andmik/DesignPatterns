package builder;


public class TestRower {

	public static void main(String[] args) {
		
		//---g�rski rower
		
		RowerBuilder gorskiRower = new RowerGorski();
		
		RowerMechanik rowerEngineer = new RowerMechanik(gorskiRower);
		
		rowerEngineer.zlozRower();
		
		//---miejski rower
		
		RowerBuilder miejskiRower = new RowerMiejski();
		
		RowerMechanik rowerEngineer2 = new RowerMechanik(miejskiRower);
		
		rowerEngineer2.zlozRower();
		
		//--- wywo�anie rower�w
		
		Rower pierwszyRower = rowerEngineer.getRower();
		
		Rower drugiRower = rowerEngineer2.getRower();
		
		System.out.println("Rower g�rski\n rama: " + pierwszyRower.getRama()
				+ "\n ko�a: " + pierwszyRower.getKola()
				+ "\n kierownica: " + pierwszyRower.getKierownica()
				+ "\n przerzutki: " + pierwszyRower.getPrzerzutki());
		
		System.out.println("\nRower miejski\n rama: " + drugiRower.getRama()
				+ "\n ko�a: " + drugiRower.getKola()
				+ "\n kierownica: " + drugiRower.getKierownica()
				+ "\n przerzutki: " + drugiRower.getPrzerzutki());
		
	}

}
