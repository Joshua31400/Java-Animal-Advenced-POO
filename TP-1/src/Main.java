public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();
        a.eat();

        Cow c = new Cow();
        c.makeSound();
        c.eat();

        Dog d = new Dog();
        d.makeSound();
        d.eat();

        Animal.printInfo();
    }
}