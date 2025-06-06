public class MapZoom {
    public static void main(String[] args) {
        int zoomLevel = 18;
        int maxZoom = 20;

        try {
            if (zoomLevel > maxZoom) {
                throw new IllegalArgumentException("Invalid zoom level: " + zoomLevel);
            }
            System.out.println("Zoom level is acceptable: " + zoomLevel);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
