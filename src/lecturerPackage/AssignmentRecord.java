
package lecturerPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AssignmentRecord {
    private String sTP, lID, title, description, lname, subjectName,DSignature;
    private String score;
    private static ArrayList<AssignmentRecord> assignmentList = new ArrayList<>();

    public String getsTP() {
        return sTP;
    }

    public void setsTP(String sTP) {
        this.sTP = sTP;
    }

    public String getlID() {
        return lID;
    }

    public void setlID(String lID) {
        this.lID = lID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDSignature() {
        return DSignature;
    }

    public void setDSignature(String DSignature) {
        this.DSignature = DSignature;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public static ArrayList<AssignmentRecord> getAssignmentList() {
        return assignmentList;
    }

    public static void setAssignmentList(ArrayList<AssignmentRecord> assignmentList) {
        AssignmentRecord.assignmentList = assignmentList;
    }
    public void AddAssignment(String sTP, String lID,String title,String 
            description,String lname,String subjectName, String score,String DSignature) throws IOException {
        PrintWriter ADD = new PrintWriter(new FileWriter("Assignment.txt", true));
        ADD.print(sTP + ":");
        ADD.print(lID + ":");
        ADD.print(title + ":");
        ADD.print(description + ":");
        ADD.print(lname + ":");
        ADD.print(subjectName+":");
        ADD.print(score+":");
        ADD.println(DSignature);
        ADD.flush();
        JOptionPane.showMessageDialog(null, "Assignement has been addeed successfully", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
        AssignmentRecord.getAssignmentList().clear();
        ADD.close(); 
    }    
}
