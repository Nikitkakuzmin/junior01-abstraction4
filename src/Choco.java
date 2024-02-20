public class Choco extends Food{
    int weight;

    public Choco(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }
}