public class ReverseEncryptor implements EncryptionStrategy {

	@Override
	public String encrypt(String text) {
		// TODO Auto-generated method stub
		return reverse(text);
	}

	@Override
	public String decrypt(String text) {
		// TODO Auto-generated method stub
		return reverse(text);
	}

	private String reverse(String text) {
		// TODO Auto-generated method stub
		String reverseText = new String();
		for (int i = text.length()-1; i >= 0; i--) {
			reverseText = reverseText +""+ text.charAt(i);
		}
		return reverseText;
	}

}
