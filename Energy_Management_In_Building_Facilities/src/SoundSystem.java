
    // Κλάση για τον χειρισμό ήχου
    class SoundSystem {
        private int speakers; // Αριθμός ηχείων
        private String soundQuality; // Ποιότητα ήχου
        private double powerConsumption; // Κατανάλωση ισχύος
        // Κατασκευαστής που δέχεται παραμέτρους και εκτυπώνει την κατανάλωση ισχύος
        public SoundSystem(int speakers, String soundQuality, double powerConsumption) {
            if (speakers <= 0 || powerConsumption < 0) {
                throw new IllegalArgumentException("Το πλήθος των ηχείων πρέπει να είναι θετικός αριθμός και η κατανάλωση ισχύος δεν μπορεί να είναι αρνητική.");
            }
            this.speakers = speakers;
            this.soundQuality = soundQuality;
            this.powerConsumption = powerConsumption;
            System.out.println("Κατανάλωση Ισχύος Συστήματος Ήχου = " + powerConsumption);
        }
        // Μέθοδος toString() για επιστροφή στοιχείων ως String
        @Override
        public String toString() {

            return "Ηχεία: " + speakers + ", Ποιότητα Ήχου: " + soundQuality + ", Κατανάλωση Ισχύος: " + powerConsumption;
        }
    }


