class WaterMicroservice extends EnergyMicroservice {
    private double waterConsumption; // Η κατανάλωση νερού
    /**
     * Κατασκευαστής για την κλάση WaterMicroservice.
     * @param windEnergyData Δεδομένα αιολικής ενέργειας
     * @param solarEnergyData Δεδομένα ηλιακής ενέργειας
     * @param waterEnergyData Δεδομένα ενέργειας από νερό
     * @param weather Πληροφορίες για τον καιρό
     * @param waterConsumption Κατανάλωση νερού
     */
    public WaterMicroservice(double windEnergyData, double solarEnergyData, double
            waterEnergyData, String weather, double waterConsumption) {
        super(windEnergyData, solarEnergyData, waterEnergyData, weather);
        this.waterConsumption = waterConsumption;
        System.out.println("Κατανάλωση Νερού = " + waterConsumption);
    }
}

