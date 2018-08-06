void setup(){
  size(displayWidth,displayHeight);
  frameRate(30);
  smooth();
}

void draw(){
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
