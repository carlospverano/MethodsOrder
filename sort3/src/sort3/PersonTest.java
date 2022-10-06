package sort3;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PersonTest {
	@Test
	void compare() {
		List <Person> people = new ArrayList<>();
		
		people.add(new Person("Carlos", 21));
		people.add(new Person("Alberto", 21));
		people.add(new Person("Alberto", 19));
		people.add(new Person("Verano", 21));
		
		for (Person person : people) {
			System.out.println(person.getName()+" "+person.getAge());
		}
		
		System.out.println("\nOrdering...\n");
		
		people.sort(NameComparator::compare);
		people.sort(AgeComparator::compare);
		people.forEach(person -> System.out.println(person.getName()+" "+person.getAge()));
		
		System.out.println("\nReordering..\n");
		
		people.sort(NameComparator::inverseOrder);
		people.sort(AgeComparator::inverseOrder);
		people.forEach(person -> System.out.println(person.getName()+" "+person.getAge()));
	}
}
