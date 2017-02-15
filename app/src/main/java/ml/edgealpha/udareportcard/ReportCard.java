package ml.edgealpha.udareportcard;

/**
 * Created by Liwen on 2/02/2017.
 * This is for a school to store a student’s grades for a particular semester.
 */

public class ReportCard {

    // String value of student name
    private String mStudentFirstName;
    private String mStudentLastName;

    // Integer value of student ID
    private int mStudentId;

    // String value of course name
    private String mCourseName;

    // Double value of student score
    private double mStudentScore;

    // Integer value of semester, e.g., 1 for semester one; 2 for semester two; 3 for semester three
    private int mSemester;

    /**
     * Constructs a new ReportCard with initial values for course name, teacher name, and semester.
     */
    public ReportCard(String studentFirstName, String studentLastName, int studentId,
                      String courseName, double studentScore, int semester) {
        studentFirstName = mStudentFirstName;
        studentLastName = mStudentLastName;
        studentId = mStudentId;
        courseName = mCourseName;
        studentScore = mStudentScore;
        semester = mSemester;
    }

    /**
     * Sets the string value for student first and last name.
     *
     * @param studentFirstName is the updated string of student first name.
     * @param studentLastName  is the updated string of student last name.
     */
    public void setStudentName(String studentFirstName, String studentLastName) {
        mStudentFirstName = studentFirstName;
        mStudentLastName = studentLastName;
    }

    // Gets string of student first name
    public String getStudentFirstName() {
        return mStudentFirstName;
    }

    // Gets string of student last name
    public String getStudentLastName() {
        return mStudentLastName;
    }

    /**
     * Sets the integer value for student ID.
     *
     * @param studentId is the updated integer of student ID.
     */
    public void setStudentId(int studentId) {
        mStudentId = studentId;
    }

    // Gets integer value of student ID
    public int getStudentId() {
        return mStudentId;
    }

    /**
     * Sets the string of course name.
     *
     * @param courseName text.
     */
    public void setCourseName(String courseName) {
        mCourseName = courseName;
    }

    // Gets string of course name
    public String getCourseName() {
        return mCourseName;
    }

    /**
     * Sets the double value for student score.
     *
     * @param studentScore is the updated double of student score.
     */
    public void setStudentScore(double studentScore) {
        if (mStudentScore > 100 || mStudentScore < 0) {
            // Set student score to 0 value
            studentScore = 0;
        } else {
            // Set student score
            studentScore = mStudentScore;
        }
    }

    // Gets double value of student score
    public double getStudentScore() {
        return mStudentScore;
    }

    /**
     * Sets the integer value for semester.
     *
     * @param semester is the updated integer of semester, e.g. 1 for semester 1, 2 for semester 2.
     */
    public void setSemester(int semester) {
        mSemester = semester;
    }

    // Gets integer value of semester
    public int getSemester() {
        return mSemester;
    }

    // Convert values to string to show the score of student
    @Override
    public String toString() {
        return "Result: " +
                "\nStudent: " + mStudentFirstName + " " + mStudentLastName +
                "\nStudent ID: " + mStudentId +
                "\nSemester: " + mSemester +
                "\nCourse: " + mCourseName +
                "\nScore: " + mStudentScore;
    }
}