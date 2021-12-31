package ma.education.tp6.annotations;

import java.lang.annotation.Annotation;

public class TestReflectionAnnotation {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Calculatrice.class;
		Programmer programmer = (Programmer) c.getDeclaredAnnotation(Programmer.class);
		System.out.println(programmer.id() + ":" + programmer.name());

		Class c1 = CalculatriceMath.class;
		Programmer programmer1 = (Programmer) c1.getAnnotation(Programmer.class);
		System.out.println(programmer1.id() + ":" + programmer1.name());

		Package myPackage = CalculatriceMath.class.getPackage();
		Programmer programmer2 = (Programmer) myPackage.getAnnotation(Programmer.class);
		System.out.println(programmer2.id() + ":" + programmer2.name());
		
		Package pkg = Class.forName("ma.education.tp6.annotations" + ".package-info").getPackage();
		Programmer packageOwner = pkg.getAnnotation(Programmer.class);
		System.out.println(packageOwner.id() + ":" + packageOwner.name());

	}
}
