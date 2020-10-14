package com.educandoweb.course.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	
	private Encrypt() {	}
	
	

	public static String encrypt(String text) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update(text.getBytes(StandardCharsets.UTF_8));
		return new BigInteger(1, messageDigest.digest()).toString(16);
	}
	
	
}
