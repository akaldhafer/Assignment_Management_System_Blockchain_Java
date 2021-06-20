
package MainPackage;

import EncryptionPackage.AppConfig;
import EncryptionPackage.AsymmetricCrypto;
import EncryptionPackage.SymmtCrypto;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lecturerPackage.AssignmentRecord;
import lecturerPackage.LecturerRecord;
import studentPackage.StudentRecord;

public class Database {
     public static SymmtCrypto crypto = new SymmtCrypto();
    public void Database(){
    
        ReadStudentData();
        ReadLecturerData();
        ReadAdminData();
        ReadAssignmentData();
    }
    public static void ReadAdminData() {
         AsymmetricCrypto enc = new AsymmetricCrypto();
        try (Scanner file = new Scanner (new FileReader ("Admin.txt"))) {
            String line ;
            while ((line=file.nextLine())!= null)
            {
                String [] colum1 = line.split(":");
                String name = colum1[0];
                String ID =   colum1[1];
                String user = colum1 [2];
                String pass = colum1 [3];
                String rand = colum1 [4];
                String aname = enc.decrypt(name, getPrivatekey(AppConfig.PRIVATEKEY_FILE ) );
                AdminRecord admin = new AdminRecord();
                admin.setName(aname);
                admin.setID(ID);
                admin.setUseranme(user);
                admin.setPassword(pass);
                admin.setRand(rand);
                AdminRecord.getAdminlist().add(admin);
            }
                     
        }catch(Exception e){
            try {
                System.err.println("New admin record will be added!");
                AdminRecord newadmin = new AdminRecord();
                newadmin.AddAdmin();
            } catch (Exception x) {
            }
            
        }
    }
    private static PrivateKey getPrivatekey( String filename )  throws Exception{
        byte[] keyBytes = Files.readAllBytes( Paths.get(filename) );
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec( keyBytes );
        return KeyFactory.getInstance( AppConfig.ALGORITHM ).generatePrivate(spec);
    }
    public static void ReadStudentData(){
        
         try (Scanner read = new Scanner (new FileReader ("Student.txt"))) {
            String line ;
            while ((line=read.nextLine())!= null)
            {
                String [] colum= line.split(":");
                String name =              colum [0];//name
                String TP =                colum [1];//TP
                String Phone_num =         colum [2];//Phone number
                String Email =             colum [3];//Email
                String Course =            colum [4];//course
                String Username =          colum [5];
                String Password =          colum [6];
                String Rand =              colum [7];                        
                StudentRecord ST = new StudentRecord();
                ST.setName(crypto.decrypt(name));
                ST.setID(crypto.decrypt(TP)); 
                ST.setPhone_number(crypto.decrypt(Phone_num));
                ST.setEmail(crypto.decrypt(Email));
                ST.setCourse(crypto.decrypt(Course));
                ST.setUsername(Username);
                ST.setPassword(Password);
                ST.setRand(Rand);
                StudentRecord.getStudentList().add(ST);
            }
             System.out.println("system read the student data");

        }catch(Exception e){
         try (PrintWriter addcustomer = new PrintWriter(new FileWriter("Student.txt", true))) {
                 addcustomer.flush();
                 addcustomer.close();
                } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void ReadLecturerData(){
        
         try (Scanner read = new Scanner (new FileReader ("Lecturer.txt"))) {
            String line ;
            while ((line=read.nextLine())!= null)
            {
                String [] colum= line.split(":");
                String ID =                colum [0];//id
                String name =              colum [1];//name
                String department =        colum [2];//department
                String Username =          colum [3];
                String Email =             colum [4];//Email
                String Phone_num =         colum [5];//Phone number
                String Password =          colum [6];
                String Rand =              colum [7];                        
                LecturerRecord ST = new LecturerRecord();
                ST.setName(crypto.decrypt(name));
                ST.setId(crypto.decrypt(ID)); 
                ST.setPhone(crypto.decrypt(Phone_num));
                ST.setEmail(crypto.decrypt(Email));
                ST.setDepartment(crypto.decrypt(department));
                ST.setUsername(Username);
                ST.setPassword(Password);
                ST.setRand(Rand);
                LecturerRecord.getLecturerList().add(ST);
            }
             System.out.println("system read the lecturer data");

        }catch(Exception e){
        
             try (PrintWriter addcustomer = new PrintWriter(new FileWriter("Lecturer.txt", true))) {
                 addcustomer.flush();
                 addcustomer.close();
                } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void ReadAssignmentData(){
        
         try (Scanner read = new Scanner (new FileReader ("Assignment.txt"))) {
            String line ;
            while ((line=read.nextLine())!= null)
            {
                String [] colum= line.split(":");
                String sID =          colum [0];//id
                String lid =          colum [1];//
                String title =        colum [2];//
                String description =  colum [3];
                String lname =       colum [4];//
                String subjectName =  colum [5];//
                String score =        colum [6];
                String disignature =  colum [7];                        
                AssignmentRecord ST = new AssignmentRecord();
                ST.setsTP(crypto.decrypt(sID));
                ST.setlID(crypto.decrypt(lid)); 
                ST.setTitle(crypto.decrypt(title));
                ST.setDescription(crypto.decrypt(description));
                ST.setLname(crypto.decrypt(lname));
                ST.setDSignature(disignature);
                ST.setScore(crypto.decrypt(score));
                ST.setSubjectName(crypto.decrypt(subjectName));
                AssignmentRecord.getAssignmentList().add(ST);
            }
             System.out.println("system read the assignment data");

        }catch(Exception e){
             try (PrintWriter addcustomer = new PrintWriter(new FileWriter("Assignment.txt", true))) {
                 addcustomer.flush();
                 addcustomer.close();
                } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
