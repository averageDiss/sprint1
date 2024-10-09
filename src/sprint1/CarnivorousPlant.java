package sprint1;

public class CarnivorousPlant extends Plant {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
        this.typeOfLiquid = "proteindryck";
    }

    @Override
    public double amountOfLiquid() {
        return 0.1 + (0.2 * height);
    }
}
