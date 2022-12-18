package zadaca2;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		MetodiZaListaNiza object = new MetodiZaListaNiza();
		
		List<String> lista = new ArrayList<String>();
		lista.add("item1");
		lista.add("item2");
		object.ListToArray(lista);
		
		String[] niza = { "Item1", "Item2", "ItemC"};
		object.arrayToList(niza);

	}

}
