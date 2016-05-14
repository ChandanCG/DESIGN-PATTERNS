	import java.util.ArrayList;


	public class ProxyNormalReader implements Reader{
		public int max_cat=2;
		public int user_Cat=0;
		static ArrayList<String> ar =new ArrayList<>(); 
		@Override
		public void display(String name) {
			// TODO Auto-generated method stub
			for(int i=0;i<ar.size();i=i+3)
			{
				if(name.equalsIgnoreCase(ar.get(i)))
				{
					int j=i;
					System.out.println(ar.get(++j)+"\n"+ar.get(++j));
				}
			}
			
		}

	//	@Override
	//	public void add(String name, String[] s) {
			// TODO Auto-generated method stub
		//	ar.add(name);
			//for(int i=0;i<2;i++)
			//{
			//	ar.add(s[i]);
			//}	
	//	}

		@Override
		public void update() {
			// TODO Auto-generated method stub
			System.out.println("received an article");
		}
		@Override
		public void subscribe(String name, String s) {
			// TODO Auto-generated method stub
			
		
		if(user_Cat<max_cat)
		{
			user_Cat++;
			System.out.println("Subscribed Succesfully");
			System.out.println(user_Cat);
		}
		else
			System.out.println("cannot subscribe");
	}
	}
