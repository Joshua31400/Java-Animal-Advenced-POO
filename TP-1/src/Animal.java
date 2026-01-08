public class Animal {
    private String species;
    protected String color;
    public Integer weight;

    public String getSpecies() {
        return species;
    }

    String name;
    String age;

    void makeSound() {
        System.out.println();
    }

    void eat() {
        System.out.println();
    }

    void eat(String food) {
        System.out.println("L'aniamal mange: " + food + ".");
    }

    static void printInfo() {
        System.out.println("Je suis un animal donc je doit manger pour vivre.");
    }
}