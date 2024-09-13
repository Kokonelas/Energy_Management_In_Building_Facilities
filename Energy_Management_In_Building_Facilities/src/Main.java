import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.*;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        try {
            // Δημιουργία λιστών για αποθήκευση δεδομένων
            List<Vehicle> vehicles = new ArrayList<>(); // Λίστα οχημάτων

            List<StudyRoom> studyRooms = new ArrayList<>(); // Λίστα αιθουσών μελέτης


            List<PublicFacility> publicFacilities = new ArrayList<>(); // Λίστα δημοσίων χώρων

            // Δημιουργία διάφορων αντικειμένων
            Vehicle car1 = new Vehicle(100, 0.05); // Αυτοκίνητο
            StudyRoom studyRoom = new StudyRoom(30, 50, "Library"); // Αίθουσα μελέτης
            PublicFacility publicFacility = new PublicFacility(500, "Public Hall", 4); //Δημόσιος χώρος
            BuildingEnergyMicroservice buildingService = new BuildingEnergyMicroservice(50, 60, 70, "windy"); // Μικρο-υπηρεσία ενέργειας κτιρίου
            WaterMicroservice waterService = new WaterMicroservice(20, 30, 40, "rainy", 500); // Μικρο-υπηρεσία νερού
            buildingService.setWaterService(waterService);
            HVACSystem hvacSystem = new HVACSystem(200, 25, 0.08); // Σύστημα HVAC
            buildingService.setHvacSystem(hvacSystem);
            buildingService.addStudyRoom(studyRoom);
            buildingService.addPublicFacility(publicFacility);
            SolarMicroservice solarService = new SolarMicroservice(70, 80, 90, "sunny", 0.75, 100); // Μικρο-υπηρεσία ηλιακής ενέργειας
            AirConditioner ac = new AirConditioner(3000, 250); // Κλιματιστικό
            HeatingSystem heating = new HeatingSystem(4000, 300); // Σύστημα θέρμανσης
            SoundSystem soundSystem = new SoundSystem(8, "High", 120); // Σύστημα ήχου

            SecuritySystem securitySystem = new SecuritySystem("High", 80); // Σύστημα ασφαλείας
            InternetService internetService = new InternetService("ProviderX", 500); // Υπηρεσία Internet
            Vehicle car2 = new Vehicle(200, 0.04); // Δεύτερο αυτοκίνητο
            StudyRoom studyRoom2 = new StudyRoom(20, 40, "Reading Room"); // Δεύτερη αίθουσα μελέτης
            PublicFacility publicFacility2 = new PublicFacility(600, "Conference Hall", 6);

            // Δεύτερος δημόσιος χώρος
            LightMicroservice lightService2 = new LightMicroservice(40, 50, 30, 150, "cloudy", 7); // Μικρο-υπηρεσία φωτισμού
            // Προσθήκη αντικειμένων στις λίστες
            vehicles.add(car1);
            studyRooms.add(studyRoom);
            publicFacilities.add(publicFacility);
            // Δημιουργία αντικειμένων για εγγραφή σε αρχεία
            BufferedWriter vehicleWriter = new BufferedWriter(new
                    FileWriter("vehicle.txt")); // Αρχείο για οχήματα
            BufferedWriter studyRoomWriter = new BufferedWriter(new
                    FileWriter("study_room.txt")); // Αρχείο για αίθουσες μελέτης
            BufferedWriter publicFacilityWriter = new BufferedWriter(new
                    FileWriter("public_facility.txt")); // Αρχείο για δημόσιους χώρους

            // Εγγραφή στα αντίστοιχα αρχεία
            for (Vehicle vehicle : vehicles)
            {
                vehicleWriter.write(vehicle.toString());
                vehicleWriter.newLine();
            }
            for (StudyRoom room : studyRooms)
            {
                studyRoomWriter.write(room.toString());
                studyRoomWriter.newLine();
            }
            for (PublicFacility facility : publicFacilities)
            {
                publicFacilityWriter.write(facility.toString());
                publicFacilityWriter.newLine();
            }

            // Κλείσιμο των αρχείων
            vehicleWriter.close();
            studyRoomWriter.close();
            publicFacilityWriter.close();

            // Δημιουργία αντικειμένων για ανάγνωση από αρχεία
            BufferedReader vehicleReader = new BufferedReader(new
                    FileReader("vehicle.txt")); // Αρχείο για οχήματα
            BufferedReader studyRoomReader = new BufferedReader(new
                    FileReader("study_room.txt")); // Αρχείο για αίθουσες μελέτης
            BufferedReader publicFacilityReader = new BufferedReader(new
                    FileReader("public_facility.txt")); // Αρχείο για δημόσιους χώρους

            // Εγγραφή στα αντίστοιχα αρχεία
            for (Vehicle vehicle : vehicles)
            {
                vehicleReader.readLine();
            }
            for (StudyRoom room : studyRooms)
            {
                studyRoomReader.readLine();
            }
            for (PublicFacility facility : publicFacilities)
            {
                publicFacilityReader.readLine();
            }

            // Κλείσιμο των αρχείων
            vehicleReader.close();
            studyRoomReader.close();
            publicFacilityReader.close();
            System.out.println("Συνολικά οχήματα = " + vehicles.size());
            System.out.println("Συνολικά αίθουσες μελέτης = " + studyRooms.size());
            System.out.println("Συνολικά δημόσιοι χώροι = " + publicFacilities.size());
            System.out.println("Κατανάλωση ενέργειας του πρώτου αυτοκινήτου = " +
                    vehicles.get(0).getVehicleEnergy());
            for (Vehicle vehicle : vehicles)
                System.out.println(vehicle);

            //Υπολογισμός Στατιστικών για Οχήματα
            int numVehicles = vehicles.size();
            double totalVehicleEnergy = 0;
            double highestVehicleEnergy = 0;
            double lowestVehicleEnergy = Double.MAX_VALUE;

            for (Vehicle vehicle : vehicles)
            {
                totalVehicleEnergy += vehicle.getVehicleEnergy();
                if (vehicle.getVehicleEnergy() > highestVehicleEnergy)
                    highestVehicleEnergy = vehicle.getVehicleEnergy();
                if (vehicle.getVehicleEnergy() < lowestVehicleEnergy)
                    lowestVehicleEnergy = vehicle.getVehicleEnergy();
            }
            double averageVehicleEnergy = totalVehicleEnergy/numVehicles;

            //Υπολογισμός Στατιστικών Στοιχείων για Αίθουσες Μελέτης
            int numStudyRooms = studyRooms.size();
            int totalStudyRoomCapacity = 0;
            int highestStudyRoomCapacity = 0;
            int lowestStudyRoomCapacity = Integer.MAX_VALUE;
            for (StudyRoom studyRoom3 : studyRooms)
            {
                totalStudyRoomCapacity += studyRoom3.getSeats();
                if (studyRoom3.getSeats() > highestStudyRoomCapacity)
                    highestStudyRoomCapacity = studyRoom3.getSeats();
                if (studyRoom3.getSeats() < lowestStudyRoomCapacity)
                    lowestStudyRoomCapacity = studyRoom3.getSeats();
            }
            int averageStudyRoomCapacity = totalStudyRoomCapacity / numStudyRooms;

            //Υπολογισμός Στατιστικών Στοιχείων για Δημόσια Κτίρια και Εγκαταστάσεις (public facilities)
            int numPublicFacilities = publicFacilities.size();
            double totalPublicFacilityArea = 0;
            double highestPublicFacilityArea = 0;
            double lowestPublicFacilityArea = Double.MAX_VALUE;
            for (PublicFacility publicFacility3 : publicFacilities)
            {
                totalPublicFacilityArea += publicFacility3.getPubFacilityArea();
                if (publicFacility3.getPubFacilityArea() > highestPublicFacilityArea)
                    highestPublicFacilityArea = publicFacility3.getPubFacilityArea();
                if (publicFacility3.getPubFacilityArea() < lowestPublicFacilityArea)
                    lowestPublicFacilityArea = publicFacility3.getPubFacilityArea();
            }
            double averagePublicFacilityArea = totalPublicFacilityArea / numPublicFacilities;

            //Εκτύπωση Στατιστικών Στοιχείων
            System.out.println("Συνολικά Οχήματα: " + numVehicles);
            System.out.println("Μέση Κατανάλωση Ενέργειας Οχημάτων: " +
                    averageVehicleEnergy + " kWh");
            System.out.println("Μέγιστη Κατανάλωση Οχημάτων: " + highestVehicleEnergy + " kWh");
                    System.out.println("Ελάχιστη Κατανάλωση Οχημάτων: " + lowestVehicleEnergy + " kWh");
                            System.out.println("\nΣυνολικός Αριθμός Δωματίων Μελέτης: " + numStudyRooms);
            System.out.println("Μέση Χωρητικότητα Δωματίων Μελέτης σε Άτομα: " +
                    averageStudyRoomCapacity);
            System.out.println("Μέγιστη Χωρητικότητα Δωματίων Μελέτης σε Άτομα: " +
                    highestStudyRoomCapacity);
            System.out.println("Ελάχιστη Χωρητικότητα Δωματίων Μελέτης σε Άτομα: " +
                    lowestStudyRoomCapacity);
            System.out.println("\nΣυνολικός Αριθμός Δημόσιων Κτιρίων/Εγκαταστάσεων: " +
                    numPublicFacilities);
            System.out.println("Μέσος Αριθμός Δημόσιων Κτιρίων/Εγκαταστάσεων σε τετραγωνικά μέτρα: " + averagePublicFacilityArea);
            System.out.println("Μέγιστο Εμβαδόν Επιφάνειας Δημόσιων Κτιρίων/Εγκαταστάσεων σε τετραγωνικά μέτρα: " + highestPublicFacilityArea);
            System.out.println("Ελάχιστο Εμβαδόν Επιφάνειας Δημόσιων Κτιρίων/Εγκαταστάσεων σε τετραγωνικά μέτρα " + lowestPublicFacilityArea);

            // Υπολογισμός Συνολικής κατανάλωσης Ενέργειας
            double totalEnergyConsumption = 0;
            for (Vehicle vehicle : vehicles)
                totalEnergyConsumption += vehicle.getVehicleEnergy();
            for (PublicFacility publicFacility3 : publicFacilities)
                totalEnergyConsumption += publicFacility3.getTotalFacilityEnergy();

            //Υπολογισμός Μέσης κατανάλωσης Ενέργειας ανά Όχημα (vehicle)
            double averageVehicleEnergy2 = totalEnergyConsumption / vehicles.size();
            //Υπολογισμός Μέσης κατανάλωσης Ενέργειας ανά Αίθουσα Μελέτης
            double averageStudyRoomEnergy = totalEnergyConsumption / studyRooms.size();
            //Υπολογισμός Μέσης κατανάλωσης Ενέργειας ανά Δημόσια Κτιριακή Εγκατάστασης
            double averagePublicFacilityEnergy = totalEnergyConsumption /
                    publicFacilities.size();
            //Υπολογισμός Κατανομής Κατανάλωσης (istribution of energy consumption)
            Map<String, Double> energyConsumptionDistribution = new HashMap<>();
            for (Vehicle vehicle : vehicles)
            {
                String type = vehicle.getClass().getSimpleName();
                double energyConsumption = vehicle.getVehicleEnergy();
                energyConsumptionDistribution.merge(type, energyConsumption, Double::sum);
            }
            for (PublicFacility publicFacility4 : publicFacilities)
            {
                String type = publicFacility4.getClass().getSimpleName();
                double energyConsumption = publicFacility4.getTotalFacilityEnergy();
                energyConsumptionDistribution.merge(type, energyConsumption, Double::sum);
            }

            //Κατανάλωση Ενέργειας ανα τύπο
            Map<String, Double> energyConsumptionByType = new HashMap<>();
            double electricityConsumption = 0;
            double gasConsumption = 0;
            for (String type : energyConsumptionDistribution.keySet())
            {
                double totalEnergyConsumption5 = energyConsumptionDistribution.get(type);
                if (type == "Vehicle")
                    electricityConsumption += totalEnergyConsumption;
                else if (type == "PublicFacility")
                    electricityConsumption += totalEnergyConsumption;
                else if (type == "ElectricVehicle")

                electricityConsumption += totalEnergyConsumption;
 else
                gasConsumption += totalEnergyConsumption;
            }
            double peakEnergyConsumption;
            energyConsumptionByType.put("Electricity", electricityConsumption);
            energyConsumptionByType.put("Gas", gasConsumption);

            //Υπολογισμός του Peak για Κατανάλωση Ενέργειας
            double peakEnergyConsumption3 = calculatePeakEnergyConsumption(vehicles);

            //Υπολογισμός του Μέσου Peak για Κατανάλωση Ενέργειας ανά Όχημα
            double averagePeakUsagePerVehicle = peakEnergyConsumption3 / vehicles.size();

            //Υπολογισμός του Μέσου Peak για Κατανάλωση Ενέργειας ανά Αίθουσα Μελέτης
            double peakEnergyConsumptionVehicles = calculatePeakEnergyConsumption(vehicles);

            //Υπολογισμός Κατανομής του Peak Χρήσης Ενέργειας
            Map<String, Double> peakUsageDistribution = new HashMap<>();
            peakUsageDistribution.put("Vehicle", averagePeakUsagePerVehicle);

            //Υπολογισμός τςη Τάσης Κατανάλωσης Ενέργειας
            Map<String, Double> energyConsumptionTrends = new HashMap<>();
            energyConsumptionTrends.put("Vehicle", averageVehicleEnergy);
            energyConsumptionTrends.put("StudyRoom", averageStudyRoomEnergy);
            energyConsumptionTrends.put("PublicFacility", averagePublicFacilityEnergy);
            //Εμφάνιση Στατιστικών Στοιχείων Κατανάλωσης Ενέργειας
            System.out.println("\nΣυνολική Κατανάλωση Ενέργειας:" + totalEnergyConsumption + " kWh");
            System.out.println("\nστατιστικά Ανά Τύπο:");
            for (String type : energyConsumptionByType.keySet())
                System.out.printf("* %s: %.2f kWh\n", type,
                        energyConsumptionByType.get(type));
            System.out.println("\nΤάσεις Κατανάλωσης Ενέργειας");
            for (String type : energyConsumptionTrends.keySet())
                System.out.printf("* %s: %.2f kWh\n", type,
                        energyConsumptionTrends.get(type));

        }
        catch (IOException e)
        {
            System.out.println("Exception occurred while writing to file: " +
                    e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static double calculatePeakEnergyConsumption(List<Vehicle> vehicles)
    {
        double peakEnergyConsumption = 0;
        for (Vehicle vehicle : vehicles)
            if (vehicle.getVehicleEnergy() > peakEnergyConsumption)
                peakEnergyConsumption = vehicle.getVehicleEnergy();
        return peakEnergyConsumption;
    }
}