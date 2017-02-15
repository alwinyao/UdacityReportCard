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

    // Integer value of semester, e.g., 1 for semester one; 2 for semester two; 3 for semester three
    private int mSemester;

    // Double value of score of English subject
    private double mEnglish;

    // Double value of score of Math subject
    private double mMath;

    // Double value of score of Science subject
    private double mScience;

    // Double value of score of History and Social Sciences subject
    private double mHistoryAndSocialSciences;

    // Double value of score of World Languages subject
    private double mWorldLanguages;

    // Double value of score of Technology and Computer Science subject
    private double mTechnologyAndComputerScience;

    /**
     * Constructs a new ReportCard with initial values for student.
     */
    public ReportCard(String studentFirstName, String studentLastName, int studentId, int semester,
                      double english, double math, double science, double historyAndSocialSciences,
                      double worldLanguages, double technologyAndComputerScience) {

        mStudentFirstName = studentFirstName;
        mStudentLastName = studentLastName;
        mStudentId = studentId;
        mSemester = semester;
        mEnglish = english;
        mMath = math;
        mScience = science;
        mHistoryAndSocialSciences = historyAndSocialSciences;
        mWorldLanguages = worldLanguages;
        mTechnologyAndComputerScience = technologyAndComputerScience;
    }

    // Sets the string value for student first and last name.
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

    // Sets the integer value for student ID.
    public void setStudentId(int studentId) {
        mStudentId = studentId;
    }

    // Gets integer value of student ID
    public int getStudentId() {
        return mStudentId;
    }

    // Sets the integer value for semester.
    public void setSemester(int semester) {
        mSemester = semester;
    }

    // Gets integer value of semester
    public int getSemester() {
        return mSemester;
    }

    // Sets the double value of score of English subject
    public void setEnglish(double english) {
        if (english > 100 || english < 0) {
            // Sets score to the default value
            english = 0;
        } else {
            // Sets score of English subject
            mEnglish = english;
        }
    }

    // Gets the double value of score of English subject
    public double getEnglish() {
        return mEnglish;
    }

    // Sets the double value of score of Math subject
    public void setMath(double math) {
        if (math > 100 || math < 0) {
            // Sets score to the default value
            math = 0;
        } else {
            // Sets score of Math subject
            mMath = math;
        }
    }

    // Gets the double value of score of Math subject
    public double getMath() {
        return mMath;
    }

    // Sets the double value of score of Science subject
    public void setScience(double science) {
        if (science > 100 || science < 0) {
            // Sets score to the default value
            science = 0;
        } else {
            // Sets score of Science subject
            mScience = science;
        }
    }

    // Gets the double value of score of Science subject
    public double getScience() {
        return mScience;
    }

    // Sets the double value of score of History and Social Sciences subject
    public void setHistoryAndSocialSciences(double historyAndSocialSciences) {
        if (historyAndSocialSciences > 100 || historyAndSocialSciences < 0) {
            // Sets score to the default value
            historyAndSocialSciences = 0;
        } else {
            // Sets score of History and Social Science subject
            mHistoryAndSocialSciences = historyAndSocialSciences;
        }
    }

    // Gets the double value of score of History and Social Sciences subject
    public double getHistoryAndSocialSciences() {
        return mHistoryAndSocialSciences;
    }

    // Sets the double value of score of World Languages subject
    public void setWorldLanguages(double worldLanguages) {
        if (worldLanguages > 100 || worldLanguages < 0) {
            // Sets score to the default value
            worldLanguages = 0;
        } else {
            // Sets score of World Languages subject
            mWorldLanguages = worldLanguages;
        }
    }

    // Gets the double value of score of World Languages subject
    public double getWorldLanguages() {
        return mWorldLanguages;
    }

    // Sets the double value of score of English subject
    public void setTechnologyAndComputerScience(double technologyAndComputerScience) {
        if (technologyAndComputerScience > 100 || technologyAndComputerScience < 0) {
            // Sets score to the default value
            technologyAndComputerScience = 0;
        } else {
            // Sets score of Technology and Computer Science subject
            mTechnologyAndComputerScience = technologyAndComputerScience;
        }
    }

    // Gets the double value of score of Technology and Computer Science subject
    public double getTechnologyAndComputerScience() {
        return mTechnologyAndComputerScience;
    }

    // Convert values to string to show the score of student
    @Override
    public String toString() {
        return "Result: " +
                "\nStudent: " + mStudentFirstName + " " + mStudentLastName +
                "\nStudent ID: " + mStudentId +
                "\nSemester: " + mSemester +
                "\nEnglish: " + mEnglish +
                "\nMath: " + mMath +
                "\nScience: " + mScience +
                "\nHistory and Social Sciences: " + mHistoryAndSocialSciences +
                "\nWorld Languages: " + mWorldLanguages +
                "\nTechnology and Computer Science: " + mTechnologyAndComputerScience;
    }
}