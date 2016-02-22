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
	public int countLines(){
		char counts = 0;
		for (String value: this.text.split("\n")){
        counts++;
      }
      return counts;
	}
}