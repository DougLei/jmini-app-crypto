package com.douglei.mini.app.crypto;

import java.util.Scanner;

/**
 * 小程序入口
 * @author DougLei
 */
public class CryptoApp {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("欢迎进入Crypto小程序");
		System.out.println("1.加密小程序");
		System.out.println("2.解密小程序");
		System.out.println("---------------------------------\n");
		
		do {
			System.out.print("请选择你需要的小程序：");
			String choose = scanner.next();
			if(!"1".equals(choose)) {
				System.out.print("目前只实现了加密小程序, ");
				continue;
			}
			break;
		} while(true);
		new EncryptorApp().app(scanner);
	}
}
