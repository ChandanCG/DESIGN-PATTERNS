import java.util.*;


public class fashion implements Reporter{
	static ArrayList<Reader> f =new ArrayList<>(); 
	Scanner ab=new Scanner(System.in);
	String text;
	@Override
	public void writeArticle() {
		System.out.println("Enter the fashion news");
		text=ab.nextLine();
		System.out.println("Your Article\t" +text+ "\thas been written as fashion news");
		
	}
	public void add(Reader r) {
		// TODO Auto-generated method stub
		f.add(r);
	}
	@Override
	public void notifyEveryone() {
		// TODO Auto-generated method stub
		int length=f.size();
		for(int i=0;i<length;i++){
			f.get(i).update();
			System.out.println("Notified "+f.get(i));
		}
	}
	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return text;
	}
}
