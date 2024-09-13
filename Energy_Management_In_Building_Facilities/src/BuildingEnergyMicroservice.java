import java.util.ArrayList;

import java.util.List;

class BuildingEnergyMicroservice extends EnergyMicroservice {

    private double totalEnergy; // Συνολική ενέργεια του κτιρίου
    private List<StudyRoom> studyRooms; // Δωμάτια μελέτης στο κτίριο
    private List<PublicFacility> publicFacilities; // Δημόσιες εγκαταστάσεις στο κτίριο

    private WaterMicroservice waterService; // Υπηρεσία ύδατος για το κτίριο
    private HVACSystem hvacSystem; // Σύστημα HVAC για το κτίριο
    // Κατασκευαστής που αρχικοποιεί τις μεταβλητές
    public BuildingEnergyMicroservice(double windEnergyData, double solarEnergyData, double
            waterEnergyData, String weather) {
        super(windEnergyData, solarEnergyData, waterEnergyData, weather);
        this.totalEnergy = 0;
        this.studyRooms = new ArrayList<>();
        this.publicFacilities = new ArrayList<>();
    }
    // Προσθήκη δωματίου μελέτης
    public void addStudyRoom(StudyRoom studyRoom) {
        this.studyRooms.add(studyRoom);
    }
    // Προσθήκη δημόσιας εγκατάστασης
    public void addPublicFacility(PublicFacility publicFacility) {
        this.publicFacilities.add(publicFacility);
    }
    // Ορισμός υπηρεσίας ύδατος
    public void setWaterService(WaterMicroservice waterService) {
        this.waterService = waterService;
    }
    // Ορισμός συστήματος HVAC
    public void setHvacSystem(HVACSystem hvacSystem) {
        this.hvacSystem = hvacSystem;
    }
    // Μέθοδος που επιστρέφει πληροφορίες σε μορφή String
    @Override
    public String toString() {
        return "Total Energy: " + totalEnergy +
                "\nStudy Rooms: " + studyRooms +
                "\nPublic Facilities: " + publicFacilities +
                "\nWater Service: " + waterService +
                "\nHVAC System: " + hvacSystem;
    }
}

