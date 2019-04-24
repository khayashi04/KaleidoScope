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
	float p = height / 2;
	while(true){
		stroke(255);
		strokeWeight(10);
		point(p * cos(radians(t)), p * sin(radians(t)));
		if(t > 360){
			break;
		}else{
			t += 6;
		}
		delay(10);
	}
	print("finished");

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
