public class LowBattery {
    public static void main(String[] args) {
        int battery = 5;

        try {
            if (battery < 10) {
                throw new IllegalStateException("Battery low! Please recharge.");
            }
            System.out.println("Battery level is sufficient.");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
