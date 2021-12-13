package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		Salle o1=new Salle();
		Salle o2=new Salle("Salle informatique");
		Salle o3=new Salle (2,"Salle des cours");
		
		System.out.println(o1.nom+' '+o1.id);
		System.out.println(o2.nom+' '+o2.id);
		System.out.println(o3.nom+' '+o3.id);
	}

}
