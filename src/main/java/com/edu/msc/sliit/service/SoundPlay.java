package com.edu.msc.sliit.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import org.springframework.stereotype.Service;
import com.edu.msc.sliit.model.Sound;
import javazoom.jl.player.Player;

@Service
public class SoundPlay {
	String[] words;
	public void sountPlay(String text) {
		String[] words = text.split("\\*");
		Player pp = null;
		for (int i = 0; i < words.length; i++) {
			try {
				System.out.println("Words : "+words[i]+" Paths : "+Sound.sinhalaSounds.get(words[i]));
                File fl = new File(Sound.sinhalaSounds.get(words[i]));
                FileInputStream fs = new FileInputStream(fl);
                BufferedInputStream bis = new BufferedInputStream(fs);
                pp = new Player(bis);
                pp.play();
//                pp.close();
//                fs.close();
            } catch (Exception e) {           	
                System.out.println("No Sound Clip Found : "+words[i]);
            }
		}
	}
	
}
