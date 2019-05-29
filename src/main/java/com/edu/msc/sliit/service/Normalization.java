package com.edu.msc.sliit.service;

import org.springframework.stereotype.Service;

@Service
public class Normalization {	
	public static String sinhalaNormalization(String text) {
		//System.out.println(text);
		
		text = text.replace("ක*ආ*", "කා*");
		text = text.replace("ක*ඇ*", "කැ*");
		text = text.replace("ක*ඈ*", "කෑ*");
		text = text.replace("ක*ඉ*", "කි*");
		text = text.replace("ක*ඊ*", "කී*");
		text = text.replace("ක*උ*", "කු*");
		text = text.replace("ක*ඌ*", "කූ*");
		text = text.replace("ක*එ*", "කෙ*");
		text = text.replace("ක*ඒ*", "කේ*");
		text = text.replace("ක*ඔ*", "කො*");
		text = text.replace("ක*ඕ*", "කෝ*");
		text = text.replace("ක*ඖ*", "කෞ*");
		text = text.replace("ක*්*", "ක්*");
		
		
		
		//Special Letters 
		
		text = text.replace("16*ර*", "ඍ*");
		text = text.replace("32*ර*", "ඎ*");		
		text = text.replace("16*ල*", "ඏ*");		
		text = text.replace("32*ල*", "ඐ*");
		
		text = text.replace("06*ග*", "ඟ*");
		text = text.replace("06*ඩ*", "ඬ*");
		text = text.replace("06*ද*", "ඳ*");
		text = text.replace("06*බ*", "ඹ*");
		
		
		
		
		String word = text.toString();
		//System.out.println(word);
		//String word="Sasindu";
		return word;
	}
}
