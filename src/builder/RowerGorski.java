package builder;

public class RowerGorski implements RowerBuilder{

	private Rower rower;
	
	public RowerGorski(){
		this.rower = new Rower();
	}

	@Override
	public void buildRama() {
		getRower().setRama("Rama: rower g�rski");
	}

	@Override
	public void buildKola() {
		getRower().setKola("Ko�a: rower g�rski");
	}

	@Override
	public void buildKierownica() {
		getRower().setKierownica("Kierownica: rower g�rski");
	}

	@Override
	public void buildPrzerzutki() {
		getRower().setPrzerzutki("Przerzutki: rower g�rski");
	}

	@Override
	public Rower getRower() {
		return this.rower;
	}
	
}
