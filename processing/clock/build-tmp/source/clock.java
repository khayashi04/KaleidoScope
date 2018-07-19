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

public class clock extends PApplet {

public void setup(){
	
	frameRate(30);
}

public void draw(){
	background(0);

	float s = second();
  	float m = minute() + (s/60.0f);
  	float h = hour()%12 + (m/60.0f);
	
	int ss = width / 2;
	int mm = width / 2 + 50;
	int hh = width / 2 + 50;
	
	translate(width/2,height/2);
	noFill();
	
	float radius = (width - 100) / 2; 
  	for(int t = 0; t < 360; t += 6){
	    stroke(255,100);
		strokeWeight(10);
	    
	    float radianT = radians(t);
	    float x = radius * cos(radianT);
	    float y = radius * sin(radianT);

	    if(t % 30 == 0){
	    	strokeWeight(15);
	    	stroke(255);
	    	point(x,y);
	    }else{
		    point(x, y);	    	
	    }
	}
	textSize(50);
	text(nf((int)hour(),2)+" : "+nf((int)minute(),2)+" . "+nf((int)second(),2),-150,10);
	rotate(PI/4);
	noFill();
	
	strokeWeight(5);
	stroke(255,50);
	pushMatrix();
	rotate(radians(s*(360/60)));
	rect(0-(ss/2),0-(ss/2),ss,ss);
	stroke(255,0,0,50);
	line(0-ss/2,0-ss/2,0,0);
	popMatrix();

	strokeWeight(5);
	stroke(255,50);
	pushMatrix();
	rotate(radians(m*(360/60)));
	rect(0-(mm/2),0-(mm/2),mm,mm);
	stroke(0,255,0,50);
	line(0-mm/2,0-mm/2,0,0);
	popMatrix();

	strokeWeight(5);
	stroke(255,50);
	pushMatrix();
	rotate(radians(h*(360/12)));
	rect(0-(hh/2),0-(hh/2),hh,hh);
	stroke(0,0,255,50);
	line(0-hh/2,0-hh/2,0,0);
	popMatrix();
}
  public void settings() { 	size(700,700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "clock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
