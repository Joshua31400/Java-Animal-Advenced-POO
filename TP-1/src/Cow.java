public class Cow extends Animal {

    public Cow() {
        this.name = "Cow";
        this.age = "5";
    }

    @Override
    void makeSound() {
        System.out.println("Mon nom est: " + name + ", je suis agé de: " + age + " ans," + " MoOoOoOoOoO je suis une vache");
    }

    @Override
    void eat() {
        System.out.println("Je suis une: " + name + " donc je mange de l'herbe.");
    }
}