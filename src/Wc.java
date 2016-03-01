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
      return counts-1;
	}
	public int countWords(){
		return this.text.split(" ").length;
	}
	private String countAll(String fileName){
		return "\t"+countLines()+"\t"+countWords()+"\t"+countBytes()+" "+fileName;
	}
	public String countAll(String fileName,String commands){
		if(commands.equals("")) return countAll(fileName);
		return consolidat(commands)+" "+fileName;
	}
	private String consolidat(String commands){
	String result =new String("\t");
	if(commands.indexOf("l")!=-1) result+=countLines()+"\t";
	if(commands.indexOf("w")!=-1) result+=countWords()+"\t";
	if(commands.lastIndexOf("m") > commands.lastIndexOf("c")) result+=countChar();
	if(commands.lastIndexOf("m") < commands.lastIndexOf("c")) result+=countBytes();
	return result;
	}
}