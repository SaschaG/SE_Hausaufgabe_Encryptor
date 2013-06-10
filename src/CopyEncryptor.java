public class CopyEncryptor implements EncryptionStrategy {


	public String encrypt(String text){
		String text2 = new String(text);
		return text2;
	}
	
	public String decrypt(String text){
		return text;
	}
}
