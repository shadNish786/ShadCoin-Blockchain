
package com.mycompany.shadcoinblockchain;

/**
 *
 * @author nisha
 */
//import code 
import java.security.MessageDigest;



public class StringUtil {
      //applies shad256 to a string and returns results 
    public static String applySha256(String input){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Applies sha256 to out input 
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            for (int i = 0;i < hash.length;i++){
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() ==1){
                    hexString.append(hex);
                }
                hexString.append(hex);
              }
            return hexString.toString();
        }
        catch(Exception e){
        throw new RuntimeException(e);
     }
  }
}
