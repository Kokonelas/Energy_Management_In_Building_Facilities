class StudyRoom {
    private int seats; // Ο αριθμός των θέσεων της αίθουσας μελέτης
    private int area; // Η επιφάνεια της αίθουσας μελέτης
    private String description; // Η περιγραφή της αίθουσας μελέτης
    private double studyRoomEnergy; // Η συνολική ενέργεια της αίθουσας μελέτης
    /**
     * Κατασκευαστής για την κλάση StudyRoom.
     * @param seats Ο αριθμός των θέσεων
     * @param area Η επιφάνεια
     * @param description Η περιγραφή
     */
    public StudyRoom(int seats, int area, String description) {
        try {
            if (seats <= 0 || area <= 0) {
                throw new IllegalArgumentException("Ο αριθμός των θέσεων και η επιφάνεια πρέπει να είναι θετικές τιμές.");
            }
            this.seats = seats;
            this.area = area;
            this.description = description;
            this.studyRoomEnergy = area * 2.5 + seats * 1.2; // Υπολογισμός συνολικής ενέργειας
            System.out.println("Ενέργεια Αίθουσας Μελέτης = " + studyRoomEnergy);
        } catch (IllegalArgumentException e) {
            System.out.println("Συνέβη εξαίρεση: " + e.getMessage());
        }
    }
    // Μέθοδοι getter και setter για τον αριθμό θέσεων
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    // Μέθοδοι getter και setter για την επιφάνεια
    public int getArea() {
        return area;
    }
    public void setArea(int area) {

        this.area = area;
    }
    // Μέθοδοι getter και setter για την περιγραφή
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStudyRoomEnergy(double studyRoomEnergy) {
        this.studyRoomEnergy = studyRoomEnergy;
    }
    public double getStudyRoomEnergy() {
        return studyRoomEnergy;
    }
    @Override
    public String toString() {
        return "Περιγραφή: " + description + ", Θέσεις: " + seats + ", Επιφάνεια: " + area
                + ", Ενέργεια: " + studyRoomEnergy;
    }
}
