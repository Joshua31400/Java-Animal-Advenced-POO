public class Dog extends Animal implements Pet, Wild {
    public Dog () {
        this.name = "Chien";
        this.age = "3ans";
        this.color = "Brun";
        this.weight = 20;
    }

    @Override
    public void play() {
        System.out.println("Je suis un: " + name + " et j'aime jouer dans le park.");
    }

    @Override
    void makeSound() {
        System.out.println("Je suis un " + name + ", je suis agé de " + age +" WoOoOoOoOoOFFFF je suis " + color + " et je pèse " + weight + " kg.");
    }

    @Override
    void eat() {
        System.out.println("Je suis un " + name + " donc je mange des croquettes.");
    }

    @Override
    public void hunt() {
        System.out.println("Un " + name + " chasse un chat !");
    }
}
