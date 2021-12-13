package ma.education.tp1.introduction;

public class Sallecours extends Salle {
	int nombre_place;

	public Sallecours(long id, String nom,int nombre_place) {
    	  super(id, nom);
    	  this.nombre_place = nombre_place;
    	  }
}
