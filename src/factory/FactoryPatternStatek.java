package factory;


public class FactoryPatternStatek {

	public FactoryPatternStatek(){}
	
	public Statek makeStatek(String typStatku){
		Statek newStatek = null;
		
		if( typStatku.equals("G") ){
			
			return newStatek = new GaleonStatek();
			
		}else 
		if( typStatku.equals("W")){
			
			return newStatek = new WojennyStatek();
			
		} else return newStatek;
	}
}
