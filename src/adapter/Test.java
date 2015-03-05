package adapter;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("s");
		lista.add("d");
		
		DrukujListe dl = new DrukujListeAdapter();
		dl.drukujListe(lista);
	}

}
