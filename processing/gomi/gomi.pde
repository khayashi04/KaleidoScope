void setup(){
  size(displayWidth,displayHeight);
  frameRate(30);
  smooth();
}

int i = 0;
void draw(){
  translate(0,0);
  noStroke();
  fill(0);
  rect(0,0,width,height);
  float rand1 = random(-20,20);
  float rand2 = random(-20,20);

  stroke(random(255),random(255),random(255));
  strokeWeight(5);
  translate(width/2,height/2);
  ellipse(rand1,rand2,width/2,height/2);
  stroke(random(255),random(255),random(255));
  ellipse(rand1,rand2,height/2,height/2);
  strokeWeight(10);
  
  float r = height/2;
  /*float x1, y1 = 0;
  for(int j = 0; j<12; j++){
    x1 = (r+ j*50) * cos(radians(i));
    y1 = (r+ j*50) * sin(radians(i));
    stroke(20,255,95);
    point(x1, y1);
  }*/
  
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
  i+=2;
  noStroke();
  fill(random(255),random(255),random(255));
  ellipse(rand1,rand2,height/15,height/15);
}
