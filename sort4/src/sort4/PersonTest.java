package sort4;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PersonTest {
	@Test
	void compare() {
		List<Person> people = new ArrayList();
		
		people.add(new Person("Carlos", "21"));
		people.add(new Person("Alberto", "21"));
		people.add(new Person("Perez", "21"));
		people.add(new Person("Verano", "21"));
		
		for (Person person : people) {
			System.out.println(person.getName());
		}
		System.out.println("\nOrdering...\n");
		
		people.sort((Person p1, Person p2) -> (p1.getName().charAt(0) - p2.getName().charAt(0)));
		people.forEach(person -> System.out.println(person.getName()));
		
		System.out.println("\nReordering...\n");
		people.sort((Person p1, Person p2)-> (-1)*(p1.getName().charAt(0) - p2.getName().charAt(0)));
		people.forEach(person -> System.out.println(person.getName()));
		
		System.out.println('c' - 'a');
	}
}
