package com.example.AEStest;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.springframework.util.Base64Utils;

public class DES {
	private final SecretKey key;
	private Cipher encCipher;
	private Cipher decCipher;

	public DES() throws Exception {
		this.key = generateKey();
	}

	public DES(SecretKey key) throws Exception {
		this.key = key;
		initCipher();
	}

	private void initCipher() throws Exception {
		encCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		decCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		encCipher.init(Cipher.ENCRYPT_MODE, key);
		decCipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(encCipher.getIV()));
	}

	public SecretKey generateKey() throws Exception {
		return KeyGenerator.getInstance("DES").generateKey();
	}

	public byte[] encrypt(String message) throws Exception {
		return encCipher.doFinal(message.getBytes());
	}

	public String decrypt(byte[] message) throws Exception {
		return new String(decCipher.doFinal(message));
	}

	private static String encode(byte[] data) {
		return Base64Utils.encodeToString(data);

		//return Base64.getEncoder().encodeToString(data);
	}

	private static byte[] decode(String data) {
		 return Base64Utils.decode(data.getBytes(StandardCharsets.UTF_8));

		//return Base64.getDecoder().decode(data);
	}

	public static void main(String args[]) throws Exception {
		DES des = new DES();
		SecretKey key = des.generateKey();
		DES des2 = new DES(key);
		System.out.println("Encrypt/decrypr key:");
		System.out.println(encode(key.getEncoded()));
		System.out.println();
		String message = "this is test mesg";
		byte[] encryptedByte = des2.encrypt(message);
		System.out.println("encrypted message is : " + encode(encryptedByte));
		System.out.println("decrypted message is : " + des2.decrypt(encryptedByte));
	}
}
