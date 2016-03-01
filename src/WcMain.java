import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WcMain{
  public static void main(String[] args) throws Exception{
    FilterFiles filteredFilesAndCommands = new FilterFiles(args);
    String commands = filteredFilesAndCommands.getCommands();
    String files[] = filteredFilesAndCommands.getFiles();
    for(String file : files){
      try{
        ReadFile reader= new ReadFile(file,commands); 
        reader.printData();
      }catch(Exception error){
        System.err.println("Wc :"+error.getMessage());
      }
    }
  }
}