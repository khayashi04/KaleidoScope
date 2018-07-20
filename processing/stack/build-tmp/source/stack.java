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

public void setup(){
    
    frameRate(60);
}

int i = 0;
public void draw(){
    fill(0);
    translate(0,0);
    fill(0,5);
    rect(0,0,width,height);
    fill(255);
    float r = width / 2 -50;
    float x = r * cos(radians(i));;
    float y = r * sin(radians(i));;
    float xx = r * cos(radians(-i));
    float yy = r * sin(radians(-i));

    translate(width/2,height/2);
    stroke(255);
    strokeWeight(10);
    point(x,y);
    point(xx,yy);
    strokeWeight(0);
    //ellipse(0,0,r*2,r*2);
    i += 1;
    println(i);
    if(i >= 360){
        i = 0;
    }
}
  public void settings() {  size(700,700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "stack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
