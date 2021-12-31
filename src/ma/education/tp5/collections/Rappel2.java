package ma.education.tp5.collections;

import java.util.Set;
import java.util.TreeSet;

public class Rappel2 {
	public static void main(String[] args) {
		Set<Point> l = new TreeSet<>((p1, p2) -> (int) (p1.x - p2.x));
		l.add(new Point(12.5, 13));
		l.add(new Point(14.4, 15));
		l.add(new Point(12.50, 15));
		l.add(new Point(11.50, 15));
		l.forEach(i -> System.out.println(i));
	}
}
