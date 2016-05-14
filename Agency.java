import java.util.Scanner;


public class Agency {

		public static void main(String [] args)
		{

			Scanner in=new Scanner(System.in);
			String[] category={"local","national","international","fashion","sport"};
			boolean wish=true;
			boolean check=true;
			ReporterFactory reporterFactory;

		    Reporter reporter;
			int option;
			int option1;
			String type,name;
			while(wish)
			{
				String[] s=new String[5];
				ReaderFactory rf;
				Reader r1;
				System.out.println(".1. Reporter\n.2.Reader\n.3. EXIT : ");
				option=in.nextInt();
			
				switch(option)
				{
				case 1:	System.out.println("Your name?");
						name=in.next();
						check=true;
						while(check)
						{
							System.out.println(".1. ADD articlen.2.EXIT ");
							option1=in.nextInt();
							switch(option1)
							{
							case 1:		System.out.println("What type of article do you want to write?");
										for(String a: category)
										{
											System.out.println(a);
										}	
										type=in.next();
										reporterFactory = new ReporterFactory();
										reporter = reporterFactory.getCategory(type);
										reporter.writeArticle();
										reporter.notifyEveryone();
										break;
							case 2:		check=false;
							}
							ProxyNormalReader p1=new ProxyNormalReader();	}break;
				/*case 2:	System.out.println("Your name?");
						name=in.next();
						System.out.println("type of reader?");
						type=in.next();
						System.out.println("Categories selected: \n");
						rf=new ReaderFactory();
						r1= rf.getReader(type);
						r1.display(name);
						break;*/
				case 2: System.out.println("Enter your name: ");
						name=in.next();
						check=true;
						ProxyNormalReader p1=new ProxyNormalReader();
						while(check){
							
						//System.out.println("Premium(5 categories)\n Normal(2 categories)");
						//type=in.next();
						System.out.println(".1. Subscribe.2.EXIT ");
						option1=in.nextInt();
						switch(option1){
						
						case 1:
						for(String a: category)
						{
							System.out.println(a);
						}	
						type=in.next();
						
						p1.subscribe(name, type);
						break;
						case 2:check=false;break;
						}
						}break;
						/*if(type.equalsIgnoreCase("Premium"))
						{
							for(int i=0;i<5;i++)
							{	
								s[i]=in.next();
								reporterFactory = new ReporterFactory();
								reporter = reporterFactory.getCategory(s[i]);
								
							}	
						}
						else if(type.equalsIgnoreCase("Normal"))
						{
							for(int i=0;i<2;i++)
							{	
								s[i]=in.next();
								reporterFactory = new ReporterFactory();
								reporter = reporterFactory.getCategory(s[i]);
								
							}	
							System.out.println("Successfully subscribed");
						}	
						rf=new ReaderFactory();
						r1= rf.getReader(type);
						case 2:check=false;
						/*r1.add(name,s);*/
						
					//	break;
				case 3: wish=false; break;
				default: break;
				}
			}	
}
}