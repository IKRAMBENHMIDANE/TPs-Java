package ma.education.tp1.introduction;

public class TestHeritage {

	public static void main(String[] args) {
		Salle s1=new Sallecours(1, "Salle 1", 20);
		Sallecours s2= new Sallecours(2, "Salle 2", 20);
		Sallecours s3=(Sallecours)s1;
		Sallecours s4=s2;
		  
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		Sallecours s6= new Sallecours(2, "Salle 2", 20);
		Sallecours s8=s6;
	

	}

}
