import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    String disease;
    String doctorAssigned;

    // Constructor
    Patient(int patientId, String name, int age, String disease, String doctorAssigned) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
    }

    // Display patient details
    void display() {
        System.out.println("\nPatient ID       : " + patientId);
        System.out.println("Name             : " + name);
        System.out.println("Age              : " + age);
        System.out.println("Disease          : " + disease);
        System.out.println("Doctor Assigned  : " + doctorAssigned);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient[] patients = new Patient[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Hospital Patient Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Doctor Assigned: ");
                    String doctor = sc.nextLine();

                    patients[count] = new Patient(id, name, age, disease, doctor);
                    count++;

                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (patients[i].patientId == searchId) {
                            patients[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No patient records available.");
                    } else {
                        System.out.println("\nPatient Records");
                        for (int i = 0; i < count; i++) {
                            patients[i].display();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}