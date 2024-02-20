public class Burger extends Food{
    int meatAmount;
    int meatType;

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if(meatType == 1)
            return meatAmount * 840;
        else return meatAmount * 560;
    }
}
