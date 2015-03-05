package builder;

public class RowerMiejski implements RowerBuilder{

	private Rower rower;
	
	public RowerMiejski(){
		this.rower = new Rower();
	}

	@Override
	public void buildRama() {
		getRower().setRama("Rams: rower miejski");
	}

	@Override
	public void buildKola() {
		getRower().setKola("Ko³a: rower miejski");
	}

	@Override
	public void buildKierownica() {
		getRower().setKierownica("Kierownica: rower miejski");
	}

	@Override
	public void buildPrzerzutki() {
		getRower().setPrzerzutki("Przerzutki: rower miejski");
	}

	@Override
	public Rower getRower() {
		return this.rower;
	}
}
