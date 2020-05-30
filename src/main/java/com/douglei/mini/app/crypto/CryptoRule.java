package com.douglei.mini.app.crypto;

/**
 * 
 * @author DougLei
 */
abstract class CryptoRule {
	protected static final byte[] radixes = {'+','.','0','7',':','F','x','=','t','?'};
	protected static final byte[] origin = {'!','"','#','$','%','&','\'','(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~'};
	protected static final byte[] odd = {'g','I','p','P','7','Q','S','&','e','@','s','3','O','R','x','u','Y','t','m','A','`','r','0','H','*','c',')','a','-','D','9','"','1','\'','+','l','k','X',']','\\','^','8','!','5','v','J','%','d',',','q','E','y','N',':','M','/','z','V','2','G','[','(','$','h','_','U','j','W','b','?','>','4','{','}','L','Z','o',';','#','f','6','<','|','=','T','F','B','C','K','w','.','~','n','i'};
	protected static final byte[] even = {'&','A','V','o','1','U','"','.','s',';','O',')','r','H',']','M','S','[','6','-','c',':','w','I','i','(','`',',','9','8','5','X','?','K','v','g','}','7','m','B','~','k','G','0','N','n','j','3','t','D','P','h','Y','L','Z','Q','a','R','4','>','<','W','p','{','%','/','_','=','+','f','\'','u','T','J','y','$','q','|','\\','b','@','E','d','F','#','*','e','!','^','2','x','z','l','C'};
}
