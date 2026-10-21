package constructor;

public class Constructor {

    public static void main(String[] args) {
        // 1. Course created using the full object constructor
        Course course1 = new Course("Computer Science", "AP CS A", 100, "Paul Nelson");

        // 2. Course created using the title-only constructor
        Course course2 = new Course("Data Structures");
        
        // Setting values via setters
        course2.setCourseCode("CS 201");
        course2.setPointsTotal(250);
        course2.setInstructorName("Dr. Alan Turing");

        // Retrieving values via getters
        System.out.println("Retrieved via getter:");
        System.out.println("Course Title: " + course2.getCourseTitle());
        System.out.println("Course Code: " + course2.getCourseCode());
        System.out.println("Points Total: " + course2.getPointsTotal());
        System.out.println("Instructor: " + course2.getInstructorName());
        System.out.println();

        // 3. Third course created using full constructor
        Course course3 = new Course("Calculus BC", "AP CALC BC", 150, "Maria Garcia");
        course3.setPointsTotal(180); // Modifying points using setter

        // Printing each course using the toString method
        System.out.println("=== COURSE LIST ===");
        System.out.println(course1);
        System.out.println("-------------------");
        System.out.println(course2);
        System.out.println("-------------------");
        System.out.println(course3);
    }
}

class Course {

    // Instance variables
    private String courseTitle;
    private String courseCode;
    private int pointsTotal;
    private String instructorName;

    // Full constructor accepting all parameters
    public Course(String courseTitle, String courseCode, int pointsTotal, String instructorName) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.pointsTotal = pointsTotal;
        this.instructorName = instructorName;
    }

    // Single-parameter constructor accepting course title only
    public Course(String courseTitle) {
        this.courseTitle = courseTitle;
        this.courseCode = "N/A";
        this.pointsTotal = 0;
        this.instructorName = "Unassigned";
    }

    // Accessors (Getters)
    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public String getInstructorName() {
        return instructorName;
    }

    // Mutators (Setters)
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    // Multi-line toString method
    @Override
    public String toString() {
        return "Course Information:\n" +
               "  Title:      " + courseTitle + "\n" +
               "  Code:       " + courseCode + "\n" +
               "  Total Pts:  " + pointsTotal + "\n" +
               "  Instructor: " + instructorName;
    }
}