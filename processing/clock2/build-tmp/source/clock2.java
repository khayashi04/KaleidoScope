import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class clock2 extends PApplet {

public void setup(){
	
	frameRate(30);
}

int i = 0;

public void draw(){
	translate(0,0);
	noStroke();
	fill(0,100);
	rect(0,0,width,height);
	float rd =random(0,255);

	translate(width/2,height/2);
	textAlign(CENTER);
	fill(255,rd);
	PFont myFont = createFont("Palace Script MT",90);
	textFont(myFont);
	text(nf((int)hour(),2)+" : "+nf((int)minute(),2)+" . "+nf((int)second(),2),0,0);
	strokeWeight(5);

}
  public void settings() { 	size(400,150); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "clock2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
