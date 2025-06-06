public class WifiException {
    public static void checkWiFiConnection(boolean isConnected) {
        if (!isConnected) {
            throw new RuntimeException("No Wi-Fi connection detected!");
        }
        System.out.println("Wi-Fi is connected.");
    }

    public static void main(String[] args) {
        boolean wifiConnected = true;

        try {
            checkWiFiConnection(wifiConnected);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
