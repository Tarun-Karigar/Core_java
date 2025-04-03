class ElectronicsStore {
    private String storeName;
    private int totalProducts;
    private double averageRating;
    private boolean hasOnlineStore;
    private String mostPopularItem;
    private String highestPricedItem;
    private String bestSellingBrand;
    private int numberOfEmployees;
    private boolean offersWarranty;
    private int yearsInBusiness;

    public ElectronicsStore() {
        this("ElectroMart");
    }

    public ElectronicsStore(String storeName) {
        this(storeName, 1000);
    }

    public ElectronicsStore(String storeName, int totalProducts) {
        this(storeName, totalProducts, 4.5);
    }

    public ElectronicsStore(String storeName, int totalProducts, double averageRating) {
        this(storeName, totalProducts, averageRating, true, "Smartphone", "8K TV", "Samsung", 25, true, 10);
    }

    public ElectronicsStore(String storeName, int totalProducts, double averageRating,
                            boolean hasOnlineStore, String mostPopularItem, String highestPricedItem,
                            String bestSellingBrand, int numberOfEmployees, boolean offersWarranty,
                            int yearsInBusiness) {
        this.storeName = storeName;
        this.totalProducts = totalProducts;
        this.averageRating = averageRating;
        this.hasOnlineStore = hasOnlineStore;
        this.mostPopularItem = mostPopularItem;
        this.highestPricedItem = highestPricedItem;
        this.bestSellingBrand = bestSellingBrand;
        this.numberOfEmployees = numberOfEmployees;
        this.offersWarranty = offersWarranty;
        this.yearsInBusiness = yearsInBusiness;
    }

    public void displayStoreInfo() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Average Rating: " + averageRating + "/5");
        System.out.println("Has Online Store: " + (hasOnlineStore ? "Yes" : "No"));
        System.out.println("Most Popular Item: " + mostPopularItem);
        System.out.println("Highest Priced Item: " + highestPricedItem);
        System.out.println("Best Selling Brand: " + bestSellingBrand);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Offers Warranty: " + (offersWarranty ? "Yes" : "No"));
        System.out.println("Years in Business: " + yearsInBusiness);
    }

    public static void main(String[] args) {
        ElectronicsStore defaultStore = new ElectronicsStore();
        ElectronicsStore premiumStore = new ElectronicsStore("Tech Paradise", 5000, 4.8);

        System.out.println("=== Default Electronics Store ===");
        defaultStore.displayStoreInfo();

        System.out.println("\n=== Premium Electronics Store ===");
        premiumStore.displayStoreInfo();
    }
}