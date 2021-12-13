package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
	double surface;
	abstract public double calculerSurface();
	public void afficherSurface() {
		System.out.println(this.surface);
		}



}
