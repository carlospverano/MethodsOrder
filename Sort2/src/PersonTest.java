import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PersonTest {
	@Test
	void compareTo() {
		List<Person> people = new ArrayList();
		
		people.add(new Person("harold", 23));
		people.add(new Person("carlos", 21));
		//people.add(new Person("acercandra", "52"));
		people.add(new Person("carlos", 12));
		people.add(new Person("abuelo", 12));
		
		
		for (Person person : people) {
			System.out.println(person.getName() +" " +person.getAge());
		}
		
		Collections.sort(people, new NameComparator());
		Collections.sort(people, new AgeComparator());
				
	    System.out.println("\nordering...\n");

		people.forEach(person -> System.out.println(person.getName() +" "+person.getAge()));
	}
}
