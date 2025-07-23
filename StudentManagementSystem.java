public class Student {
    // Attributes (Fields)
    private String name;
    private int rollNumber;
    private String grade;
    private int age;
    private String email;

    // Constructor
    public Student(String name, int rollNumber, String grade, int age, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade      : " + grade);
        System.out.println("Age        : " + age);
        System.out.println("Email      : " + email);
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student1 = new Student("Ravi Kumar", 101, "A", 18, "ravi.kumar@example.com");
        student1.displayStudentInfo();
    }
}
