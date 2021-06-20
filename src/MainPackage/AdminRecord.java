
package MainPackage;

import EncryptionPackage.AppConfig;
import EncryptionPackage.AsymmetricCrypto;
import HashPackage.HashObjects;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminRecord {
    
    private  String ID, name, useranme , password, rand;
    private static ArrayList<AdminRecord> adminlist = new ArrayList<>();

    public String getID() {
        return ID;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<AdminRecord> getAdminlist() {
        return adminlist;
    }

    public static void setAdminlist(ArrayList<AdminRecord> adminlist) {
        AdminRecord.adminlist = adminlist;
    }

    public void AddAdmin(){
        AsymmetricCrypto enc = new AsymmetricCrypto();
        
        
        String username = "admin";
        String Password = "admin";
      
        PrintWriter addM;
        try {
            try {
                HashObjects.create(username, Password);
            } catch (Exception ex) {
                Logger.getLogger(MainMethod.class.getName()).log(Level.SEVERE, null, ex);
            }
            String name = enc.encrypt("Malik", getPublickey(AppConfig.PUBLICKEY_FILE));
            String ID = enc.encrypt("0001", getPublickey( AppConfig.PUBLICKEY_FILE ));
            String aname = enc.decrypt(name, getPrivatekey(AppConfig.PRIVATEKEY_FILE ));
            addM = new PrintWriter(new FileWriter("Admin.txt", true));
            addM.print( name+ ":");
            addM.print( ID + ":");
            addM.print(HashObjects.user + ":");
            addM.print(HashObjects.pass + ":");
            addM.println(HashObjects.Rand);
            addM.flush();
            addM.close();
             AdminRecord admin = new AdminRecord();
            admin.setName(aname);
            admin.setID(ID);
            admin.setUseranme(HashObjects.user);
            admin.setPassword(HashObjects.pass);
            admin.setRand(HashObjects.Rand);
            AdminRecord.getAdminlist().add(admin);
        } catch (IOException ex) {
            Logger.getLogger(MainMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MainMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static PublicKey getPublickey( String filename ) throws Exception{
        byte[] keyBytes = Files.readAllBytes( Paths.get(filename) );
        X509EncodedKeySpec spec = new X509EncodedKeySpec( keyBytes );
        return KeyFactory.getInstance( AppConfig.ALGORITHM ).generatePublic(spec);
    }
    private static PrivateKey getPrivatekey( String filename )  throws Exception{
        byte[] keyBytes = Files.readAllBytes( Paths.get(filename) );
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec( keyBytes );
        return KeyFactory.getInstance( AppConfig.ALGORITHM ).generatePrivate(spec);
    }
}
