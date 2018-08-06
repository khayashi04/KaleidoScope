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
  fill(0);
  rect(0,0,width,height);
  float rand1 = random(-20,20);
  float rand2 = random(-20,20);

  stroke(random(255),random(255),random(255));
  translate(width/2,height/2);
  ellipse(rand1,rand2,width/2,height/2);
  stroke(random(255),random(255),random(255));
  ellipse(rand1,rand2,height/2,height/2);
  noStroke();
  fill(random(255),random(255),random(255));
  ellipse(rand1,rand2,height/15,height/15);
}
  public void settings() {  size(displayWidth,displayHeight);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
