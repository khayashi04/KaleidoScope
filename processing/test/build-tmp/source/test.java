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

public class test extends PApplet {



int r = height*2;

public void setup(){
  
  background(0);
  stroke(255);
}

public void draw(){
  //background(0);

  translate(width/2,height/2);
  rotateY(frameCount * 0.03f);
  rotateX(frameCount * 0.04f);

  float s = 0;
  float t = 0;
  float lx = 0;
  float ly = 0;
  float lz = 0;

  while(t < 180){
    s += 18;
    t += 1;
    float rs = radians(s);
    float rt = radians(t);

    float tx = 0 + (r * cos(rs) * sin(rt));
    float ty = 0 + (r * sin(rs) * sin(rt));
    float tz = 0 + (r * cos(rt));

    if(lx != 0){
      line(tx,ty,tz,lx,ly,lz);
    }
    if(t < 180){
      background(0);
    }
    lx = tx;
    ly = ty;
    lz = tz;
  }
}
  public void settings() {  size(displayWidth,displayHeight,OPENGL); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
