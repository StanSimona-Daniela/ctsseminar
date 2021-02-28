package program;

public class Zookeeper {
private String name;

public Zookeeper(String name) {
	super();
	this.name = name;
}

public void feed(Animal animal) {
	System.out.print(this.name + " feeds " + animal.getName());
}

}
