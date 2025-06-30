import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        // Input: Student Name and Marks
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 5: ");
        double subject5 = scanner.nextDouble();

        // Calculate Total Marks and Average
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double average = totalMarks / 5;

        // Determine Grade based on Average
        char grade;
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

        // Output the Results
        System.out.println("\nStudent: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}