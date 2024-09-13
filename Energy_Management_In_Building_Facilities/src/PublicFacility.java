class PublicFacility {
    private int pubFacilityArea; // Η περιοχή της δημόσιας εγκατάστασης
    private String pubFacilityDescription; // Η περιγραφή της δημόσιας εγκατάστασης
    private int floors; // Οι ορόφοι της δημόσιας εγκατάστασης
    private double totalFacilityEnergy; // Η συνολική ενέργεια της δημόσιας εγκατάστασης
    /**
     * Κατασκευαστής για την κλάση PublicFacility.
     * @param facilityArea Η περιοχή
     * @param facilityDescription Η περιγραφή
     * @param floors Ο αριθμός των ορόφων
     */
    public PublicFacility(int facilityArea, String facilityDescription, int floors) {
        try {
            if (facilityArea <= 0 || floors <= 0) {
                throw new IllegalArgumentException("Η περιοχή και οι ορόφοι πρέπει να είναι θετικές τιμές.");
            }

            this.pubFacilityArea = facilityArea;
            this.pubFacilityDescription = facilityDescription;
            this.floors = floors;
            this.totalFacilityEnergy = facilityArea * 3.2 * floors; // Υπολογισμός συνολικής ενέργειας
            System.out.println("Ενέργεια Δημόσιας Εγκατάστασης = " + totalFacilityEnergy);
        } catch (IllegalArgumentException e) {
            System.out.println("Συνέβη εξαίρεση: " + e.getMessage());
        }
    }
    // Μέθοδοι getter και setter για την περιοχή
    public int getPubFacilityArea() {
        return pubFacilityArea;
    }
    public void setPubFacilityArea(int pubFacilityArea) {
        this.pubFacilityArea = pubFacilityArea;
    }
    // Μέθοδοι getter και setter για την περιγραφή
    public String getPubFacilityDescription() {
        return pubFacilityDescription;
    }
    public void setPubFacilityDescription(String pubFacilityDescription) {
        this.pubFacilityDescription = pubFacilityDescription;
    }
    // Μέθοδοι getter και setter για τους ορόφους
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    // Μέθοδος getter για την συνολική ενέργεια
    public double getTotalFacilityEnergy() {
        return totalFacilityEnergy;
    }
    @Override
    public String toString() {
        return "Περιγραφή: " + pubFacilityDescription + ", Περιοχή: " + pubFacilityArea +
                ", Ορόφοι: " + floors + ", Ενέργεια: " + totalFacilityEnergy;

    }
}

