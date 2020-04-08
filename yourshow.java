import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class yourshow
{	public static String ar[][]=new String[4][11];
    public static String br[][]=new String[4][11];
	public static String cr[][]=new String[4][11];
	public static String dr[][]=new String[4][11];
	public static String l;
	

	public static Scanner in=new Scanner(System.in);
	public static void main(String args[]) throws Exception
	{app();
	}
	public static void cls()
         {
	           try
	              {	
		            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	              }
				catch(Exception e)
		             {
			           System.out.println(e);
		             }
          }
	


	private static void app() throws Exception
	{cls();
		while(true)
	{System.out.println("\t\t\t\tWELCOME TO YOUR SHOW\n\t\t\t1.Movie Name\n\t\t\t2.Exit");
	 String choice=in.next();
	 switch(choice)
	 {  case "1": Movie_Name();
		break;
		case"2": System.exit(0);
		
		default: System.out.println("INVALID OPTION");
		break;
	 }
	 }
}

private static void Movie_Name() throws Exception{
	Scanner in=new Scanner(System.in);
	a:while(true)
	{System.out.println("\t\t\tMovie Name");
	 System.out.println("\t\t\t1.Spider Man\n\t\t\t2.Dangal\n\t\t\t3.Exit");
	 String Movie_Name=in.nextLine();
	 switch(Movie_Name)
	 { case "1":Spider_Man();
	   break a;
	   case "2":Dangal();
	   break a;
	   case "3": System.exit(0);
	   
	   default: System.out.println("INVALID OPTION");
	   break;
	 }
	}
}
private static void Spider_Man() throws Exception{
	Scanner in=new Scanner(System.in);
	b:while(true)
	{System.out.println("\t\t\tSpider Man");
	 System.out.println("\n\t\t\t1.12:30PM\t\t2.3:30PM\t\t3.Back\n");
	 String Spider_Man=in.nextLine();
	 switch(Spider_Man)
	 {case "1":pvr1();
	  break b;
	  case "2":pvr2();
	  break b;
	  case "3":Movie_Name();
	  ;
	                                                                                                                                                                                                                                     
	 default: System.out.println("INVALID OPTION");
	 break;
	 }
	}
}
private static void Dangal() throws Exception{
	Scanner in=new Scanner(System.in);
	b:while(true)
	{System.out.println("\t\t\tDangal");
	 System.out.println("\n\t\t\t1.12:30PM\t\t2.3:30PM\t\t3.Back\n");
	 String Dangal=in.nextLine();
	 switch(Dangal)
	 {case "1":pvr11();
	  break b;
	  case "2":pvr22();
	  break b;
	  case "3":Movie_Name();
	 
	 default: System.out.println("\n\t\tINVALID OPTION");
	 break;
	 }
	}
}
        

private static void pvr1() throws Exception{
	Scanner in=new Scanner(System.in);
	k:while(true){
	System.out.println("\n\t\t\t1.Check Seat Availability\n\t\t\t2.Back");
	String pvr=in.next();
	 switch(pvr)
	 {case "1":avail();
	  break k;
	  case "2": Spider_Man();
	  
	 default: System.out.println("\n\t\tINVALID OPTION");
	 break;
	 }
	}
}
private static void pvr2() throws Exception{
	Scanner in=new Scanner(System.in);
	k:while(true){
		System.out.println("\n\t\t\t1.Check Seat Availability\n\t\t\t2.Back");
	String pvr=in.next();
	 switch(pvr)
	 {case "1":avail2();
	  break k;
	  case "2": Spider_Man();
	  
	 default: System.out.println("\n\t\tINVALID OPTION");
	 break;
	 }
	}
}

private static void avail() throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("\n\t\tPlease find the desired seat by looking at the miniature block of the hall\n\t\t\t[B] mark shows the booked seat\n");
        String b="Normal[50]";
		String c="Silver[100]";
		String d="Gold[150]";
		System.out.println("\t\t\t\t    SCREEN\n\t\t\t      ____________________\n");
	    for(int i=1;i<=3;i++)
		{if(i==1)
		{l=b;}
		if(i==2)
		{l=c;}
		if(i==3)
		{l=d;}
		for(int j=0;j<=9;j++)
		{
		if(ar[i][j]==null)
			{System.out.print(i+""+j+"\t");
			}
		else
		{ System.out.print("[B]"+i+""+j+"\t");
        }
		}System.out.print("\n\n\t\t\t\t"+l+"\n\n");
		}System.out.println("\n\t\tChecking seat for how many people?\tor\tEnter zero to go back ");
		int n=in.nextInt();
		int a[]=new int[n+1];
		int bb[]=new int[n+1];
		
	if(n==0)
	{ Spider_Man();
	}
	
		m:for(int i=1;i<=n;i++)
	{ 	l:while(true){
		System.out.println("\n\t\tEnter seat number("+i+"):");
		int e=in.nextInt();
		int t=e/10;
		a[i]=t;
		t=e%10;
		bb[i]=t;
		if(ar[a[i]][bb[i]]==null)
		{System.out.println("\t\tSeat available\n");
		if(i==n)
		{break m;
		}
		break l;
		}
		else
		{System.out.println("\n\t\tThe seat is booked.Try again");
		}
	}
	}
	String mn="\nSpider man\t12:30\tAUDI 1\n";
	int u[]=new int[n+1]; 
	System.out.println("\t\t\t1.Book tickets\n\t\t\t2.Back");
	String k=in.next();
	switch(k)
	 {case "1":for(int i=1;i<=n;i++)
				{ar[a[i]][bb[i]]="1";
				 String uu=""+a[i]+""+bb[i]+"";
				 u[i]=Integer.parseInt(uu);
				}
				bill(mn,u);
	  break ;
	  case "2": Spider_Man();
	  
	 default: System.out.println("\t\t\tINVALID OPTION");
	 break;
	 }
	 }
	 
	
	private static void avail2() throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("\n\t\tPlease find the desired seat by looking at the miniature block of the hall\n\t\t[B] mark shows the booked seat\n");
        String b="Normal[50]";
		String c="Silver[100]";
		String d="Gold[150]";
		System.out.println("\t\t\t\t    SCREEN\n\t\t\t      ____________________\n");
	    for(int i=1;i<=3;i++)
		{if(i==1)
		{l=b;}
		if(i==2)
		{l=c;}
		if(i==3)
		{l=d;}
		for(int j=0;j<=9;j++)
		{
		if(br[i][j]==null)
			{System.out.print(i+""+j+"\t");
			}
		else
		{ System.out.print("[B]"+i+""+j+"\t");
        }
		}System.out.print("\n\n\t\t\t\t"+l+"\n\n");
		}System.out.println("\t\tChecking seat for how many people?\tor\tEnter zero to go back  ");
	int n=in.nextInt();
	int a[]=new int[n+1];
	int bb[]=new int[n+1];
	if(n==0)
	{ Spider_Man();
	}
	
		m:for(int i=1;i<=n;i++)
	{ 	l:while(true){
		System.out.println("\n\t\tEnter seat number("+i+"):");
		int e=in.nextInt();
		int t=e/10;
		a[i]=t;
		t=e%10;
		bb[i]=t;
		if(br[a[i]][bb[i]]==null)
		{System.out.println("\t\tSeat available");
		if(i==n)
		{break m;
		}
		break l;
		}
		else
		{System.out.println("The seat is booked.Try again");
		}
	}
	}
	String mn="\nSpider man\t3:30\tAUDI 2\n";
	int u[]=new int[n+1];
	System.out.println("\t\t1.Book tickets\n\t\t2.Back");
	String k=in.next();
	switch(k)
	 {case "1":for(int i=1;i<=n;i++)
				{br[a[i]][bb[i]]="1";
				String uu=""+a[i]+""+bb[i]+"";
				 u[i]=Integer.parseInt(uu);
				}
				bill(mn,u);
				
	  break ;
	  case "2": Spider_Man();
	  
	 default: System.out.println("\nINVALID OPTION");
	 break;
	 }
		
	}

