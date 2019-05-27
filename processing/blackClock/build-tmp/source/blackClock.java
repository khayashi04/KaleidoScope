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

public class blackClock extends PApplet {

int[] clr = {255, 0};

public void setup(){
	//fullScreen();
	
	frameRate(30); 
	 
}

public void draw(){
	int h = height;
	float[] time = {second(), minute(), hour()};
	float[] cs = {h + (h / 3.5f), h + (h / 4.7f), h + (h / 7)};
	float[] si = {h / 5, h / 40, h / 10}; 
	
	translate(0, 0);
	noStroke();
	if(time[2] >= 18 || time[2] < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	rect(0, 0, width, h);
	translate(width / 2, h / 2);
	noFill();
	plotTimePonint(clr[1], h);

	rotate(PI / 4);
	float n = 0.0f;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(clr[1], 40 + 40 * j);
		pushMatrix();
		if(j == 2){
			n = 12.0f;
		}else{
			n = 60.0f;
		}
		rotate(radians(time[j] * 360 / n));
		rect(-cs[j] / 4, -cs[j] / 4, cs[j] / 2, cs[j] / 2);
		line(-cs[j] / 4, -cs[j] / 4, -si[j], -si[j]);
		popMatrix();
	}
}

public void plotTimePonint(int stroke, int h){
	float p = (h - 20) / 2;
	int stW, fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15; fil = 150;
		}else{
			stW = 10; fil = 50;
		}
		stroke(stroke, fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
}
  public void settings() { 	size(400, 400); 	smooth(8); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "blackClock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
