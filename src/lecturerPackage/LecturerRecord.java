
package lecturerPackage;

import HashPackage.Hasher;
import HashPackage.Txt;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import studentPackage.StudentRecord;

public class LecturerRecord {
    private String id, name,username,department, email, phone, password, rand;
 
    private static ArrayList<LecturerRecord> lecturerList = new ArrayList<>();

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public static ArrayList<LecturerRecord> getLecturerList() {
        return lecturerList;
    }

    public static void setLecturerList(ArrayList<LecturerRecord> lecturerList) {
        LecturerRecord.lecturerList = lecturerList;
    }
     
    
    public int LoginLecturer(String id , String pass){
      for (int i = 0; i<LecturerRecord.lecturerList.size(); i = i+1){
         try {
                String hash_id = Hasher.hash(Txt.append(LecturerRecord.lecturerList.get(i).getRand(), id),"MD5");
                String hash_pass = Hasher.hash(Txt.append(LecturerRecord.lecturerList.get(i).getRand(), pass),"MD5");
                if (LecturerRecord.lecturerList.get(i).getUsername().equals(hash_id)
                        && LecturerRecord.lecturerList.get(i).getPassword().equals(hash_pass)){
                    return i;
                }
            } catch (Exception ex) {}
      }
      return -1;
    }

    public void AddLecturer(String lecturerID, String lecturerName,String Department,String lecturerUsername, 
            String lecturerEmail, String lecturerPhone, String lecturerPassword, String rand) throws IOException {
        PrintWriter ADD = new PrintWriter(new FileWriter("Lecturer.txt", true));
        ADD.print(lecturerID + ":");
        ADD.print(lecturerName + ":");
        ADD.print(Department + ":");
        ADD.print(lecturerUsername + ":");
        ADD.print(lecturerEmail + ":");
        ADD.print(lecturerPhone + ":");     
        ADD.print(lecturerPassword + ":");
        ADD.println(rand);
        ADD.flush();
        
        JOptionPane.showMessageDialog(null, "Lecturer has been addeed successfully", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
        StudentRecord.getStudentList().clear();
        ADD.close();
           
    }
}
