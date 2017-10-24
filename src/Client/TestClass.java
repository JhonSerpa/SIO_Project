/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.xml.crypto.dsig.Transform;

/**
 *
 * @author joaos
 */
public class TestClass {
    
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchAlgorithmException, NoSuchProviderException {
        KeyGen kg = new KeyGen();
        byte[] sessKey = kg.generateSessionKey();
        System.out.println(sessKey);
    }
}
