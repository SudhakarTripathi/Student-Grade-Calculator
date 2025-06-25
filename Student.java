import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    int[] marks = new int[5];
    int total = 0;
    double average;
    char grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        sc.close();
    }

    void calculateGrade() {
        average = total / 5.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.calculateGrade();
        s.displayResult();
    }
}
