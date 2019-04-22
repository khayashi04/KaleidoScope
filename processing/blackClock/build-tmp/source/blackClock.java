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

int[] clc = {40, 80, 120}; //針の濃さ（秒, 分, 時）
int[] clr = {255, 0};

public void setup(){
	 //描画サイズ指定。縦横等しい値必須
	frameRate(30); 
	 
}

public void draw(){
	int he = height;
	float now = 23;
	translate(0, 0);
	noStroke();
	if(now >= 18 || now < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	rect(0, 0, he, he);

	float s = second();
	float m = minute() + (s / 60.0f);
	float h = hour() % 12 + (m / 60.0f);
	float[] time = {s, m, h};

	float[] cs = {(he + (he / 3.5f)) / 2, (he + (he / 4.7f)) / 2, (he + (he / 7)) / 2};
	int[] si = {he / 5, he / 40, he / 10}; 

	translate(he / 2, he / 2);
	noFill();

	float p = (he - 20) / 2;
	int stW, fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15; fil = 150;
	}else{
			stW = 10; fil = 50;
		}
		stroke(clr[1], fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
	rotate(PI / 4);
	
	float n = 0.0f;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(clr[1], clc[j]);
		pushMatrix();
		if(j == 2){
			n = 12.0f;
		}else{
			n = 60.0f;
		}
		rotate(radians(time[j] * 360 / n));
		rect(-cs[j] / 2, -cs[j] / 2, cs[j], cs[j]);
		line(-cs[j] / 2, -cs[j] / 2, -si[j], -si[j]);
		popMatrix();
	}
}
  public void settings() { 	size(displayHeight, displayHeight); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "blackClock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
