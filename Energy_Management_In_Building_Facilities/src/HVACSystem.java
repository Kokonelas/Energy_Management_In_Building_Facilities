class HVACSystem {
    private double area; // Εμβαδόν του χώρου
    private double temperature; // Θερμοκρασία του χώρου
    private double efficiency; // Απόδοση του συστήματος
    private double energyConsumption; // Κατανάλωση ενέργειας
    public HVACSystem(double area, double temperature, double efficiency) {
        if (area <= 0 || temperature <= 0 || efficiency <= 0) {
            throw new IllegalArgumentException("Το εμβαδόν, η θερμοκρασία και η απόδοση πρέπει να είναι θετικές τιμές.");
        }
        this.area = area;
        this.temperature = temperature;
        this.efficiency = efficiency;
        this.energyConsumption = area * temperature * efficiency;
        System.out.println("Κατανάλωση ενέργειας HVAC = " + energyConsumption);
    }
}

