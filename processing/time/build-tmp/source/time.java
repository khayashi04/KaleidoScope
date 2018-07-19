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
	rotate(PI/4);
}

public void draw(){
	background(0);
	
	float s = second();
	float m = minute();
	float h = hour()%12;

	int r = 200;

	translate(width/2, height/2);
	noFill();

	float radius = (width - 50) / 2; 
	float radius2 = (width - 100) / 2;
	float radius3 = (width - 200) / 2;
  	for(int t = 0; t < 360; t += 6){
	    stroke(255,100);
		strokeWeight(10);
	    
	    float radianT = radians(t);
	    float radianS = radians((int)s* 6.0f);
	    float radianM = radians((int)m* 6.0f);
	    float radianH = radians((int)h * 30.0f / (3*PI/2));

	    float nowSX = radius3 * cos(radianS);
	    float nowSY = radius3 * sin(radianS);

	    float nowMX = radius2 * cos(radianM);
	    float nowMY = radius2 * sin(radianM);

	    float nowHX = radius * cos(radianH);
	    float nowHY = radius * sin(radianH);
	    
	    float x =	 radius * cos(radianT);
	    float y = radius * sin(radianT);
	    
	    float xx = radius2 * cos(radianT);
	    float yy = radius2 * sin(radianT);
	    
	    float xxx = radius3 * cos(radianT);
	    float yyy = radius3 * sin(radianT);

	   	stroke(0,255,255);
	   	point(nowSX,nowSY);
	   	point(nowMX,nowMY);
	   	stroke(255,100);
	   	point(xxx,yyy);
	    point(xx,yy);
	    if(t % 30 == 0){
	    	strokeWeight(15);
	    	stroke(0,255,255);
	    	point(nowHX,nowHY);
	    	stroke(255,100);
	    	point(x,y);
	    }
	}
}
  public void settings() { 	size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "time" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
