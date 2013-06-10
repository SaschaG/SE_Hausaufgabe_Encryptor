
public class Encryptor {

	EncryptionStrategy  encryptionStrategy;
	public void setEncryptionStrategy(EncryptionStrategy encryptor){
		this.encryptionStrategy = encryptor;
	}
	public String encrypt(String startText) {
		// TODO Auto-generated method stub
		return encryptionStrategy.encrypt(startText);
	}
	public String decrypt(String endText) {
		// TODO Auto-generated method stub
		return encryptionStrategy.decrypt(endText);
	}
}
