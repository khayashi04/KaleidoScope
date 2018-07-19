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

public class time extends PApplet {

public void setup(){
	
	frameRate(30);
}

public void draw(){
	background(0);
	
	float s = second();
	float m = minute();
	float h = hour();

	int r = 400;
	println(h,m,s);

	translate(width/2, height/2);
	noFill();

	strokeWeight(5);
	stroke(255,100);
	pushMatrix();
	rotate(radians(s*(360/60)));
	rect(0-(r/2),0-(r/2),r,r);
	strokeWeight(10);
	stroke(255,0,0);	
	point(0-r/2,0-r/2);
	popMatrix();
}
  public void settings() { 	size(900,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "time" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
