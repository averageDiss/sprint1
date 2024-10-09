package sprint1;

class Cactus extends Plant{
    public Cactus(String name, double height) {
        super(name, height);
        this.typeOfLiquid = "mineralvatten";
    }

    @Override
    public double amountOfLiquid() {
        return 0.02;
    }//polymorfism
}
