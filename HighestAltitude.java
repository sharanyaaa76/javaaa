
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];

            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        System.out.println("Highest Altitude: " + maxAltitude);
    }
}

