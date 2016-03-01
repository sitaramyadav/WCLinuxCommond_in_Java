import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile{
	private String file;
	private String commands;
	public ReadFile(String file_,String commands) throws Exception{
		this.file = file_;
		this.commands = commands;
	}
	private String intoString() throws Exception {
    File file = new File(this.file);
    int length = (int)file.length();
    FileReader fr =new FileReader(file);
    char[] count = new char [length];
    fr.read(count,0,length);
    Wc wc = new Wc(new String(count));
    String result = wc.countAll(file.toString(),this.commands);
    return result;

   }
   public void printData() throws Exception{
   	System.out.println(intoString());
   }
 } 