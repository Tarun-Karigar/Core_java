class SolarSystem {
    private String name;
    private int numberOfPlanets;
    private double ageInBillionsOfYears;
    private boolean hasAsteroidBelt;
    private String largestPlanet;
    private String smallestPlanet;
    private String hottestPlanet;
    private String coldestPlanet;
    private boolean hasDwarfPlanets;
    private int knownMoons;


    public SolarSystem() {
        this("Milky Way Solar System"); // Chaining to Constructor 2
    }


    public SolarSystem(String name) {
        this(name, 8);
    }
    public SolarSystem(String name, int numberOfPlanets) {
        this(name, numberOfPlanets, 4.6);
    }


    public SolarSystem(String name, int numberOfPlanets, double ageInBillionsOfYears) {
        this(name, numberOfPlanets, ageInBillionsOfYears, true, "Jupiter", "Mercury", "Venus", "Neptune", true, 214); // Chaining to Constructor 5
    }

    public SolarSystem(String name, int numberOfPlanets, double ageInBillionsOfYears,
                       boolean hasAsteroidBelt, String largestPlanet, String smallestPlanet,
                       String hottestPlanet, String coldestPlanet, boolean hasDwarfPlanets,
                       int knownMoons) {
        this.name = name;
        this.numberOfPlanets = numberOfPlanets;
        this.ageInBillionsOfYears = ageInBillionsOfYears;
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.largestPlanet = largestPlanet;
        this.smallestPlanet = smallestPlanet;
        this.hottestPlanet = hottestPlanet;
        this.coldestPlanet = coldestPlanet;
        this.hasDwarfPlanets = hasDwarfPlanets;
        this.knownMoons = knownMoons;
    }
    public void displayInfo() {
        System.out.println("Solar System Name: " + name);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Age (in billions of years): " + ageInBillionsOfYears);
        System.out.println("Has Asteroid Belt: " + (hasAsteroidBelt ? "Yes" : "No"));
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Hottest Planet: " + hottestPlanet);
        System.out.println("Coldest Planet: " + coldestPlanet);
        System.out.println("Has Dwarf Planets: " + (hasDwarfPlanets ? "Yes" : "No"));
        System.out.println("Known Moons: " + knownMoons);
    }

    public static void main(String[] args) {

        SolarSystem defaultSystem = new SolarSystem();
        SolarSystem customSystem = new SolarSystem("Andromeda System", 12, 7.2);

        System.out.println(" Default Solar System ");
        defaultSystem.displayInfo();

        System.out.println(" Custom Solar System ");
        customSystem.displayInfo();
    }
}