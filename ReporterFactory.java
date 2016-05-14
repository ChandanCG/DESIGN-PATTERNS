
public class ReporterFactory {
	public Reporter getCategory(String string) {
		if(string == null){
			return null;
		}		
		if(string.equalsIgnoreCase("local")){
			return new local();
        
		} 
		else if(string.equalsIgnoreCase("national")){
			return new national();
        
		} 
		else if(string.equalsIgnoreCase("international")){
			return new international();
			
		}
		else if(string.equalsIgnoreCase("sports")){
			return new sports();
			
		}
		else if(string.equalsIgnoreCase("fashion")){
			return new fashion();
		}
     
     return null;
		
		
	}
}
