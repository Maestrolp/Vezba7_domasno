package zadaca5;
import java.util.Set;
import java.util.TreeSet;

public class Presek {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Eden");
		mnozestvo1.add("Dva");
		mnozestvo1.add("Tri");
		
		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Pet");
		mnozestvo2.add("Eden");
		mnozestvo2.add("Sest");
		
		System.out.println("Presek na dvete mnozestva");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
		

}
