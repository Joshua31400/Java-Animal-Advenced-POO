public class Cow extends Animal implements Pet {

    public Cow() {
        this.name = "Cow";
        this.age = "5";
        this.color = "Black and White";
        this.weight = 700;
    }

    @Override
    public void play() {
        System.out.println("Je suis une: " + name + " et j'aime jouer dans le pré.");
    }

    @Override
    void makeSound() {
        System.out.println("Mon nom est: " + name + ", je suis agé de: " + age + " ans," + " MoOoOoOoOoO je suis une vache " + color + " et je pèse " + weight + " kg.");
    }

    @Override
    void eat() {
        System.out.println("Je suis une: " + name + " donc je mange de l'herbe.");
    }
}