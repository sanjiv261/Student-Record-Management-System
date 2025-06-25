import java.util.ArrayList;
import java.util.Scanner;


public class StudentRecordSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int nextId = 1;

    public static void main(String[] args) {
        StudentRecordSystem system = new StudentRecordSystem();
        system.run();
    }

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}



    public void run() {
        while (true) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("Student Record Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    private void addStudent() {
        System.out.println("Add New Student");
        String name = getStringInput("Enter student name: ");
        double marks = getDoubleInput("Enter student marks: ");

        Student student = new Student(nextId++, name, marks);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private void viewAllStudents() {
        System.out.println("All Students");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private void updateStudent() {
        System.out.println("Update Student");
        int id = getIntInput("Enter student ID to update: ");

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.println("Current student details: " + student);
        String name = getStringInput("Enter new name (leave blank to keep current): ");
        if (!name.isEmpty()) {
            student.setName(name);
        }

        String marksInput = getStringInput("Enter new marks (leave blank to keep current): ");
        if (!marksInput.isEmpty()) {
            try {
                double marks = Double.parseDouble(marksInput);
                student.setMarks(marks);
            } catch (NumberFormatException e) {
                System.out.println("Invalid marks format. Marks not updated.");
            }
        }

        System.out.println("Student updated successfully!");
    }

    private void deleteStudent() {
        System.out.println("Delete Student");
        int id = getIntInput("Enter student ID to delete: ");

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}