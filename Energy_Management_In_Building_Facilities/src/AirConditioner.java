
class AirConditioner {
    private double coolingCapacity; // Η ψυκτική ικανότητα του κλιματιστικού σε watts
    private double energyConsumption; // Η κατανάλωση ενέργειας του κλιματιστικού σε watts
    private double operatingHours; // Ο αριθμός των ωρών που θα λειτουργήσει το κλιματιστικό
    /**
     * Κατασκευαστής για την κλάση AirConditioner.
     * @param coolingCapacity Η ψυκτική ικανότητα σε watts
     * @param energyConsumption Η κατανάλωση ενέργειας σε watts
     */
    public AirConditioner(double coolingCapacity, double energyConsumption) {
        try {
            if (coolingCapacity <= 0 || energyConsumption <= 0) {
                throw new IllegalArgumentException("Η ψυκτική ικανότητα και η κατανάλωση ενέργειας πρέπει να είναι θετικές τιμές.");
            }
            this.coolingCapacity = coolingCapacity;
            this.energyConsumption = energyConsumption;
        } catch (IllegalArgumentException e) {
            System.out.println("Συνέβη εξαίρεση: " + e.getMessage());
        }
    }
    // Μέθοδοι getter και setter για την ψυκτική ικανότητα
    public double getCoolingCapacity() {
        return coolingCapacity;
    }
    public void setCoolingCapacity(double coolingCapacity) {
        this.coolingCapacity = coolingCapacity;
    }
    // Μέθοδοι getter και setter για την κατανάλωση ενέργειας
    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    // Μέθοδοι getter και setter για τις ώρες λειτουργίας
    public double getOperatingHours() {
        return operatingHours;
    }
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }
    /**
     * Υπολογίζει τη συνολική κατανάλωση ενέργειας.
     * @return Η συνολική κατανάλωση ενέργειας
     */
    public double calculateEnergyConsumption() {
        if (operatingHours < 0) {
            throw new IllegalArgumentException("Οι ώρες λειτουργίας δεν μπορούν να είναι αρνητικές.");
        }
        return energyConsumption * operatingHours;
    }
}
