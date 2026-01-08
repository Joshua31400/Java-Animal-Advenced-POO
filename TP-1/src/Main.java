import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Owner owner = new Owner("Jean");
        owner.addAnimal(new Dog());
        owner.addAnimal(new Cat());
        owner.showAnimals();


        System.out.println("\nTest du Chat");
        Cat cat = new Cat();
        cat.makeSound();
        cat.play();
        cat.hunt();
        cat.eat();

        System.out.println("\nListe d'animaux");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cow());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Wild) {
                ((Wild) animal).hunt();
            }
        }
    }
}
