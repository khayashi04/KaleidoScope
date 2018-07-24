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
  public void setup() {


background(0);
float xs = random(10);
float xn = xs;
float yn = random(10);

for(int y = 0; y <= height; y++){
	yn += 0.01f;
	xn = xs;
	for(int x = 0; x<= width; x++){
		xn += 0.01f;
	int alph = PApplet.parseInt(noise(xn,yn) * 255);
		stroke(255,alph);
		line(x,y,x+1,y+1);
	}
}
    noLoop();
  }

  public void settings() { size(displayWidth,displayHeight); 
smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
