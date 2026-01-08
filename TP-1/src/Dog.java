public class Dog extends Animal {

    public Dog () {
        this.name = "Dog";
        this.age = "3";
    }

    @Override
    void makeSound() {
        System.out.println("Mon nom est: " + name + ", je suis agé de: " + age + " ans," +" WoOoOoOoOoOFFFF je suis un chien");
    }

    @Override
    void eat() {
        System.out.println("Je suis un: " + name + " donc je mange des croquettes.");
    }
}
