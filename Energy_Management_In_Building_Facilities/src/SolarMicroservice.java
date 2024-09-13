
    class SolarMicroservice extends EnergyMicroservice {
        private double solarPanelEfficiency; // Αποτελεσματικότητα φωτοβολταϊκού πάνελ
        private int solarPanelArea; // Εμβαδόν φωτοβολταϊκού πάνελ
        private double totalSolarEnergy; // Συνολική ενέργεια από φωτοβολταϊκό πάνελ

        // Κατασκευαστής που δέχεται παραμέτρους και ελέγχει την εγκυρότητά τους
        public SolarMicroservice(double windEnergyData, double solarEnergyData, double
                waterEnergyData, String weather, double solarPanelEfficiency, int solarPanelArea) {
            super(windEnergyData, solarEnergyData, waterEnergyData, weather);
            if (solarPanelEfficiency <= 0 || solarPanelArea <= 0) {
                throw new IllegalArgumentException("Η αποτελεσματικότητα και το εμβαδόν του φωτοβολταϊκού πάνελ πρέπει να είναι θετικές τιμές.");
            }
            this.solarPanelEfficiency = solarPanelEfficiency;
            this.solarPanelArea = solarPanelArea;
            this.totalSolarEnergy = solarEnergyData * solarPanelEfficiency * solarPanelArea;
            System.out.println("Συνολική Ενέργεια από Φωτοβολταϊκό Πάνελ = " +
                    totalSolarEnergy);
        }
        // Μέθοδος toString() για επιστροφή στοιχείων ως String
        @Override
        public String toString() {
            return "Αποτελεσματικότητα Πάνελ: " + solarPanelEfficiency + ", Εμβαδόν Πάνελ: " +
                    solarPanelArea + ", Συνολική Ενέργεια από Πάνελ: " + totalSolarEnergy;
        }
    }


