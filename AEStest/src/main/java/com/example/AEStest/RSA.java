package com.example.AEStest;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

import org.springframework.util.Base64Utils;

public class RSA {
//int keysize;
	private PrivateKey privateKey;
	private PublicKey publicKey;
	private int keysize = 1024;
	private String charsetName = "UTF8";

	public RSA() {
		try {
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			generator.initialize(keysize);
			KeyPair pair = generator.generateKeyPair();
			privateKey = pair.getPrivate();
			publicKey = pair.getPublic();
		} catch (Exception ingnored) {
		}
	}

	public String encrypt(String message) throws Exception {
		byte[] messageToBytes = message.getBytes();
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] encryptedByte = cipher.doFinal(messageToBytes);
		return encode(encryptedByte);
	}

	public String decrypt(String encryptedMessage) throws Exception {
		byte[] encryptedBytes = decode(encryptedMessage);
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decryptedMessage = cipher.doFinal(encryptedBytes);
		return new String(decryptedMessage, charsetName);
	}

	private String encode(byte[] data) {
		return Base64Utils.encodeToString(data);

		//return Base64.getEncoder().encodeToString(data);
	}

	private byte[] decode(String data) {
		 return Base64Utils.decode(data.getBytes(StandardCharsets.UTF_8));

		//return Base64.getDecoder().decode(data);
	}

	public static void main(String args[]) {
		try {
			RSA rsa = new RSA();
			String encryptedMessage = rsa.encrypt("hello world2");
			String decryptedMessage = rsa.decrypt(encryptedMessage);
			System.out.println(" Encrypted message = " + encryptedMessage);
			System.out.println(" Decrypted message = " + decryptedMessage);
		} catch (Exception ignored) {
		}
	}
}
