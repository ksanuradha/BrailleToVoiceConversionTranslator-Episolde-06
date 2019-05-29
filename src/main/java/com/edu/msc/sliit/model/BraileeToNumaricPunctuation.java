package com.edu.msc.sliit.model;

import java.util.HashMap;

public class BraileeToNumaricPunctuation {	
	public static HashMap<Integer, String> numaricAndPunctuation=new HashMap<Integer, String>();	
	static {
		//Numbers
		numaricAndPunctuation.put(1, "1");
		numaricAndPunctuation.put(3, "2");
		numaricAndPunctuation.put(9, "3");
		numaricAndPunctuation.put(25, "4");
		numaricAndPunctuation.put(17, "5");
		numaricAndPunctuation.put(11, "6");
		numaricAndPunctuation.put(27, "7");		
		numaricAndPunctuation.put(19, "8");
		numaricAndPunctuation.put(10, "9");
		numaricAndPunctuation.put(26, "0");
		//symbals
		numaricAndPunctuation.put(50, ".");
		numaricAndPunctuation.put(2, ",");
		numaricAndPunctuation.put(6, ";");
		numaricAndPunctuation.put(18, ":");		
		numaricAndPunctuation.put(12, "/");
		numaricAndPunctuation.put(38, "?");
		numaricAndPunctuation.put(22, "!");
		numaricAndPunctuation.put(28, "@");
		numaricAndPunctuation.put(60, "#");
		numaricAndPunctuation.put(22, "+");
		numaricAndPunctuation.put(18, "-");
		numaricAndPunctuation.put(20, "*");
		numaricAndPunctuation.put(38, "\"");
		numaricAndPunctuation.put(52, "\"");
		numaricAndPunctuation.put(4, "'");
		numaricAndPunctuation.put(35, "<");
		numaricAndPunctuation.put(28, ">");
		numaricAndPunctuation.put(54, "(");
		numaricAndPunctuation.put(36, "_");
		//numaricAndPunctuation.put(54, ")");
	}
}
