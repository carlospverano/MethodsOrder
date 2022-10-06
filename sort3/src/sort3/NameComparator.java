package sort3;
public class NameComparator {
	
	public static int compare(Person p1, Person p2) {
		return p1.getName().charAt(0) - p2.getName().charAt(0);
	}
	
	public static int inverseOrder(Person p1, Person p2) {
		return -1 * compare(p1, p2);
	}
	
}
