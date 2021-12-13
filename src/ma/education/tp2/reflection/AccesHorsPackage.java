package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
	public void afficher() {

		System.out.println(id);
		System.out.println(nom);
		
	}

	public static void main(String[] args) {
		Salle s1 = new Salle();

	}

}
