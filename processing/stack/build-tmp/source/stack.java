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
    translate(0,0);
    noStroke();
    fill(0,0,0,20);
    rect(0,0,width,height);
    float r = height / 2;
    
    float x = r * cos(radians(i));
    float y = r * sin(radians(i));
    float xx = r * cos(radians(i+180));
    float yy = r * sin(radians(i+180));
    
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
    
    float x1 = r * cos(radians(i));
    float y1 = r * sin(radians(i));

    float x1r = r * cos(radians(i+180));
    float y1r = r * sin(radians(i+180));

    float x2 = (r - 100) * cos(radians(i+90));
    float y2 = (r - 100) * sin(radians(i+90));

    float x2r = (r - 100) * cos(radians(i+270));
    float y2r = (r - 100) * sin(radians(i+270));

    float x3 = (r - 150) * cos(radians(i+20));
    float y3 = (r - 150) * sin(radians(i+20));

    float x3r = (r - 150) * cos(radians(i+200));
    float y3r = (r - 150) * sin(radians(i+200));

    float x4 = (r - 200) * cos(radians(i+110));
    float y4 = (r - 200) * sin(radians(i+110));

    float x4r = (r - 200) * cos(radians(i+290));
    float y4r = (r - 200) * sin(radians(i+290));

    float x5 = (r - 250) * cos(radians(i+40));
    float y5 = (r - 250) * sin(radians(i+40));

    float x5r = (r - 250) * cos(radians(i+220));
    float y5r = (r - 250) * sin(radians(i+220));

    float x6 = (r - 300) * cos(radians(i+130));
    float y6 = (r - 300) * sin(radians(i+130));

    float x6r = (r - 300) * cos(radians(i+310));
    float y6r = (r - 300) * sin(radians(i+310));

    translate(width/2,height/2);
    
    stroke(20,255,95);
    point(x1, y1);
    point(x1r,y1r);

    stroke(255,212,20);
    point(x2,y2);
    point(x2r,y2r);

    stroke(20,255,212);
    point(x3,y3);
    point(x3r,y3r);

    stroke(255,95,20);
    point(x4,y4);
    point(x4r,y4r);

    stroke(212,20,255);
    point(x5,y5);
    point(x5r,y5r);

    stroke(181,255,20);
    point(x6,y6);
    point(x6r,y6r);

    stroke(255);
    strokeWeight(10);
    point(x,y);
    point(xx,yy);
    point(xm1,ym1);
    point(xm2,ym2);
    ellipse(random(-10,10),random(0,10),r-70,r-70);
    stroke(0,255,255);
    point(notx1,noty1);
    point(notx2,noty2);
    point(notmx1,notmy1);
    point(notmx2,notmy2);
    i += 2;
    println(i);
    if(i >= 360){
        i = 0;
    }
}
  public void settings() {  size(displayHeight, displayHeight);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "stack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
