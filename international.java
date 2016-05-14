import java.util.*;

public class international implements Reporter{
	static ArrayList<Reader> in =new ArrayList<>();
	Scanner ab=new Scanner(System.in);
	String text;
	@Override
	public void writeArticle() {
		System.out.println("Enter the international news");
		text=ab.nextLine();
		System.out.println("Your Article\t" +text+ "\t has been written as national news");
	}
	public void add(Reader r) {
			// TODO Auto-generated method stub
			in.add(r);
		}
		@Override
		public void notifyEveryone() {
			// TODO Auto-generated method stub
			int length=in.size();
			for(int i=0;i<length;i++){
				
				in.get(i).update();
				System.out.println("Notified "+in.get(i));
			}
		}
		@Override
		public String getState() {
			// TODO Auto-generated method stub
			return text;
		}
	}
