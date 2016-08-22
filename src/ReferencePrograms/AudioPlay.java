package ReferencePrograms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class AudioPlay extends JFrame implements ActionListener{
	 static AudioInputStream audio;
     static Clip clip;
      
      JButton start = new JButton("start");
	    JButton stop = new JButton("stop");
	    
	    public AudioPlay(){
	    	String audioPath = System.getProperty("user.dir");
	    	try{
	        audio = AudioSystem.getAudioInputStream(new File(audioPath+"\\braincandy.wav"));
	        clip = AudioSystem.getClip();
	    	}catch(Exception e){
	    		
	    	}
	      setLayout(new GridLayout(1,2));
	      add(start);
	      add(stop);
	      start.addActionListener(this);
	      stop.addActionListener(this);
	    }
	    
	public static void main(String[] args) {
	    AudioPlay frame = new AudioPlay();
	    frame.setSize(300,300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==start){
		    try {
		        audio= AudioSystem.getAudioInputStream(new File("C:\\zbc\\user\\eclipse\\ET0706\\chpt9Exmp\\src\\ReferencePrograms\\braincandy.wav"));
		        clip = AudioSystem.getClip();
		        clip.open(audio);
		        clip.start();
		        clip.loop(5);
		        start.setEnabled(false);
		    }
		    
		    catch(UnsupportedAudioFileException uae) {
		        System.out.println(uae);
		    }
		    catch(IOException ioe) {
		        System.out.println(ioe);
		    }
		    catch(LineUnavailableException lua) {
		        System.out.println(lua);
		    }
	    }else if(e.getSource()==stop){
	    	audio=null;
	    	if(clip==null) System.out.println("clip is null");
	    	if(clip!=null) System.out.println("clip status:\n is running? " +clip.isRunning()+"\n is open? " +clip.isActive()+
	    	"\n is running? " +clip.isActive());
	    	if(clip!=null){
	    		clip.flush();
	    		clip.close();
	    		clip.stop();
	    		clip=null;
	    		start.setEnabled(true);
	    	}
    	
	    }
	}
}
