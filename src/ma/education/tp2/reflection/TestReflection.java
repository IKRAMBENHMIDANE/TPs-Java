package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;

public class TestReflection extends Salle{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = Salle.class;
		Field[] attributs = cls.getDeclaredFields();
		for (Field att : attributs) {
		System.out.println(att.getName());
		}
		
		
		Method[] methods = cls.getDeclaredMethods();
		for (Method met : methods) {
		System.out.println(met.getName());
		}
		

		Salle o1 = null;
		Salle o2 = null;
		Salle o3 = null;
		Constructor[] cons = cls.getDeclaredConstructors();
		for (Constructor c : cons) {
		int count = c.getParameterCount();
		switch (count) {
		case 0: {
		o1 = (Salle) c.newInstance();
		break;
		}
		case 1: {
		o2 = (Salle) c.newInstance("Salle Informatique");
		break;
		}
		case 2: {
		o3 = (Salle) c.newInstance(2, "Salle des cours");
		break;
		}
		default: {
		break;
		}
		}
		}
		
		o2.equals(o3);
	


	}

}
