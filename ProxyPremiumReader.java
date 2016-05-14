
import java.util.ArrayList;


public class ProxyPremiumReader implements Reader{
	int max_cat=5;
	int user_Cat=0;

	static ArrayList<String> ar =new ArrayList<>(); 


	@Override
	public void display(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.size();i=i+6)
		{
			if(name.equalsIgnoreCase(ar.get(i)))
			{
				int j=i;
				for(int k=0;k<5;k++)
				System.out.println(ar.get(++j)+"\n");
			}
		}
	}

	@Override
	public void subscribe(String name, String s) {
		// TODO Auto-generated method stub
		
	
	if(user_Cat<=max_cat)
	{
		user_Cat++;
		System.out.println("Subscribed Succesfully");
	}
	else
		System.out.println("cannot subscribe");
}

		
//	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void subscribe() {
		// TODO Auto-generated method stub
		
	//}

	
}