private static void pvr11() throws Exception{
	Scanner in=new Scanner(System.in);
	k:while(true){
		System.out.println("\n\t\t1.Check Seat Availability\n\t\t2.Back");
	String pvr=in.next();
	 switch(pvr)
	 {case "1":avail1();
	  break k;
	  case "2": Dangal();
	  
	 default: System.out.println("INVALID OPTION");
	 break;
	 }
	}
}

private static void pvr22() throws Exception{
	Scanner in=new Scanner(System.in);
	k:while(true){
		System.out.println("\n\t\t1.Check Seat Availability\n\t\t2.Back");
	String pvr=in.next();
	 switch(pvr)
	 {case "1":avail22();
	  break k;
	  case "2": Dangal();
	  
	 default: System.out.println("INVALID OPTION");
	 break;
	 }
	}
}


private static void avail1() throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("Please find the desired seat by looking at the miniature block of the hall\n\t\t[B] mark shows the booked seat\n");
        String b="Normal[50]";
		String c="Silver[100]";
		String d="Gold[150]";
		System.out.println("\t\t\t\t    SCREEN\n\t\t\t      ____________________\n");
	    for(int i=1;i<=3;i++)
		{if(i==1)
		{l=b;}
		if(i==2)
		{l=c;}
		if(i==3)
		{l=d;}
		for(int j=0;j<=9;j++)
		{
		if(cr[i][j]==null)
			{System.out.print(i+""+j+"\t");
			}
		else
		{ System.out.print("[B]"+i+""+j+"\t");
        }
		}System.out.print("\n\n\t\t\t\t"+l+"\n\n");
		}System.out.println("\n\t\tChecking seat for how many people?\tor\tEnter zero to go back ");
	int n=in.nextInt();
	int a[]=new int[n+1];
	int bb[]=new int[n+1];
	if(n==0)
	{ Dangal();
	  
	}
	
		m:for(int i=1;i<=n;i++)
	{ 	l:while(true){
		System.out.println("\t\tEnter seat number("+i+"):");
		int e=in.nextInt();
		int t=e/10;
		a[i]=t;
		t=e%10;
		bb[i]=t;
		if(cr[a[i]][bb[i]]==null)
		{System.out.println("\t\tSeat available");
		if(i==n)
		{break m;
		}
		break l;
		}
		else
		{System.out.println("\t\tThe seat is booked.Try again");
		}
	}
	}
	String mn="\nDangal\t12:30\tAUDI 3\n";
	int u[]=new int[n+1];
	System.out.println("\t\t1.Book tickets\n\t\t2.Back");
	String k=in.next();
	switch(k)
	 {case "1":for(int i=1;i<=n;i++)
				{cr[a[i]][bb[i]]="1";
			String uu=""+a[i]+""+bb[i]+"";
				 u[i]=Integer.parseInt(uu);
				}
				bill(mn,u);
				
	  break ;
	  case "2": Dangal();
	  
	 default: System.out.println("\t\tINVALID OPTION");
	 break;
	 }
		
	}
	
	
	private static void avail22() throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("\t\tPlease find the desired seat by looking at the miniature block of the hall\n\t\t[B] mark shows the booked seat\n");
        String b="Normal[50]";
		String c="Silver[100]";
		String d="Gold[150]";
		System.out.println("\t\t\t\t    SCREEN\n\t\t\t      ____________________\n");
	    for(int i=1;i<=3;i++)
		{if(i==1)
		{l=b;}
		if(i==2)
		{l=c;}
		if(i==3)
		{l=d;}
		for(int j=0;j<=9;j++)
		{
		if(dr[i][j]==null)
			{System.out.print(i+""+j+"\t");
			}
		else
		{ System.out.print("[B]"+i+""+j+"\t");
        }
		}System.out.print("\n\n\t\t\t\t"+l+"\n\n");
		}System.out.println("\t\tChecking seat for how many people?\tor\tEnter zero to go back ");
	int n=in.nextInt();
	int a[]=new int[n+1];
	int bb[]=new int[n+1];
	if(n==0)
	{ Dangal();
	}
	
		m:for(int i=1;i<=n;i++)
	{ 	l:while(true){
		System.out.println("\t\tEnter seat number("+i+"):");
		int e=in.nextInt();
		int t=e/10;
		a[i]=t;
		t=e%10;
		bb[i]=t;
		if(dr[a[i]][bb[i]]==null)
		{System.out.println("\t\tSeat available");
		if(i==n)
		{break m;
		}
		break l;
		}
		else
		{System.out.println("\t\tThe seat is booked.Try again");
		}
	}
	}
	String mn="\nDangal\t3:30\tAUDI 4\n";
	int u[]=new int[n+1];
	System.out.println("\t\t1.Book tickets\n\t\t2.Back");
	String k=in.next();
	switch(k)
	 {case "1":for(int i=1;i<=n;i++)
				{dr[a[i]][bb[i]]="1";
			String uu=""+a[i]+""+bb[i]+"";
				 u[i]=Integer.parseInt(uu);
				}
				bill(mn,u);
				
	  break ;
	  case "2":Dangal();
	  
	 default: System.out.println("\t\tINVALID OPTION");
	 break;
	 }
		
	}
	
	
	 public static void bill(String mn, int a[]) throws Exception{
		System.out.println("\t\tRECEIPT");
		 DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj=new Date();
		Calendar calobj= Calendar.getInstance();
		System.out.println("Date & Time:"+df.format(calobj.getTime()));
		in.nextLine();
		 String xx=in.nextLine();
		 System.out.println(mn+"");
		 int n=a.length;
		 int b=0;
		 int c=0;
		 int d=0;
		 int x=0;
		 int y=0; 
		 int z=0;
		 String op;
		 String z1[]=new String[n+1];
		 String z2[]=new String[n+1];
		 String z3[]=new String[n+1];
		 for(int i=1;i<n;i++){
			if(10<=a[i]&&a[i]<=19)
			{if(x<1)
				{System.out.print("\n Normal[50] :");
				x++;}
			System.out.print(" "+a[i]);
			op="Normal "+a[i]+"\n";	
			z1[i]=op;
			b=b+50;
			}
			else if(20<=a[i]&&a[i]<=29)
			{if(y<1)
				{System.out.print("\n Silver[100] :");
			y++;}
			System.out.print(" "+a[i]);
			 op="Silver "+a[i]+"\n";	
			z2[i]=op;
			c=c+100;
			}
			else if(30<=a[i]&&a[i]<=39)
			{if(z<1)
				{System.out.print("\n Gold[150] :");
			z++;}
			System.out.print(" "+a[i]);
			 op="Gold "+a[i]+"\n";	
			z3[i]=op;
			d=d+150;
			}
		}
		System.out.println("\ntotal amount="+(b+c+d));
		
		 { 
		  FileOutputStream obj=new FileOutputStream("C:\\java\\bill\\"+xx+".txt");
		  String ca="Date & Time:"+df.format(calobj.getTime());
		 String na="\nName:"+xx;
		 String ba="Total amount:"+(b+c+d);
		 
		 byte a7[]=ca.getBytes();
		 obj.write(a7);
		 byte a1[]=na.getBytes();
		 obj.write(a1);
		 byte a2[]=mn.getBytes();
		 obj.write(a2);
		for(int i=1;i<n+1;i++){
			if(z1[i]==null)
			{continue;
			}
			byte a3[]=z1[i].getBytes();
			obj.write(a3);
		}
		 for(int i=1;i<n+1;i++){
			if(z2[i]==null)
			{continue;
			}
			byte a4[]=z2[i].getBytes();
			obj.write(a4);
		}
		for(int i=1;i<n+1;i++){
			if(z3[i]==null)
			{continue;
			}
			byte a5[]=z3[i].getBytes();
			obj.write(a5);
		}
		byte a6[]=ba.getBytes();
		obj.write(a6);
		
		
		 
		 
		 
		 
		 obj.close();
		 }
		 
		   app();
	 }

		

}

	
	



