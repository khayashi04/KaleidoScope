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

	float h = hour();
	float m = minute();
	float s = 	second();
	
	translate(width/2,height/2);
	textAlign(CENTER);
	fill(255,rd);
	PFont myFont = createFont("Palace Script MT",90);
	
	float x = (height - 450)/2 * cos(radians(s*6-90));
	float y = (height - 450)/2 * sin(radians(s*6-90));
	
	textFont(myFont);
	text(nf((int)h,2)+"j@ : "+nf((int)m,2)+"2y . "+nf((int)s,2)+"v@74",random(-10,10),-height/3+random(-10,10));
	
	text(nf((int)h,2)+nf((int)m,2)+nf((int)s,2),x,y);
}
  public void settings() { 	size(displayHeight,displayHeight); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "clock2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
