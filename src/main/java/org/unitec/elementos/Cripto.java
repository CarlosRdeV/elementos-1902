
package org.unitec.elementos;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class Cripto {
    //Variables
    private static final String ALGO =  "AES"; //Declaramos el modo de encryptacion que vamos a usar
    private byte[] keyValue;

    //Constructor
    public Cripto(String key){
        keyValue = key.getBytes();
    }

    //Metodo para generar la Key del modo a usar
    private Key generateKey() throws  Exception{
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }

    //Metodo de encryptacion
    public String encrypt(String Data) throws  Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return  encryptedValue;
    }

        //Metodo para desencriptar
        public String dencrypt(String encryptedData) throws  Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
}
