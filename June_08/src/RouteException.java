public class RouteException {
    public static void main(String[] args) {
        String route = "RouteX";

        try {
            if (!"RouteA".equals(route) && !"RouteB".equals(route)) {
                throw new RuntimeException("Route not found: " + route);
            }
            System.out.println("Route found: " + route);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
