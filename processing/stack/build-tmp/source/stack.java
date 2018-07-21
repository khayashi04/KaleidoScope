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
    
}

int i = 0;
public void draw(){
    noStroke();
    translate(0,0);
    fill(0,20);
    rect(0,0,width,height);
    float r = width / 2 -50;
    
    float x1 = r * cos(radians(i));
    float y1 = r * sin(radians(i));
    float x2 = r * cos(radians(i+180));
    float y2 = r * sin(radians(i+180));
    
    float xm1 = (r - 50) * cos(radians(-i - 90));
    float ym1 = (r - 50) * sin(radians(-i - 90));
    float xm2 = (r - 50) * cos(radians(-i + 90));
    float ym2 = (r - 50) * sin(radians(-i + 90));

    float notx1 = r * cos(radians(i));
    float noty1 = r * sin(radians(i+70));
    float notx2 = r * cos(radians(i+180));
    float noty2 = r * sin(radians(i+250));

    float notmx1 = r * cos(radians(i+180));
    float notmy1 = r * sin(radians(i+70));
    float notmx2 = r * cos(radians(i));
    float notmy2 = r * sin(radians(i+250));

    translate(width/2,height/2);
    stroke(255);
    strokeWeight(10);
    point(x1,y1);
    point(x2,y2);
    point(xm1,ym1);
    point(xm2,ym2);
    ellipse(random(-10,10),random(0,10),r-70,r-70);
    stroke(0,255,255);
    point(notx1,noty1);
    point(notx2,noty2);
    point(notmx1,notmy1);
    point(notmx2,notmy2);
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
