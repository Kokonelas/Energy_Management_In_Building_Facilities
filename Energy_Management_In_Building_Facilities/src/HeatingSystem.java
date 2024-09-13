// Κλάση για το σύστημα θέρμανσης
class HeatingSystem {
    private double heatingCapacity; // Η ικανότητα θέρμανσης του συστήματος θέρμανσης σε watt
    private double energyConsumption; // Η κατανάλωση ενέργειας του συστήματος θέρμανσης σε watt
    private double operatingHours; // Ο αριθμός των ωρών που το σύστημα θέρμανσης θα λειτουργήσει
    /**
     * Κατασκευαστής για την κλάση HeatingSystem.
     * @param heatingCapacity Η ικανότητα θέρμανσης σε watt
     * @param energyConsumption Η κατανάλωση ενέργειας σε watt
     */
    public HeatingSystem(double heatingCapacity, double energyConsumption) {
        try {
            if (heatingCapacity <= 0 || energyConsumption <= 0) {
                throw new IllegalArgumentException("Η ικανότητα θέρμανσης και η κατανάλωση ενέργειας πρέπει να είναι θετικές τιμές.");

            }
            this.heatingCapacity = heatingCapacity;
            this.energyConsumption = energyConsumption;
        } catch (IllegalArgumentException e) {
            System.out.println("Συνέβη εξαίρεση: " + e.getMessage());
        }
    }
    // Μέθοδοι getter και setter για την ικανότητα θέρμανσης
    public double getHeatingCapacity() {
        return heatingCapacity;
    }
    public void setHeatingCapacity(double heatingCapacity) {
        this.heatingCapacity = heatingCapacity;
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
        return energyConsumption * operatingHours;
    }
}
