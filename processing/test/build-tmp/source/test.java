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

float time = 0;
public void setup(){
  
  background(0);
  stroke(255);
  strokeWeight(5);
}

public void draw(){
  background(0);
  float x = 0;
  while(x < width){
    point(x,height*noise(x/100,time));
    x += 1;
  }
  time += 0.02f;
}
  public void settings() {  size(displayWidth,displayHeight); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
