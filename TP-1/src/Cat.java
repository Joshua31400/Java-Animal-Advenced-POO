public class Cat extends Animal implements Pet, Wild {

    public Cat() {
        this.name = "Chat";
        this.age = "2ans";
        this.color = "Gris bleuté vif";
        this.weight = 5;
    }

    @Override
    void makeSound() {
        System.out.println("Je suis un " + name + ", MiIiIiAaAaAaooooOOOOuuuUUUUu je suis un chat " + color + " et je pèse " + weight +" kg.");
    }

    @Override
    void eat() {
        System.out.println("Je suis un " + name + " donc je mange des croquettes.");
    }

    @Override
    public void play() {
        System.out.println(name + " joue avec une pelote de laine.");
    }

    @Override
    public void hunt() {
        System.out.println("Un " + name + " chasse une souris !");
    }
}