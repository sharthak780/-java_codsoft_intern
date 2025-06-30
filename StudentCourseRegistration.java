import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName;
    }
}

class Student {
    private String studentId;
    private String name;
    private ArrayList<Course> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        System.out.println("Successfully registered for " + course.getCourseName());
    }

    public void displayRegisteredCourses() {
        System.out.println("\nCourses registered by " + name + ":");
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            for (Course course : registeredCourses) {
                System.out.println(course);
            }
        }
    }
}

public class StudentCourseRegistration {
    private static HashMap<String, Course> courses = new HashMap<>();
    private static HashMap<String, Student> students = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeCourses();

        while (true) {
            System.out.println("\n===== Student Course Registration System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Display Available Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    registerCourse();
                    break;
                case 3:
                    viewRegisteredCourses();
                    break;
                case 4:
                    displayCourses();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeCourses() {
        courses.put("CSE101", new Course("CSE101", "Introduction to Computer Science"));
        courses.put("MTH102", new Course("MTH102", "Calculus"));
        courses.put("PHY103", new Course("PHY103", "Physics Fundamentals"));
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        if (students.containsKey(studentId)) {
            System.out.println("Student ID already exists.");
        } else {
            students.put(studentId, new Student(studentId, name));
            System.out.println("Student added successfully.");
        }
    }

    private static void registerCourse() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = students.get(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        displayCourses();
        System.out.print("Enter Course ID to register: ");
        String courseId = scanner.nextLine();
        Course course = courses.get(courseId);

        if (course == null) {
            System.out.println("Invalid Course ID.");
        } else {
            student.registerCourse(course);
        }
    }

    private static void viewRegisteredCourses() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = students.get(studentId);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            student.displayRegisteredCourses();
        }
    }

    private static void displayCourses() {
        System.out.println("\nAvailable Courses:");
        for (Course course : courses.values()) {
            System.out.println(course);
        }
    }
}
