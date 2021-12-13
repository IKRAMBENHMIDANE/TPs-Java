package ma.education.tp.interfacekeyword;

public class Humain extends Animal implements Carnivore,Herbivore{

	@Override
	public void manger(Vegetal vegetal) {
		System.out.println("Un végétal se mange");
		
	}

	@Override
	public void manger(Animal animal) {
		System.out.println("Un animal mange");
		
	}

}
