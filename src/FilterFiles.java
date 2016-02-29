public class FilterFiles {
	private final String[] args;	
	String commands = new String();
	private String files="";
	private void filter(){
		for(String arg : args){
			if(arg.indexOf("-")==0){
				commands+=arg.replace("-","");
			} else {
				files+=arg+"\n";
			}
		}
	}
	public FilterFiles(String[] args){
		this.args = args;
		filter();
	}
	public String getCommands(){
		return commands;
	}
	public String[] getFiles(){
		return files.split("\n");
	}
}
