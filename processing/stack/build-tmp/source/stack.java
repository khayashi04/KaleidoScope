import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

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


public void setup(){
    
    noFill();
    stroke(255);
    background(0);
}
int i = 0;

public void draw(){
    if(i>=100){
        background(0);
        i = 0;
    }
    translate(width/2,height/2);
    rotateY(radians(i));
    rotateX(radians(i));
    box(200,200,200);
    i+=1;
}
  public void settings() {  size(500,500,OPENGL); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "stack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
