
    // Κλάση για το σύστημα ασφαλείας
    class SecuritySystem {
        private String securityLevel; // Επίπεδο ασφαλείας
        private double securityPowerConsumption; // Κατανάλωση ισχύος ασφαλείας
        // Κατασκευαστής που δέχεται παραμέτρους και εκτυπώνει την κατανάλωση ισχύος ασφαλείας
        public SecuritySystem(String securityLevel, double securityPowerConsumption) {
            if (securityPowerConsumption < 0) {
                throw new IllegalArgumentException("Η κατανάλωση ισχύος ασφαλείας δεν μπορεί να είναι αρνητική.");
            }
            this.securityLevel = securityLevel;
            this.securityPowerConsumption = securityPowerConsumption;
            System.out.println("Κατανάλωση Ισχύος Ασφαλείας Συστήματος = " +
                    securityPowerConsumption);
        }
        // Μέθοδος toString() για επιστροφή στοιχείων ως String
        @Override
        public String toString() {
            return "Επίπεδο Ασφαλείας: " + securityLevel + ", Κατανάλωση Ισχύος Ασφαλείας: " +
                    securityPowerConsumption;
        }
    }


