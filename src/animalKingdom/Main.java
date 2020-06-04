package animalKingdom;
import java.util.*;

public class Main {

	private static List<Animal> filteredList = new ArrayList<>();

	private static void filterAnimals(List<Animal> animals, CheckAnimals tester, boolean printit) {

		filteredList.clear();

		System.out.println();

		for (Animal a : animals) {


			if(tester.test(a))
			{


				if(printit) {

					
					System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered());
					


				}

				filteredList.add(a);

			}

		}

	}

	public static void main(String[] args) {

		List<Animal> animalsList = new ArrayList<>();

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		animalsList.add(panda);
		animalsList.add(zebra);
		animalsList.add(koala);
		animalsList.add(sloth);
		animalsList.add(armadillo);
		animalsList.add(raccoon);
		animalsList.add(bigfoot);
		animalsList.add(pigeon);
		animalsList.add(peacock);
		animalsList.add(toucan);
		animalsList.add(parrot);
		animalsList.add(swan);
		animalsList.add(salmon);
		animalsList.add(catfish);
		animalsList.add(perch);


		animalsList.sort((a1, a2) -> Integer.valueOf(a2.getYearDiscovered()).compareTo(a1.getYearDiscovered()));
		
		System.out.println(animalsList.toString());

		System.out.println();

		animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		System.out.println(animalsList.toString());

		System.out.println();

		animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));

		System.out.println(animalsList.toString());


		filterAnimals(animalsList, a -> a.breath() == "lungs", true);
		filterAnimals(animalsList, a -> (a.breath() == "lungs") && (a.getYearDiscovered() == 1758), true);
		filterAnimals(animalsList, a -> (a.breath() == "lungs") && (a.reproduce() == "eggs"), true);
		filterAnimals(animalsList, a -> a.getYearDiscovered() == 1758, false);

		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));


		for(Animal a : filteredList) {

			System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered());


		}
		

		filterAnimals(animalsList, a -> a instanceof Mammals, false);
		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		for(Animal a : filteredList) {

			System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered());


		}

		


	}


}