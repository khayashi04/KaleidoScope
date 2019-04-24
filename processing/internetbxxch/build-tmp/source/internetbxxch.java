import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import ddf.minim.spi.*; 
import ddf.minim.signals.*; 
import ddf.minim.*; 
import ddf.minim.analysis.*; 
import ddf.minim.ugens.*; 
import ddf.minim.effects.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class internetbxxch extends PApplet {









AudioPlayer player;
Minim mi;

String[] music = {"05.ノーザンクロス.mp3"};
String str = "music/";
int i = 0;

public void setup(){
	
	mi = new Minim(this);
}
public void draw(){
	background(0);
	if(key == 'c'){
		player = mi.loadFile(music[0]);
		if(player.isPlaying() == false){
			player.play();
		}
		text("play " + music[0], width / 2, height / 2);
	}

	if(key == 'x'){
		player.pause();
		text("pause", width / 2, height / 2);
	}
	if(keyPressed == true && key == 'v'){
		i += 1;
		player = mi.loadFile(music[i]);
		player.play();
		text("play " + music[i], width / 2, height / 2);
	}



}


  public void settings() { 	size(400,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "internetbxxch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
