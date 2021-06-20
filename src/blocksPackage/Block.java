package blocksPackage;

import blockchainPackage.Blockchain;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Serializable makes this object to be able to convert to byte[](hashing requires byte[])
public class Block implements Serializable {
    
    //data properties
   
    private String hash, previousHash;
    private String title, score, subjectName, description;
    private String timestamp_datestamp, Dsignature;
    public Block(){
    }
    //constructor
    public Block(String Dsignature,String title,  String description,String score, String subjectName, String previousHash) throws Exception{
        this.description = description;
        this.title = title;
        this.score = score;
        this.subjectName = subjectName;
        this.previousHash = previousHash;
        this.Dsignature = Dsignature;
        this.timestamp_datestamp = new SimpleDateFormat("dd/MM/yyyy _HH.mm.ss").format(Calendar.getInstance().getTime());
        byte[] blockBytes = Block.getBytes( this ); 
        
        if ( blockBytes != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(previousHash.getBytes());
            baos.write(title.getBytes());
            baos.write(description.getBytes());
            baos.write(subjectName.getBytes());
            baos.write(score.getBytes());
            baos.write(timestamp_datestamp.getBytes());
            baos.write(Dsignature.getBytes());
            baos.write( blockBytes );
            this.hash = Hasher.hash(baos.toByteArray(), "SHA-256");
        } else { //throw an exception
         
            throw new Exception("First block created!");
        }
    }
    //Purpose: To convert the Block_Add object into byte[]
    private static byte[] getBytes( Block blk ){
        //ByteArrayOutputStream and ObjectOutputStream are from java.io
        try( ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream out = new ObjectOutputStream(baos);
                ) {
            //write Block_Add object into Stream
            out.writeObject( blk );
            return baos.toByteArray();//get byte[] from baos
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //getset methods

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
    public String getDsignature() {
        return Dsignature;
    }

    public void setDsignature(String Dsignature) {
        this.Dsignature = Dsignature;
    }
}
