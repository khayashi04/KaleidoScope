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

public class test extends PApplet {

public void setup(){
	
	background(0);
	
}

int t, i = 0;
public void draw(){
	translate(width / 2, height / 2);
	plotTimePoint(255, height);

}

public void plotTimePoint(int cc, float h){
	float p = (h - 20) / 2;
	int stW, fil, t = 0;
	while(true){
		if(t % 30 == 0){
			stW = 15; fil = 150;
		}else{
			stW = 15; fil = 150;
		}
		if(t > 360){
			break;
		}else{
			t += 6;
		}
		stroke(cc, fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
}
  public void settings() { 	fullScreen(); 	smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
