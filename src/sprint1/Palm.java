package sprint1;

public class Palm extends Plant {

    public Palm( String name, double height) {
        super(name, height);
        this.typeOfLiquid = "kranvatten";
    }

    @Override
    public double amountOfLiquid() {
        return 0.5 * height;
    }
}
// Palmer: En palm behöver 0,5 liter kranvatten per dag * sin längd i meter. En palm som är 3
//meter hög behöver alltså 0,5 * 3 = 1,5 liter vatten/dag.