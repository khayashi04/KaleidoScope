void setup(){
  size(displayHeight,displayHeight);
  frameRate(30);
  smooth();
}

void draw(){
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