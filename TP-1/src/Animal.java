public abstract class Animal {
    private String species;
    protected String color;
    public Integer weight;

    public String getSpecies() {
        return species;
    }

    String name;
    String age;

    abstract void makeSound();

    abstract void eat();

    void eat(String food) {
        System.out.println("L'animal mange: " + food + ".");
    }

    static void printInfo() {
        System.out.println("Je suis un animal donc je doit manger pour vivre.");
    }
}