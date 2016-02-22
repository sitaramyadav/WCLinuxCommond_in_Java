public class Wc {
	String text;
	public Wc (String text){
		this.text = text;
	}
	public int countChar(){
		return this.text.length();
	}
	public int countBytes(){
		final byte[] counts = this.text.getBytes();
		return counts.length;
	}
}