import java.util.ArrayList;
import java.util.List;

public class Owner {
    String name;
    List<Animal> animals;

    public Owner(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println(name + " possède:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
