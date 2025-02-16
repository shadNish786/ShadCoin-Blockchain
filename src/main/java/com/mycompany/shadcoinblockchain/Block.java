
package com.mycompany.shadcoinblockchain;

/**
 *
 * @author nisha
 */

//import code 
import java.util.Date;


//class block 
public class Block {
    
    public String hash; // holds digital signature
    public String previousHash; // holds previous blocks hash
    private String data; //data is set to a simple message and hold block data
    private long timeStamp; // as number of milliseconds since 1/1/1970
    private int slave;
    
    
    //constructor for block
    public Block(String data,String previousHash){
        this.data =data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();//Making sure we do this after we set the other values.
        
    }
    
    
    //new class to calculate hash 
    public String calculateHash(){
        String calculateHash = StringUtil.applySha256(previousHash+ Long.toString(timeStamp)+Integer.toString(slave)+data);
        return calculateHash;
    }
    
    //mining code 
    public void mineBlock(int difficulty){
        String target = new String(new char[difficulty]).replace('\0','0'); //Create a string with difficulty * "0" 
        while(!hash.substring(0,difficulty).equals(target)) {
                slave ++;
                hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
  
}
