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

    // String value of teacher name
    private String mTeacherName;

    // String value of course name
    private String mCourseName;

    // Double value of student score
    private double mStudentScore;

    // String value of student grade
    private String mStudentGrade;

    // Integer value of semester, e.g., 1 for semester one; 2 for semester two; 3 for semester three
    private int mSemester;

    /**
     * Constructs a new ReportCard with initial values for course name, teacher name, and semester.
     */
    public ReportCard(String studentFirstName, String studentLastName, int studentId,
                      String teacherName, String courseName, double studentScore, int semester) {
        studentFirstName = mStudentFirstName;
        studentLastName = mStudentLastName;
        studentId = mStudentId;
        teacherName = mTeacherName;
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
        studentFirstName = mStudentFirstName;
        studentLastName = mStudentLastName;
    }

    /**
     * Sets the string value for student ID.
     *
     * @param studentId is the updated integer of student ID.
     */
    public void setStudentId(int studentId) {
        studentId = mStudentId;
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

    /**
     * Gets the string value of course name.
     *
     * @return mCourseName text.
     */
    public String getCourseName() {
        return mCourseName;
    }

    /**
     * Gets the integer value of semester.
     *
     * @return mSemester integer.
     */
    public int getSemester() {
        return mSemester;
    }

    /**
     * Gets the string value of teacher name.
     *
     * @return mTeacherName text.
     */
    public String getTeacherName() {
        return mTeacherName;
    }

    // Convert student score to relative student grade
    public String gradeStudent() {
        if (mStudentScore < 50.0) {
            mStudentGrade = "F";
        } else if (mStudentScore >= 50.0 && mStudentScore < 60.0) {
            mStudentGrade = "E";
        } else if (mStudentScore >= 60.0 && mStudentScore < 70.0) {
            mStudentGrade = "D";
        } else if (mStudentScore >= 70.0 && mStudentScore < 80.0) {
            mStudentGrade = "C";
        } else if (mStudentScore >= 80.0 && mStudentScore < 90.0) {
            mStudentGrade = "B";
        } else {
            mStudentGrade = "A";
        }
        return mStudentGrade;
    }

    // Convert values to string to show student grade
    @Override
    public String toString() {
        return "Result: " +
                "\nStudent: " + mStudentFirstName + " " + mStudentLastName +
                "\nStudent ID: " + mStudentId +
                "\nTeacher: " + mTeacherName +
                "\nSemester: " + mSemester +
                "\nCourse: " + mCourseName +
                "\nScore: " + mStudentScore +
                "\nGrade: " + mStudentGrade;
    }
}