package com.ipl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class Question1 {
	
	 public static <K, V extends Comparable<V>> Map<K, V> 
	    sortByValues(final Map<K, V> map) {
	    Comparator<K> valueComparator = 
	             new Comparator<K>() {
	      public int compare(K k1, K k2) {
	        int compare = 
	              map.get(k1).compareTo(map.get(k2));
	        if (compare == 0) 
	          return 1;
	        else 
	          return compare;
	      }
	    };
	 
	    Map<K, V> sortedByValues = 
	      new TreeMap<K, V>(valueComparator);
	    sortedByValues.putAll(map);
	    return sortedByValues;
	  }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException  {
		TreeMap<String,Integer> j = new TreeMap<String,Integer>(Collections.reverseOrder());
		TreeMap<String,Integer> j1 = new TreeMap<String,Integer>(Collections.reverseOrder());
		ArrayList<String> a1 = new ArrayList<String>();

		String filename ="matches.csv";
		int c=0;
		int c1=0;
		int c2 =0;
		File file = new File(filename);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			String data=scanner.nextLine();
			String [] h =data.split(",");
			if(h[1].equals("2016") && h[7].equals("field")  )
			{
				a1.add(h[6]);
				if (!j.containsKey(h[6])) {
	                j.put(h[6], 1);
	            } else {
	                j.put(h[6], (Integer) j.get(h[6]) + 1);
	            }
				c++;
			}
		
			else if(h[1].equals("2017") && h[7].equals("field"))
					{
				   
			     	if (!j1.containsKey(h[6])) {
	                  j1.put(h[6], 1);
			     	} else {
	                j1.put(h[6], (Integer) j1.get(h[6]) + 1);
	            }
				c1++;
	
					}
			
		}
		Map sortedMap = sortByValues(j);
		Map sortedMap1 = sortByValues(j1);
	
		  Set<Entry<String, Integer>> entrySet = sortedMap.entrySet();
		  Set<Entry<String, Integer>> entrySet1 = sortedMap1.entrySet();

		  ArrayList<Entry<String, Integer>> listOfEntry = new ArrayList<Entry<String,Integer>>(entrySet);
		  ArrayList<Entry<String, Integer>> listOfEntry1 = new ArrayList<Entry<String,Integer>>(entrySet1);

         
          Collections.reverse(listOfEntry);
          Collections.reverse(listOfEntry1);
          System.out.println("Year -    Teams       -  Count  ");
          for (Entry<String, Integer> entry : listOfEntry.subList(0, 4)) 
          {
              System.out.println("2016 - "+entry.getKey()+" - "+entry.getValue());
          }
          for (Entry<String, Integer> entry : listOfEntry1.subList(0, 4)) 
          {
              System.out.println("2017 - "+entry.getKey()+"    - "+entry.getValue());
          }
}
}