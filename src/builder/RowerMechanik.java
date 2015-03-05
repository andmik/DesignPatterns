package builder;

public class RowerMechanik {

	RowerBuilder rowerBuilder;
	
	public RowerMechanik(RowerBuilder rowerBuilder){
		this.rowerBuilder = rowerBuilder;
	}
	
	public Rower getRower(){
		return this.rowerBuilder.getRower();
	}
	
	public void zlozRower(){
		this.rowerBuilder.buildRama();
		this.rowerBuilder.buildKola();
		this.rowerBuilder.buildKierownica();
		this.rowerBuilder.buildPrzerzutki();
	}
}
