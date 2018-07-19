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

public class stack extends PApplet {

PVector pos;
PVector soku;
public void setup(){
  
  background(0);
  frameRate(30);
  pos = new PVector(0,0);
  soku = new PVector(300.0f/60,300/60);
}

public void draw(){
  pos.add(soku);
  if((pos.x > width) || (pos.y > height)){
    soku.x = soku.x * -1;
    soku.y = soku.y * -1;
  }
  stroke(255,100);
  noStroke();
  fill(0);
  rect(0,0,width,height);
  stroke(255);

  strokeWeight(50);
  point(pos.x,pos.y);

}
  public void settings() {  size(900,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "stack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
