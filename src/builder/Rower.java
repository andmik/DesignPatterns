package builder;

public class Rower implements RowerPlan{

	private String rama;
	private String kola;
	private String kierownica;
	private String przerzutki;
	
	public Rower(){}

	@Override
	public void setRama(String rama) {	
		this.rama = rama;}
	public String getRama(){return rama;}
	
	@Override
	public void setKola(String kola) {
		this.kola = kola;}
	public String getKola(){return kola;}
	
	@Override
	public void setKierownica(String kierownica) {
		this.kierownica = kierownica;}
	public String getKierownica(){return kierownica;}
	
	@Override
	public void setPrzerzutki(String przerzutki) {
		this.przerzutki = przerzutki;}
	public String getPrzerzutki(){return przerzutki;}
	
}