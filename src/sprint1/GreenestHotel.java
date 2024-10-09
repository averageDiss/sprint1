package sprint1;
class GreenestHotel {
    private Plant[] plants;

    public GreenestHotel() {
        plants = new Plant[] {
                new Cactus("Igge", 0.2),
                new Palm("Laura",5),
                new CarnivorousPlant("Meatloaf", 0.7),
                new Palm("Olof", 1)
        };
    }

    // Metod för att hitta växt
    public Plant findPlant(String name) {
        for (Plant plant : plants) {
            if (plant.name.equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }

    // Metod för att starta programmet och hantera användarinput
    public void start() {
        while (true) {
            String plantName = javax.swing.JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            // Avsluta loopen om användaren trycker "Avbryt"
            if (plantName == null || plantName.trim().isEmpty()) {
                break;
            }

            Plant selectedPlant = findPlant(plantName);

            if (selectedPlant != null) {
                double liquidAmount = selectedPlant.amountOfLiquid();//polymorfism
                String liquidType = selectedPlant.getTypeOfLiquid();
                javax.swing.JOptionPane.showMessageDialog(null, selectedPlant.name + " ska ha "
                        + liquidAmount + " liter " + liquidType + " per dag");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Ingen växt med namnet " + plantName + " hittades");
            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, "Programmet avslutas");
    }
}
