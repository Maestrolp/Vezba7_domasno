package zadaca3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<SportskiKlub> lista = new ArrayList<SportskiKlub>();
		lista.add(new SportskiKlub("sportskiKlub1", "Trcanje", 5900));
		lista.add(new SportskiKlub("Klub2", "Plivanje", 2546));
		lista.add(new SportskiKlub("tretiKlub", "Skijanje", 4215));
		
		Collections.sort(lista);
		for (SportskiKlub a : lista)
		{
			System.out.println(a.getImeNaKlub());
			System.out.println(a.getSport());
			System.out.println(a.getBrojNaClenovi());
			System.out.println();
		}		
	}
}
