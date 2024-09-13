class Vehicle {
    private int km; // Τα χιλιόμετρα που έχει διανύσει το όχημα
    private double kmConsumption; // Η κατανάλωση καυσίμου του οχήματος ανά χιλιόμετρο

    private double vehicleEnergy; // Η συνολική ενέργεια του οχήματος
    /**
     * Κατασκευαστής για την κλάση Vehicle.
     * @param km Τα χιλιόμετρα
     * @param kmConsumption Η κατανάλωση ανά χιλιόμετρο
     */
    public Vehicle(int km, double kmConsumption) {
        try {
            if (km < 0 || kmConsumption <= 0) {
                throw new IllegalArgumentException("Τα χιλιόμετρα και η κατανάλωση πρέπει να είναι θετικές τιμές.");
            }
            this.km = km;
            this.kmConsumption = kmConsumption;
            this.vehicleEnergy = km * kmConsumption;
        } catch (IllegalArgumentException e) {
            System.out.println("Συνέβη εξαίρεση: " + e.getMessage());
        }
    }
    // Μέθοδοι getter και setter για την κατανάλωση ανά χιλιόμετρο
    public double getKmConsumption() {
        return kmConsumption;
    }
    public double getVehicleEnergy() {
        return vehicleEnergy;
    }
    public void setVehicleEnergy(double vehicleEnergy) {
        this.vehicleEnergy = vehicleEnergy;
    }
    // Μέθοδοι getter και setter για τα χιλιόμετρα
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    @Override
    public String toString() {
        return "Χιλιόμετρα=" + km + ", Κατανάλωση/χιλιόμετρο=" + kmConsumption + ", Ενέργεια: " + vehicleEnergy;

    }
}

