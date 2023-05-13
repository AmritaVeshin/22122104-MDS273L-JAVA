import java.util.Scanner;

class Student {
    private int regNo;
    private String name;
    private String email;
    private String phone;
    private String className;
    private String department;

    public Student(int regNo, String name, String email, String phone, String className, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("\n======================================================================");
        System.out.println("                         Student Details                              ");
        System.out.println("======================================================================");
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + className);
        System.out.println("Department: " + department);
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }
}

public class Lab05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int numOfStudents = 0;
        while (true) {
            System.out.println("\n======================================================================");
            System.out.println("                                Menu                                    ");
            System.out.println("======================================================================");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.println("======================================================================");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the registration number: ");
                    int regNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter the phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter the class: ");
                    String className = scanner.nextLine();
                    System.out.print("Enter the department: ");
                    String department = scanner.nextLine();
                    students[numOfStudents] = new Student(regNo, name, email, phone, className, department);
                    numOfStudents++;
                    System.out.println("\nStudent added successfully!");
                    break;
                case 2:
                    System.out.println("\n1. Search by name");
                    System.out.println("2. Search by registration number");
                    System.out.print("\nEnter your choice: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    switch (searchChoice) {
                        case 1:
                            System.out.print("\nEnter the name to search: ");
                            String searchName = scanner.nextLine();
                            for (int i = 0; i < numOfStudents; i++) {
                                if (students[i].getName().equalsIgnoreCase(searchName)) {
                                    students[i].printDetails();
                                    found = true;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("\nEnter the registration number to search: ");
                            int searchRegNo = scanner.nextInt();
                            for (int i = 0; i < numOfStudents; i++) {
                                if (students[i].getRegNo() == searchRegNo) {
                                    students[i].printDetails();
                                    found = true;
                                }
                            }
                            break;
                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    if (!found) {
                        System.out.println("No student found!");
                    }
                    break;
                case 3:
                    if (numOfStudents == 0) {
                        System.out.println("No students found, please add a student first!");
                    } else {
                    for (int i = 0; i < numOfStudents; i++) {
                    students[i].printDetails();
                    }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
                    
                    
                    
                    
                    
                    
                    
