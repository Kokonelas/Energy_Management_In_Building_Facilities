
    class InternetService {
        private String provider; // Πάροχος υπηρεσίας
        private double dataConsumption; // Κατανάλωση δεδομένων
        // Κατασκευαστής που δέχεται παραμέτρους και εκτυπώνει την κατανάλωση δεδομένων
        public InternetService(String provider, double dataConsumption) {
            if (dataConsumption < 0) {
                throw new IllegalArgumentException("Η κατανάλωση δεδομένων δεν μπορεί να είναι αρνητική.");
            }
            this.provider = provider;
            this.dataConsumption = dataConsumption;
            System.out.println("Κατανάλωση Δεδομένων Υπηρεσίας Internet = " + dataConsumption);
        }

        // Μέθοδος για ανανέωση της κατανάλωσης δεδομένων
        public void updateDataConsumption(double newDataConsumption) {
            if (newDataConsumption < 0) {
                throw new IllegalArgumentException("Η νέα κατανάλωση δεδομένων δεν μπορεί να είναι αρνητική.");
            }
            this.dataConsumption = newDataConsumption;
            System.out.println("Ενημέρωση Κατανάλωσης Δεδομένων. Νέα Κατανάλωση = " +
                    newDataConsumption);
        }
        // Μέθοδος toString() για επιστροφή στοιχείων ως String
        @Override
        public String toString() {
            return "Πάροχος: " + provider + ", Κατανάλωση Δεδομένων: " + dataConsumption;
        }
    }


