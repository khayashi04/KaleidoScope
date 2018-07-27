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

public class whatTimeIsItNow extends PApplet {

public void setup(){
	
	frameRate(30);
	
}

public void draw(){
	translate(0,0);
	noStroke();
	fill(0,100);
	rect(0,0,width,height);

	float s = second();
  	float m = minute() + (s/60.0f);
  	float h = hour()%12 + (m/60.0f);
	
	float r = height / 2 + 50;
	
	translate(width/2,height/2);
	noFill();
	
	float r2 = (height - 100) / 2; 
    stroke(255,50);
	strokeWeight(1);
	ellipse(0+random(-2,2),0+random(-2,2),r2*2,r2*2);
	strokeWeight(2);
	ellipse(0+random(-2,2),0+random(-2,2),height/40,height/40);

	rotate(PI/4);
	
	strokeWeight(3);
	stroke(255);
	pushMatrix();
	rotate(radians(s*(360/60)));
	line(-r/2+random(-2,2),-r/2+random(-2,2),-150+random(-2,2),-150+random(-2,2));
	popMatrix();

	strokeWeight(4);
	stroke(255);
	pushMatrix();
	rotate(radians(m*(360/60)));
	line(-r/2+random(-2,2),-r/2+random(-2,2),-20+random(-2,2),-20+random(-2,2));
	popMatrix();

	strokeWeight(5);
	stroke(255);
	pushMatrix();
	rotate(radians(h*(360/12)));
	line(-r/2+random(-2,2),-r/2+random(-2,2),-100+random(-2,2),-100+random(-2,2));
	popMatrix();
}
  public void settings() { 	size(displayHeight,displayHeight); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "whatTimeIsItNow" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
