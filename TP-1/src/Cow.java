public class Cow extends Animal implements Pet, Wild {

    public Cow() {
        this.name = "Vache";
        this.age = "5ans";
        this.color = "Noir et Blanc";
        this.weight = 700;
    }

    @Override
    public void play() {
        System.out.println("Je suis une " + name + " et j'aime jouer dans le pré.");
    }

    @Override
    void makeSound() {
        System.out.println("Je suis une " + name + ", je suis agé de " + age + " MoOoOoOoOoO je suis une vache " + color + " et je pèse " + weight + " kg.");
    }

    @Override
    void eat() {
        System.out.println("Je suis une: " + name + " donc je mange de l'herbe.");
    }

    @Override
    public void hunt() {
        System.out.println("Une " + name + " chasse de la pelouze !");
    }}