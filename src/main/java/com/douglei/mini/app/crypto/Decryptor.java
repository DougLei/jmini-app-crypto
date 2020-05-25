package com.douglei.mini.app.crypto;

import java.util.Base64;

/**
 * 值解密器
 * @author DougLei
 */
public class Decryptor extends CryptoRule{
	
	/**
	 * 进行解密操作
	 * @param value
	 * @return
	 */
	public String decrypt(String value) {
		if(value == null) {
			return null;
		}
		value = new String(Base64.getDecoder().decode(value.getBytes()));
		int length = value.length()-1;
		boolean isOdd = isOdd(value.charAt(length));
		StringBuilder sb = new StringBuilder(length);
		for(int i=0;i<length;i++) {
			sb.append(getDecryptChar(value.charAt(i), isOdd));
		}
		return sb.toString();
	}
	
	// 判断char值是否是奇数
	private boolean isOdd(char charValue) {
		for (byte i = 0; i < radixes.length; i++) {
			if(charValue == radixes[i]) {
				return i%2 == 1;
			}
		}
		return false;
	}
	
	// 获取解密后的char值
	private char getDecryptChar(char charValue, boolean isOdd) {
		if(charValue > 32 && charValue < 127) {
			if(isOdd) {
				return getDecryptChar(charValue, odd);
			}else {
				return getDecryptChar(charValue, even);
			}
		}
		return charValue;
	}
	private char getDecryptChar(char charValue, byte[] cs) {
		for(byte i=0;i<cs.length;i++) {
			if(cs[i] == charValue) {
				return (char)(origin[i]);
			}
		}
		return charValue;
	}
}
