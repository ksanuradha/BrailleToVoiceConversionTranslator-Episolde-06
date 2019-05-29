package com.edu.msc.sliit.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.edu.msc.sliit.model.BraileeToNumaricPunctuation;
import com.edu.msc.sliit.model.BraileeToSinhalaText;

@Service
public class UnicodeMApping {
	
	public static HashMap<Integer, String[]> sinhalaUnicodes=new HashMap<Integer, String[]>();

	public HashMap<Integer, String[]> unicodeStringHashMap(HashMap<Integer, int[]> calculateBanayValuesForEachCordinates) {
		int row=0;
		boolean flag=false;
		HashMap<Integer, int[]> testOne=new HashMap<Integer, int[]>(); 
		int test[]=new int[26];
		test[0]=5;
		test[1]=1;		
		test[2]=5;
		test[3]=28;		
		test[4]=5;
		test[5]=55;		
		test[6]=5;
		test[7]=59;
		test[8]=5;
		test[9]=10;
		test[10]=5;
		test[11]=20;		
		test[12]=60;
		test[13]=3;	
		test[14]=10;
		test[15]=19;		
		test[16]=0;
		test[17]=9;		
		test[18]=13;
		test[19]=30;			
		test[20]=30;
		test[21]=45;		
		test[22]=5;
		test[23]=28;		
		test[24]=17;
		test[25]=17;		
		for (int i = 0; i < calculateBanayValuesForEachCordinates.size(); i++) {			
			testOne.put(i, test);
		}
		Iterator hmIterator = testOne.entrySet().iterator(); // test one should replace with calculateBanayValuesForEachCordinates
		while (hmIterator.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) hmIterator.next();
			 int[] cordinates = ((int[]) mapElement.getValue());
			 String sinRowUnicodes[]=new String[cordinates.length];
			l1: for (int i = 0; i < cordinates.length; i++) {
				 if(cordinates[i]==60) {
					 flag=true;
					 continue l1;
				 }
				 else if(cordinates[i]==48){
					 flag=false;
					 continue l1;
				 }
				 else if(cordinates[i]==0) {
					 flag=false;
				 }
				 
				 if(flag) {
					 sinRowUnicodes[i]=BraileeToNumaricPunctuation.numaricAndPunctuation.get(cordinates[i])+"*";
				 }
				 else {
					 sinRowUnicodes[i]=BraileeToSinhalaText.sinhalaLetters.get(cordinates[i])+"*";
				 }
				
			 }
			 sinhalaUnicodes.put(row, sinRowUnicodes);
			 row++;			
		}
		//printHashMap(sinhalaUnicodes);
		return sinhalaUnicodes;
		// System.out.println(Arrays.toString(cordinates));
	}
	
	public String normalizeHashMap(HashMap<Integer, String[]> unicodeStringHashMap) {
		String word="";
		Iterator hmIterator = unicodeStringHashMap.entrySet().iterator();
		while (hmIterator.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) hmIterator.next();
			 String[] cordinates = ((String[]) mapElement.getValue());
			 for (int i = 0; i < cordinates.length; i++) {				 
				 word=Normalization.sinhalaNormalization(word+cordinates[i]);				  				  
			 }
			 word=word+"\n";					
		}
		return word;
	}
	
   // Test Purpose
	private void printHashMap(HashMap<Integer, String[]> calculateBanayValuesForEachCordinates) {
		Iterator hmIterator = calculateBanayValuesForEachCordinates.entrySet().iterator();
		while (hmIterator.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) hmIterator.next();
			 String[] cordinates = ((String[]) mapElement.getValue());
			 System.out.println(Arrays.toString(cordinates));					
		}		
	}
	// Test Purpose
	private void printHashMap2(HashMap<Integer, int[]> calculateBanayValuesForEachCordinates) {
		Iterator hmIterator = calculateBanayValuesForEachCordinates.entrySet().iterator();
		while (hmIterator.hasNext()) {
			 Map.Entry mapElement = (Map.Entry) hmIterator.next();
			 int[] cordinates = ((int[]) mapElement.getValue());
			 System.out.println(Arrays.toString(cordinates));					
		}		
	}	
}
