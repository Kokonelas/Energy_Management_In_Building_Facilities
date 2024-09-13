class EnergyMicroservice {
    private double windEnergyData; // Δεδομένα για την αιολική ενέργεια
    private double solarEnergyData; // Δεδομένα για την ηλιακή ενέργεια
    private double waterEnergyData; // Δεδομένα για την ενέργεια από νερό
    private String weather; // Πληροφορίες για τον καιρό
    /**
     * Κατασκευαστής για την κλάση EnergyMicroservice.
     * @param windEnergyData Δεδομένα αιολικής ενέργειας
     * @param solarEnergyData Δεδομένα ηλιακής ενέργειας
     * @param waterEnergyData Δεδομένα ενέργειας από νερό
     * @param weather Πληροφορίες για τον καιρό
     */
    public EnergyMicroservice(double windEnergyData, double solarEnergyData, double
            waterEnergyData, String weather) {
        this.windEnergyData = windEnergyData;
        this.solarEnergyData = solarEnergyData;
        this.waterEnergyData = waterEnergyData;
        this.weather = weather;
    }
}

