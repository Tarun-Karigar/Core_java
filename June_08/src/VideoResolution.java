import java.util.Arrays;
import java.util.List;

public class VideoResolution {
    public static void main(String[] args) {
        String device = "Android";
        String resolution = "4K";

        try {
            // Outer try for device compatibility
            if (!device.equals("Android") && !device.equals("iOS") && !device.equals("Windows")) {
                throw new UnsupportedOperationException("Device not compatible with the video player.");
            }
            System.out.println("Device compatible: " + device);

            try {
          
                List<String> supportedResolutions = Arrays.asList("480p", "720p", "1080p", "4K");

                if (!supportedResolutions.contains(resolution)) {
                    throw new IllegalArgumentException("Resolution not supported: " + resolution);
                }

                System.out.println("Resolution supported: " + resolution);
                System.out.println("Video player settings applied successfully.");

            } catch (Exception e) {
                System.out.println("Resolution Error: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Device Compatibility Error: " + e.getMessage());
        }
    }
}
