public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Cow c = new Cow();
        c.makeSound();

        Animal.printInfo();
    }
}