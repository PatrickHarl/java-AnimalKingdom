package animalKingdom;

abstract class Animal {


	protected static int numberCount = 0;

	protected int number;
	protected String name;
	protected int yearDiscovered;

	public Animal() {

		number = numberCount;
		numberCount++;


	}

	String eat(int food) {

		return name + " ate " + food + " units of food.";

	}

	String getName() {

		return name;

	}

	int getYearDiscovered() {

		return yearDiscovered;

	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	int getId() {

		return number;

	}

	@Override
	public String toString() {


		return "Animals{id=" + number + "," + " name='" + name + "', yearNamed=" + yearDiscovered +"}";

	}



}