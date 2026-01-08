public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();
        a.eat();
        a.eat("de la nourriture");

        Cow c = new Cow();
        c.makeSound();
        c.eat();
        c.eat("du foin");

        Dog d = new Dog();
        d.makeSound();
        d.eat();
        d.eat("des os");

        Animal.printInfo();
    }
}