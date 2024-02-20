public abstract class Food {
    String name;
    abstract double getCalories();

    public Food(String name) {
        this.name = name;
    }
}
