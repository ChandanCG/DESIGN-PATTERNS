import java.util.*;

public class sports implements Reporter{
	static ArrayList<Reader> s =new ArrayList<>(); 
	Scanner ab=new Scanner(System.in);
	String text;
	@Override
	public void writeArticle() {
		System.out.println("Enter the sports news");
		text=ab.nextLine();
		System.out.println("Your Article\t" +text+ "\thas been written as sports news");
		
	}
	public void add(Reader r) {
		// TODO Auto-generated method stub
		s.add(r);
	}
	@Override
	public void notifyEveryone() {
		// TODO Auto-generated method stub
		int length=s.size();
		for(int i=0;i<length;i++){
			
			s.get(i).update();
			System.out.println("Notified "+s.get(i));
		}
	}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return text;
	}
}
