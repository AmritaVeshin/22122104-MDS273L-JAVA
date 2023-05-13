# 22122104-MDS273L-JAVA
### Name: Amrita Veshin
### Register Number: 22122104
### Email: amrita.veshin@msds.christuniversity.in
### Class: 2MScDS-B
## Lab-05:

Create a student class, that will store the details of the Student
* Reg. No.
* Name
* Email
* Phone
* Class
* Department
The class will have a constructor to initialize the values of the Student and a method to print the Details of the Student.

In the main-method class, create an array of Student Class to hold maximum details of 100 Students.
In the menu-driven program, the menu options will have
* Add a student: Adds the details of 1 student to the array of Student
* Search for a student: 
    * Search for the details of a student from the array of Student
    * (Optional) Searching can be done with Name & Register Number
* Display all students: Displays the details of all students

__Note:__ Make use of functions to implement the menu options

## CONSTRAINTS: 
* The user has been given two options under searching: __Search by Name__ and __Search by Register Number__
* If the user enters invalid choices anywhere, the user is given an appropriate prompt for the same.
* In case there are no Students added in the system, the user is given the prompt to add a Student first.

## FLOWCHART: 

## CODE:
```
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
                                        

```

## OUTPUT: 
