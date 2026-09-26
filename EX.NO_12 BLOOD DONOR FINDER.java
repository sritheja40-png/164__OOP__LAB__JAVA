import java.util.ArrayList;
import java.util.Scanner;

class BloodDonor {
    String name;
    int age;
    String gender;
    String bloodGroup;
    String city;
    String phone;

    // Constructor
    BloodDonor(String name, int age, String gender, String bloodGroup, String city, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.phone = phone;
    }

    // Display donor details
    void display() {
        System.out.println("------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("City : " + city);
        System.out.println("Phone : " + phone);
        System.out.println("------------------------");
    }
}

public class BloodDonorFinder {
    static ArrayList<BloodDonor> donors = new ArrayList<>();

    // Add sample donors
    static void addSampleDonors() {
        donors.add(new BloodDonor("Arun", 25, "Male", "A+", "Chennai", "9876543210"));
        donors.add(new BloodDonor("Priya", 22, "Female", "B+", "Cuddalore", "9876501234"));
        donors.add(new BloodDonor("Karthik", 28, "Male", "O+", "Chennai", "9876512345"));
        donors.add(new BloodDonor("Divya", 24, "Female", "A+", "Panruti", "9876523456"));
        donors.add(new BloodDonor("Rahul", 30, "Male", "O-", "Viluppuram", "9876534567"));
    }

    // Register a new donor
    static void registerDonor(Scanner sc) {
        System.out.print("Enter donor name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter blood group: ");
        String bloodGroup = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        donors.add(new BloodDonor(name, age, gender, bloodGroup, city, phone));
        System.out.println("\nDonor registered successfully!");
    }

    // Display all donors
    static void displayAllDonors() {
        if (donors.isEmpty()) {
            System.out.println("No donors available.");
            return;
        }

        System.out.println("\n===== ALL BLOOD DONORS =====");
        for (BloodDonor donor : donors) {
            donor.display();
        }
    }

    // Search by blood group
    static void searchByBloodGroup(Scanner sc) {
        System.out.print("Enter required blood group: ");
        String group = sc.nextLine();

        boolean found = false;
        System.out.println("\n===== SEARCH RESULT =====");

        for (BloodDonor donor : donors) {
            if (donor.bloodGroup.equalsIgnoreCase(group)) {
                donor.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donor found for blood group " + group);
        }
    }

    // Search by city
    static void searchByCity(Scanner sc) {
        System.out.print("Enter city: ");
        String city = sc.nextLine();

        boolean found = false;
        System.out.println("\n===== DONORS IN " + city + " =====");

        for (BloodDonor donor : donors) {
            if (donor.city.equalsIgnoreCase(city)) {
                donor.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donors found in " + city);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addSampleDonors();

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println(" BLOOD DONOR FINDER");
            System.out.println("=================================");
            System.out.println("1. Register Donor");
            System.out.println("2. View All Donors");
            System.out.println("3. Search by Blood Group");
            System.out.println("4. Search by City");
            System.out.println("5. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    registerDonor(sc);
                    break;

                case 2:
                    displayAllDonors();
                    break;

                case 3:
                    searchByBloodGroup(sc);
                    break;

                case 4:
                    searchByCity(sc);
                    break;

                case 5:
                    System.out.println("Thank you for using Blood Donor Finder!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
