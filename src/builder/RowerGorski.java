package builder;

public class RowerGorski implements RowerBuilder{

	private Rower rower;
	
	public RowerGorski(){
		this.rower = new Rower();
	}

	@Override
	public void buildRama() {
		getRower().setRama("Rama: rower górski");
	}

	@Override
	public void buildKola() {
		getRower().setKola("Ko³a: rower górski");
	}

	@Override
	public void buildKierownica() {
		getRower().setKierownica("Kierownica: rower górski");
	}

	@Override
	public void buildPrzerzutki() {
		getRower().setPrzerzutki("Przerzutki: rower górski");
	}

	@Override
	public Rower getRower() {
		return this.rower;
	}
	
}
