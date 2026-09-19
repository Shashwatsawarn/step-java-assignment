class Student {
    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class W6P5StudentCollege {
    public static void main(String[] args) {
        new Student("Riya", 92.5);
        new Student("Arun", 88.0);
        Student.printCollegeInfo();
    }
}
