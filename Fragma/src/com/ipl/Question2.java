package com.ipl;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Question2 {
	public static void main(String[] args) throws FileNotFoundException  {
		LinkedHashSet<String> a1 = new LinkedHashSet<String>();
  		String filename ="matches.csv";
  		String filename1 ="deliveries.csv";	
		TreeSet myTreeSet = new TreeSet();

  		File de = new File(filename);
		File file = new File(filename);
		File file1 = new File(filename1);
		File ou = new File(filename);
	
		Set year = new HashSet();
		ArrayList<String> au = new ArrayList<String>();
			au.add("Mumbai Indians");
			au.add("Sunrisers Hyderabad");
			au.add("Gujarat Lions");
			au.add("Rising Pune Supergiant");
			au.add("Royal Challengers Bangalore");
			au.add("Delhi Daredevils");
			au.add("Kings XI Punjab");
			au.add("Kolkata Knight Riders");
			au.add("Deccan Chargers");
			au.add("Chennai Super Kings");
			au.add("Rajasthan Royals");
			au.add("Kochi Tuskers Kerala");
			au.add("Pune Warriors");
		
		
		Scanner scanner3 = new Scanner(de);
		while (scanner3.hasNext()){
			String data=scanner3.nextLine();
			String [] h =data.split(",");
			if(h[0].equals("MATCH_ID")) {
				continue;
			}
			year.add(Integer.parseInt(h[1]));
			}
		myTreeSet.addAll(year);
		ArrayList<Integer> tr = new ArrayList<Integer>(myTreeSet); 
		

		
		int six =0;int four =0;int run =0;
		int six1 =0;int four1 =0;int run1 =0;

		int six2 =0;int four2 =0;int run2 =0;

		int six3 =0;int four3 =0;int run3 =0;
		int six4 =0;int four4 =0;int run4 =0;
		int six5 =0;int four5 =0;int run5 =0;
		int six6 =0;int four6 =0;int run6 =0;
		int six7 =0;int four7 =0;int run7 =0;
		int six8 =0;int four8 =0;int run8 =0;
		int six9 =0;int four9 =0;int run9 =0;
		int six10 =0;int four10 =0;int run10 =0;
		int six11 =0;int four11 =0;int run11 =0;
		int six12 =0;int four12 =0;int run12 =0;

		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			String data=scanner.nextLine();
			String [] h =data.split(",");
			if(h[0].equals("MATCH_ID")) {
				continue;
			}
			a1.add(h[4]);
			}
		System.out.println(a1);
		
		
		
		
		
		Scanner scanner1 = new Scanner(file1);
		
		while(scanner1.hasNext()) {
			String data=scanner1.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
			/*System.out.println("vanthutaen");*/
		     
				/*System.out.println(tr.get(p));*/
              
			
				if(au.get(0).equals(d[2])) {
			           Integer k = Integer.parseInt(d[13]);
						if(k.equals(4)) {
							four++;
						}
						if(k.equals(6)) {
							six++;

						}
						run = run + Integer.parseInt(d[15]);
			
			}
		} 
		System.out.println("    Teams      TotalRuns   TotalFour    TotalSix");
		System.out.println("MumbaiIndians "           +run+ " "      +four+ " "   +six);
		
		
		


		Scanner scanner2 = new Scanner(file1);
		while(scanner2.hasNext()) {
			String data=scanner2.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(1).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four1++;
						}
						if(d[13].equals("6")) {
							six1++;

						}
						run1 = run1 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Sunrisers Hyderabad " +run1+ " " +four1+ " " +six1);

		
		
		
		
		Scanner scanner4 = new Scanner(file1);
		while(scanner4.hasNext()) {
			String data=scanner4.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(2).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four2++;
						}
						if(d[13].equals("6")) {
							six2++;

						}
						run2 = run2 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Gujarat Lions "+run2+ " " +four2+ " " +six2);
		
		
		
		Scanner scanner5 = new Scanner(file1);
		while(scanner5.hasNext()) {
			String data=scanner5.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(3).equals(d[2]) || "Rising Pune Supergiants".equals(d[2])) {
			
						if(d[13].equals("4")) {
							four3++;
						}
						if(d[13].equals("6")) {
							six3++;

						}
						run3 = run3 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Rising Pune Supergiant  "+run3+ " " +four3+ " " +six3);
		
		
		
		Scanner scanner6 = new Scanner(file1);
		while(scanner6.hasNext()) {
			String data=scanner6.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(4).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four4++;
						}
						if(d[13].equals("6")) {
							six4++;

						}
						run4 = run4 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Royal Challengers Bangalore   "+run4+ " " +four4+ " " +six4);
	
		
		
		Scanner scanner7 = new Scanner(file1);
		while(scanner7.hasNext()) {
			String data=scanner7.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(5).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four5++;
						}
						if(d[13].equals("6")) {
							six5++;

						}
						run5 = run5 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Delhi Daredevils   "+run5+ " " +four5+ " " +six5);
		
		
		
		
		
		Scanner scanner8 = new Scanner(file1);
		while(scanner8.hasNext()) {
			String data=scanner8.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(6).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four6++;
						}
						if(d[13].equals("6")) {
							six6++;

						}
						run6 = run6 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Kings XI Punjab   "+run6+ " " +four6+ " " +six6);
		
		
		
		
		
		Scanner scanner9 = new Scanner(file1);
		while(scanner9.hasNext()) {
			String data=scanner9.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(7).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four7++;
						}
						if(d[13].equals("6")) {
							six7++;

						}
						run7 = run7 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Kolkata Knight Riders   "+run7+ " " +four7+ " " +six7);
		
		
		
		
		Scanner scanner10 = new Scanner(file1);
		while(scanner10.hasNext()) {
			String data=scanner10.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(8).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four8++;
						}
						if(d[13].equals("6")) {
							six8++;

						}
						run8 = run8 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Deccan Chargers   "+run8+ " " +four8+ " " +six8);
	
		
		Scanner scanner11 = new Scanner(file1);
		while(scanner11.hasNext()) {
			String data=scanner11.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(9).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four9++;
						}
						if(d[13].equals("6")) {
							six9++;

						}
						run9 = run9 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Chennai Super Kings   "+run9+ " " +four9+ " " +six9);
		
		
		Scanner scanner12 = new Scanner(file1);
		while(scanner12.hasNext()) {
			String data=scanner12.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(10).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four10++;
						}
						if(d[13].equals("6")) {
							six10++;

						}
						run10 = run10 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Rajasthan Royals   "+run10+ " " +four10+ " " +six10);
		
		
		
		Scanner scanner13 = new Scanner(file1);
		while(scanner13.hasNext()) {
			String data=scanner13.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(11).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four11++;
						}
						if(d[13].equals("6")) {
							six11++;

						}
						run11 = run11 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Kochi Tuskers Kerala   "+run11+ " " +four11+ " " +six11);
	
		
		
		Scanner scanner14 = new Scanner(file1);
		while(scanner14.hasNext()) {
			String data=scanner14.nextLine();
			String [] d =data.split(",");
			if(d[0].equals("MATCH_ID")) {
				continue;
			}
				if(au.get(12).equals(d[2])) {
			
						if(d[13].equals("4")) {
							four12++;
						}
						if(d[13].equals("6")) {
							six12++;

						}
						run12 = run12 + Integer.parseInt(d[15]);
			
			}
		}
		System.out.println("Pune Warriors   "+run12+ " " +four12+ " " +six12);
	
		
		
		}
	
}
