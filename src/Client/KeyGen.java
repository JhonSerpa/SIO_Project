package Client;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class KeyGen {
    
    private PrivateKey privKey;
    private PublicKey pubKey;
    private KeyPairGenerator keyGen;
    private KeyPair pair;
    
    /**
     * This class will generate a session key for the connection between the client and the server.\n
     * Uses algorithm AES.\n
     * Will encrypt the messages between client and server.
     * 
     * Duvida: A session key vai ser enviada para o servidor?
     * R: Sim. Na sec-data        
     * 
     * @return Session key
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException 
     */
    public byte[] generateSessionKey() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(256);
        SecretKey key = kgen.generateKey();
        byte[] sessionKey = key.getEncoded();
        return sessionKey;
    }
    
    
    
    
    public void genKeyPair() throws NoSuchAlgorithmException{
	this.keyGen = KeyPairGenerator.getInstance("RSA");
	this.keyGen.initialize(128);
    }
    

    public void createKeys() {
	this.pair = this.keyGen.generateKeyPair();
	this.privKey = pair.getPrivate();
	this.pubKey = pair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return this.privKey;
    }
    /**
     * 
     * @return 
     */
    public PublicKey getPublicKey() {
        return this.pubKey;
    }
    
    
    
    
    
    
    
    
    
}
