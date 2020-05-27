package com.douglei.mini.app.crypto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.douglei.tools.instances.file.writer.FileBufferedWriter;
import com.douglei.tools.utils.StringUtil;

/**
 * 加密小程序
 * @author DougLei
 */
class EncryptorApp extends CryptoRule{
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("欢迎进入加密小程序");
		System.out.println("---------------------------------\n");
		String str;
		
		File targetFile = new File(System.getProperty("user.home") + File.separatorChar + "encryptor-app" + File.separatorChar + "result.txt");
		Encryptor valueEncryptor = new Encryptor();
		FileBufferedWriter writer = new FileBufferedWriter(targetFile);
		try {
			do {
				System.out.println("请输入你要加密的字符串， 如果想要结束， 请输入exit（不区分大小写）：");
				str = scanner.next();
				if(StringUtil.isEmpty(str)) {
					System.out.println("请不要输入空字符串");
					continue;
				}
				str = str.trim();
				if("exit".equalsIgnoreCase(str)) {
					break;
				}
				writer.write(str);
				writer.write(" =========加密结果为=========> ");
				writer.write(valueEncryptor.encrypt(str));
				writer.newLine();
			}while(true);
			writer.close();
			System.out.println("加密结束， 请去以下文件中获取你的加密数据 ========> " + targetFile);
			System.out.println("确认后， 直接关闭该窗口来结束程序");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("你的程序出问题了， 不要关闭该窗口， 并联系开发人员");
			scanner.next();
		}
		scanner.next();
	}
}
