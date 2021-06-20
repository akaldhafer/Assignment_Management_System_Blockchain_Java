
package studentPackage;

import HashPackage.Hasher;
import HashPackage.Txt;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudentRecord {
    private String Name, ID, Phone_number, Email,Course , Username, Password, Rand;
   
    
    private static ArrayList<StudentRecord>StudentList = new ArrayList<>();

    public static ArrayList<StudentRecord> getStudentList() {
        return StudentList;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRand() {
        return Rand;
    }

    public void setRand(String Rand) {
        this.Rand = Rand;
    }
    
    public int LoginStudents(String user , String pass){
      for (int i = 0; i<StudentRecord.StudentList.size(); i = i+1){
         try {
                String hash_user = Hasher.hash(Txt.append(StudentRecord.getStudentList().get(i).getRand(), user),"MD5");
                String hash_pass = Hasher.hash(Txt.append(StudentRecord.getStudentList().get(i).getRand(), pass),"MD5");
                if (StudentRecord.getStudentList().get(i).getUsername().equals(hash_user)
                        && StudentRecord.getStudentList().get(i).getPassword().equals(hash_pass)){
                    return i;
                }
            } catch (Exception ex) {}
      }
      return -1;
    }
    public boolean searchStudent(String id){
      for (int i = 0; i<StudentRecord.StudentList.size(); i = i+1){
            if (StudentRecord.getStudentList().get(i).getID().equals(id))
            {
                return true;
            }
      }
      return false;
    }

    public void Student_ADD(String Name, String TP, String Phone_number, 
            String Email, String Course,String Username, String Password, String Rand) throws IOException {
        PrintWriter ADD = new PrintWriter(new FileWriter("Student.txt", true));
        ADD.print(Name + ":");
        ADD.print(TP + ":");
        ADD.print(Phone_number + ":");
        ADD.print(Email + ":");
        ADD.print(Course + ":");
        ADD.print(Username+":");
        ADD.print(Password+":");
        ADD.println(Rand);
        ADD.flush();
       JOptionPane.showMessageDialog(null, "Student has been addeed successfully", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
         StudentRecord.getStudentList().clear();
            ADD.close();
    }    
}
