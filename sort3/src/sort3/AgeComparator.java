package sort3;

public class AgeComparator {

	public  static int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}

	public static int inverseOrder(Person p1, Person p2) {
		return (-1)*compare(p1, p2);
	}

}
