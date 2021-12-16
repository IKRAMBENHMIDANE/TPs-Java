package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		set1.forEach(i -> System.out.println(i));

		Set<Client> set2 = new HashSet<Client>();
		set2.add(new Client("ALAMI", 1));
		set2.add(new Client("ALAMI", 1));
		set2.add(new Client("SOUHAIL", 2));
		set2.forEach(i -> System.out.println(i));

		Set<Integer> set3 = new TreeSet<>();
		set3.add(22);
		set3.add(11);
		set3.add(15);
		set3.add(9);
		set3.forEach(i -> System.out.println(i));

		// tri par code
		Set<Client> set4 = new TreeSet<>();
		set4.add(new Client("OMAR", 1));
		set4.add(new Client("SAID", 3));
		set4.add(new Client("HASSAN", 2));
		set4.forEach(i -> System.out.println(i));

		
		  List<Client> clientList = new ArrayList<Client>(); clientList.add(new
		 Client("Alex",25)); clientList.add(new Client("Bob",23)); clientList.add(new
		 Client("Ali",12)); //Triez la liste en ordre croissant en fonction du nom
		 Collections.sort(clientList, Comparator.comparing(Client::getName)
		  .thenComparingInt(Client::getCode)); clientList.forEach(i ->
		  System.out.println(i));
		 

		/*
		 * Comparator<Client> c1 = new CodeComparator(); Set<Client> set5 = new
		 * TreeSet<>(c1); set5.add(new Client("OMAR",1)); set5.add(new
		 * Client("SAID",3)); set5.add(new Client("HASSAN",2)); set5.forEach(i ->
		 * System.out.println(i));
		 */

		  Set<Client> set6 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
		  set6.add(new Client("OMAR",1));
		  set6.add(new Client("SAID",3));
		  set6.add(new Client("HASSAN",2));
		  set6.forEach(i-> System.out.println(i));

		  
		  TreeSet<Client> set7 = new TreeSet<>((c1, c2) -> c2.compare(c1));
		  set7.add(new Client("OMAR",1));
		  set7.add(new Client("SAID",3));
		  set7.add(new Client("HASSAN",2));
		  set7.forEach(i-> System.out.println(i));


	}
}
