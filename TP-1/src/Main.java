import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Dog();
        Pet pet2 = new Cow();

        System.out.println("Manipulation via Pet");
        pet1.play();
        pet2.play();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cow());
        animals.add(new Dog());
        animals.add(new Cow());

        System.out.println("\nParcours de la liste d'animaux");
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof Pet) {
                ((Pet) animal).play();
            }
        }
        Animal.printInfo();
    }
}
