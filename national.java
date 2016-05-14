import java.util.*;

public class national implements Reporter {
	static ArrayList<Reader> n =new ArrayList<>();
	Scanner ab=new Scanner(System.in);
	String text;
	@Override
	public void writeArticle() {
		System.out.println("Enter the national news");
	 text=ab.nextLine();
		System.out.println("Your Article\t" +text+ "\thas been written as national news");
		
		
	}
	public void add(Reader r) {
		// TODO Auto-generated method stub
		n.add(r);
	}
	@Override
	public void notifyEveryone() {
		// TODO Auto-generated method stub
		int length=n.size();
		for(int i=0;i<length;i++){
			n.get(i).update();
			System.out.println("Notified "+n.get(i));
		}
	}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return text;
	}
}
