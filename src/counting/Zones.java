package counting;

public enum Zones {
    NORTH_CENTRAL("Benue Kogi , Kwara, Nassarawa, Niger and Plateau"),
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, and Yobe"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, and Imo"),
    SOUTH_WEST(" Ekiti, Lagos, Osun, Ondo, Ogun, Oyo."),
    NORTH_WEST("Kaduna, Kano, Katsina, Kebbi, Jigawa, Sokoto and Zamfara States."),
    SOUTH_SOUTH("Akwa Ibom, Bayelsa, Cross River, Delta, Edo, and Rivers.");

  private final String description;
    private Zones(String description) {
        this.description = description;
    }
    String getDescription() {
        return description;
    }

}




