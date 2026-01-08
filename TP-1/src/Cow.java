public class Cow extends Animal {

    public Cow() {
        this.name = "Cow";
        this.age = "5";
    }

    @Override
    void makeSound() {
        System.out.println("My name is: " + name + ". I have: " + age + ". MoOoOoOoOoO je suis une vache");
    }
}