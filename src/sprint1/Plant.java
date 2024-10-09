package sprint1;
//alla växt classer ärver från plant
public abstract class Plant implements Waterable {

    protected double height;
    protected String name;
    protected String typeOfLiquid;

    // Konstruktor för Plant
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // Implementera metoden för att hämta vätsketyp

    @Override
    public String getTypeOfLiquid() {
        return this.typeOfLiquid;
    }

}

