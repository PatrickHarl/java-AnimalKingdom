package animalKingdom;

public class Birds extends Animal {

	public Birds(String name, int yearDiscovered) {

		this.name = name;
		this.yearDiscovered = yearDiscovered;

	}

	//abstract String move();
	//abstract String breath();
	//abstract String reproduce();

	@Override
	public String move() {

		return "fly";

	}

	@Override
	public String breath() {

		return "lungs";

	}

	@Override
	public String reproduce() {

		return "eggs";

	}



}