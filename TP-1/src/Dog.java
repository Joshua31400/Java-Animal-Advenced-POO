public class Dog extends Animal {

    public Dog () {
        this.name = "Dog";
        this.age = "3";
        this.color = "Brown";
        this.weight = 20;
    }

    @Override
    void makeSound() {
        System.out.println("Mon nom est: " + name + ", je suis agé de: " + age + " ans," +" WoOoOoOoOoOFFFF je suis un chien " + color + " et je pèse " + weight + " kg.");
    }

    @Override
    void eat() {
        System.out.println("Je suis un: " + name + " donc je mange des croquettes.");
    }
}
