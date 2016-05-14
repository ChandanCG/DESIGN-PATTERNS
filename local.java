import java.util.*;

public class local implements Reporter{
	static ArrayList<Reader> l =new ArrayList<>(); 
	Scanner ab=new Scanner(System.in);
	String text;
	@Override
	public void writeArticle() {
		System.out.println("Enter the local news");
		text=ab.nextLine();
		System.out.println("Your Article\t" +text+ "\thas been written as local news");
		
	}
	public void add(Reader r) {
		// TODO Auto-generated method stub
		l.add(r);
	}
	@Override
	public void notifyEveryone() {
		// TODO Auto-generated method stub
		int length=l.size();
		for(int i=0;i<length;i++)
		{
			
			l.get(i).update();
			
			System.out.println("Notified "+l.get(i));
		
	}
}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return text;
	}
}
