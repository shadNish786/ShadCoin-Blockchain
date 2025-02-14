
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
    
    
    //constructor for block
    public Block(String data,String previousHash){
        this.data =data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        
    }
}
