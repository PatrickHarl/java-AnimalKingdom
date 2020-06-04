package animalKingdom;

public class Fish extends Animal {

	public Fish(String name, int yearDiscovered) {

		this.name = name;
		this.yearDiscovered = yearDiscovered;

	}

	//abstract String move();
	//abstract String breath();
	//abstract String reproduce();

	@Override
	public String move() {

		return "swim";

	}

	@Override
	public String breath() {

		return "gills";

	}

	@Override
	public String reproduce() {

		return "eggs";

	}



}