import java.util.ArrayList;


public class Subscriber implements Subject {
	 private ArrayList<Reader> readers;
	 
	 private String local;
	 private String national;
	 private String international;
	 private String fashion;
	 private String sports;
	 private  Reader r;
	 public Subscriber(){
		 	        // Creates an ArrayList to hold all readers
		 	        readers = new ArrayList<Reader>();
		 	    }	
	 public void register(Reader newReader) {
		 	        // Adds a new reader to the ArrayList
		 	        readers.add(newReader);
		 	    }
	 public void unregister(Reader deleteReader) {
		 
		 	        // Get the index of the reader to delete
		
		 	        int readerIndex = readers.indexOf(deleteReader);
		
		 	        // Print out message (Have to increment index to match)
		
		 	        System.out.println("Reader " + (readerIndex+1) + " deleted");
		
		 	        // Removes reader from the ArrayList
		            readers.remove(readerIndex);
		 	    }
		 	 
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Reader reader : readers){
            reader.update();
	}

}
}
