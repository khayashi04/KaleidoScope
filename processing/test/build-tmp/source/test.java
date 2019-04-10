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
  
  frameRate(30);
  
}

public void draw(){
  translate(0,0);
  noStroke();
  fill(0,100);
  rect(0,0,width,height);
  
  stroke(255,20);
  strokeWeight(0);
  line(width/2,0,width/2,height);
  line(0,height/2,width,height/2);
  line(0,0,width,height);
  line(0,height,width,0);
}
  public void settings() {  size(displayHeight,displayHeight);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
