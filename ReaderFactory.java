
public class ReaderFactory {
	public Reader getReader(String string) {

	if(string == null){
		return null;
	}		
	if(string.equalsIgnoreCase("normal")){
		return new ProxyNormalReader();
    
	} 
	else if(string.equalsIgnoreCase("premium")){
		return new ProxyPremiumReader();
    
	} 
	return null;
}}

