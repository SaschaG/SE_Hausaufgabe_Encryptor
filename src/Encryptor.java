
public class Encryptor {

	Encryptor encryptor;
	public void setEncryptionStrategy(Encryptor encryptor){
		this.encryptor = encryptor;
	}
	
	public Encryptor getEncryptor(){
		return encryptor;
	}
	
	public String encrypt(String text){
		return encryptor.encrypt(text);
	}
	
	public String decrypt(String text){
		return encryptor.decrypt(text);
	}
}
