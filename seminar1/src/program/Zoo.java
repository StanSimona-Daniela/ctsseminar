package program;

import java.util.ArrayList;


public class Zoo {

	
	private Zookeeper zookeeper;
	private ArrayList<Animal> animals;
	
	public Zoo() {
        this.zookeeper = new Zookeeper("Gigel");
        this.animals = new ArrayList<>();
    }

    public Zoo(Zookeeper zookeeper, ArrayList<Animal> animalList) {
        this.zookeeper = zookeeper;
        this.animals = animalList;
    }

    public void Add(Animal animal) {
        this.animals.add(animal);
    }

    public void feedAllAnimals() {
        for (Animal a: animals) {
            zookeeper.feed(a);
        }
    }
	
}
