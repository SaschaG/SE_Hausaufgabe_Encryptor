public class CopyEncryptor extends Encryptor {


	public String encrypt(String text){
		String text2 = new String(text + " " + text);
		return text2;
	}
	
	public String decrypt(String text){
		String text2 = new String(text + " " + text);
		return text2;
	}
}
