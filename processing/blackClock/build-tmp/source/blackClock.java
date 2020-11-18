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
int[] c;

public void setup(){
	//fullScreen();
	
	rectMode(CENTER);
	frameRate(30); 
	 
}

public void draw(){
	background(0);
	int h = height;
	float t0 = second();
	float t1 = minute() + (t0 / 60.0f);
	float t2 = hour() % 12 + (t1 / 60.0f);
	//float[] time = {0,0,0};
	float[] time = {t0, t1, t2};
	float[] cs = {h + (h / 3.5f), h + (h / 4.7f), h + (h / 7)};
	float[] si = {h / 5, h / 40, h / 10}; 
	
	translate(0, 0);
	noStroke();
	if(hour() >= 18 || hour() < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	//rect(-width / 2, -h / 2, width / 2, h / 2);
	translate(width / 2, h / 2);
	noFill();
	plotTimePonint(clr[1], h);

	rotate(PI / 4);
	float n = 0.0f;
	c = new int[3];
	c[0] = color(0xffA10A89);
	c[1] = color(0xffF0C500);
	c[2] = color(0xff00CAD1);
	for(int i = 0; i < 3; i++){
		strokeWeight(8);
		pushMatrix();
		if(i == 2){
			n = 12.0f;
		}else{
			n = 60.0f;
		}
		rotate(radians(time[i] * 360 / n));
		stroke(c[i]);
		line(0, 0, cs[i] / 4 / (i + 1), cs[i] / 4 / (i + 1));
		popMatrix();
	}

	for(int j = 0; j < 3; j++){
		strokeWeight(8);
		pushMatrix();
		if(j == 2){
			n = 12.0f;
		}else{
			n = 60.0f;
		}
		rotate(radians(time[j] * 360 / n));
		stroke(clr[1]);
		rect(0, 0, cs[j] / 2 / (j + 1), cs[j] / 2 / (j + 1), 3);
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
  public void settings() { 	size(700, 700); 	smooth(8); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "blackClock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
