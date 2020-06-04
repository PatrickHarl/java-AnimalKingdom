package animalKingdom;

public class Mammals extends Animal {

	public Mammals(String name, int yearDiscovered) {

		this.name = name;
		this.yearDiscovered = yearDiscovered;

	}

	//abstract String move();
	//abstract String breath();
	//abstract String reproduce();

	@Override
	public String move() {

		return "walk";

	}

	@Override
	public String breath() {

		return "lungs";

	}

	@Override
	public String reproduce() {

		return "live births";

	}

	



}