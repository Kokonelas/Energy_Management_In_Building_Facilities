class LightMicroservice extends EnergyMicroservice {
    private double hourlyConsumption; // Η κατανάλωση ανά ώρα
    private int lightsNum; // Ο αριθμός των φώτων
    private int hours; // Ο αριθμός των ωρών
    private double totalLightsEnergy; // Η συνολική ενέργεια των φώτων
    /**
     * Κατασκευαστής για την κλάση LightMicroservice.
     * @param windEnergyData Δεδομένα αιολικής ενέργειας
     * @param solarEnergyData Δεδομένα ηλιακής ενέργειας
     * @param waterEnergyData Δεδομένα ενέργειας από νερό
     * @param lightsNum Αριθμός φώτων
     * @param weather Πληροφορίες για τον καιρό
     * @param hours Ωρες λειτουργίας
     */
    public LightMicroservice(double windEnergyData, double solarEnergyData, double
            waterEnergyData, int lightsNum, String weather, int hours) {
        super(windEnergyData, solarEnergyData, waterEnergyData, weather);
        this.hourlyConsumption = 2;
        this.lightsNum = lightsNum;
        this.hours = hours;
        this.totalLightsEnergy = lightsNum * hours * hourlyConsumption; // Υπολογισμός συνολικής ενέργειας φώτων

        System.out.println("Συνολική Ενέργεια Φώτων = " + totalLightsEnergy);
    }
}

