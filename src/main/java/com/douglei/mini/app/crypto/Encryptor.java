package com.douglei.mini.app.crypto;

import java.util.Base64;

/**
 * 值加密器
 * @author DougLei
 */
class Encryptor extends CryptoRule{

	/**
	 * 进行加密操作
	 * @param value
	 * @return
	 */
	public String encrypt(String value) {
		if(value == null) {
			return null;
		}
		byte radix = (byte) (System.currentTimeMillis()%10);
		boolean isOdd = radix%2==1;// 是否是奇数
		StringBuilder sb = new StringBuilder(value.length()+1);
		for(int i=0;i<value.length();i++) {
			sb.append(getEncryptChar(value.charAt(i), isOdd));
		}
		return Base64.getEncoder().encodeToString(sb.append(((char)radixes[radix])).toString().getBytes());
	}
	
	// 获取加密后的char值
	private char getEncryptChar(char charValue, boolean isOdd) {
		if(charValue > 32 && charValue < 127) {
			for(byte i=0;i<origin.length;i++) {
				if(origin[i] == charValue) {
					return (char)(isOdd?odd[i]:even[i]);
				}
			}
		}
		return charValue;
	}
}
