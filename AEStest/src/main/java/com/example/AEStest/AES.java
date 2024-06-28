package com.example.AEStest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.util.Base64Utils;

public class AES {

	private SecretKey key;
	private int KEY_SIZE = 128;
	private int T_LEN = 128;
	Cipher encryptionCipher;
	String userName = "userName";

	public void init() throws Exception {
// KeyGenerator generator=KeyGenerator.getInstance("AES");
// generator.init(KEY_SIZE);
// key=generator.generateKey();
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		key = new SecretKeySpec(messageDigest.digest(userName.getBytes(StandardCharsets.UTF_8)), "AES");
	}

	public String encrypt(String message) throws Exception {
		byte[] messageInBytes = message.getBytes();// SecureRandom sr = SecureRandom.getInstanceStrong();
// byte[] salt = new byte[16];
// sr.nextBytes(salt);
// PBEKeySpec spec = new PBEKeySpec(userName.toCharArray(), salt, 1000, 128 * 8);
// MessageDigest messageDigest = MessageDigest.getInstance("MD5");
// key = new SecretKeySpec(messageDigest.digest(userName.getBytes(StandardCharsets.UTF_8)), "AES");
// SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(spec); encryptionCipher = Cipher.getInstance("AES"); 
//encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
		encryptionCipher = Cipher.getInstance("AES");
		encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedByte = encryptionCipher.doFinal(messageInBytes);
		return encode(encryptedByte);
	}

	public String decrypt(String decryptedMessage) throws Exception {
		byte[] messageInBytes = decode(decryptedMessage);

		Cipher decryptionCipher = Cipher.getInstance("AES");

		decryptionCipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decryptedByte = decryptionCipher.doFinal(messageInBytes);
		return new String(decryptedByte);
	}
	

	private String encode(byte[] data) {
		return Base64Utils.encodeToString(data);

	}

	private byte[] decode(String data) {
      

		 return Base64Utils.decode(data.getBytes(StandardCharsets.UTF_8));
	}

	public static void main(String args[]) {
		try {
			AES aes = new AES();
			aes.init();
			String encryptedMessage = aes.encrypt("hello world AES**********");
			String decryptedMessage = aes.decrypt(encryptedMessage);
			System.out.println(" Encrypted message " + encryptedMessage);
			System.out.println(" Decrypted message " + decryptedMessage);
		} catch (Exception Exception) {
			Exception.printStackTrace();
		}
	}
}
