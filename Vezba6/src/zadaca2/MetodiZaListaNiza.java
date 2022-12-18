package zadaca2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {
	public void ListToArray (List<String> lista)
	{
		String[] niza = new String [lista.size()];
		
		lista.toArray(niza);
		
		System.out.println("Lista pretovrena vo niza");
		
		for (String s : niza)
		{
			System.out.println(s);
		}
	}
	public void arrayToList (String [] niza)
	{
		List<String> lista = new ArrayList<String>();
		lista = Arrays.asList(niza);
		
		System.out.println("Niza pretvorena vo lista");
		
		for (String s :lista)
		{
			System.out.println(s);
		}
	}

}
