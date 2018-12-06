public class FlyingPillow {
        private int fluffiness; // 0 to 10
        private int altitude; // in feet?
        private String type; // nimbus, cirrus, stratus, cumulus, cumulo-nimbus
        private boolean isPrecipitating;
        private boolean isElectric;

        public FlyingPillow(int fluffiness, int altitude, String type, boolean isPrecipitating, boolean isElectric) {
            this.fluffiness = fluffiness;
            this.altitude = altitude;
            this.type = type;
            this.isPrecipitating = isPrecipitating;
            this.isElectric = isElectric;
        }

        public String toString() {
            return this.type + " pillow: " + this.fluffiness + " fluffy";
        }

}
