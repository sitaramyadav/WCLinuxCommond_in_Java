import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WcMain{
  private static String readFile(String file_,String commands) throws Exception {
    File file = new File(file_);
    int length = (int)file.length();
    FileReader fr =new FileReader(file);
    char[] count = new char [length];
    fr.read(count,0,length);
    Wc wc = new Wc(new String(count));
    String result = wc.countAll(file.toString(),commands);
    return result;

   }
  
  public static void main(String[] args) throws Exception{
    FilterFiles filteredFilesAndCommands = new FilterFiles(args);
    String commands = filteredFilesAndCommands.getCommands();
    String files[] = filteredFilesAndCommands.getFiles();
    for(String file : files){
      try{
          System.out.println(readFile(file,commands));
      }catch(FileNotFoundException fne){
        System.err.println("Wc :"+fne.getMessage());
      }
      catch(IOException ioe){
        System.err.println("Wc :"+ioe.getMessage());
      }
    }
  }
}