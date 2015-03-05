package adapter;

import java.util.ArrayList;

public class DrukujListeAdapter implements DrukujListe{

	public DrukujListeAdapter(){}

	@Override
	public void drukujListe(ArrayList<String> lista) {
		
		String ciagStringow = "";
		
		for(String str: lista){
			ciagStringow += str + "\t";
		}
		
		DrukujString ds = new DrukujString();
		ds.print(ciagStringow);
	}
}
