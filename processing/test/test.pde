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

  float s = second();
  float m = minute() + (s/60.0);
  float h = hour()%12 + (m/60.0);
  //float s = 0;
  //float m = 0;
  //float h = 12;
  
  float r = height / 2 + 50;
  
  translate(width/2,height/2);
  String[] time = {"1","2","3","4","5","6","7","8","9","10","11","12"};
  int i = 0;
  stroke(255,50);
  float r2 = (height - 100) / 2; 
  for(int t=0; t<360;t+=30){
    PFont myFont = createFont("Palace Script MT",70);
    textFont(myFont);
    textAlign(CENTER);
    fill(255,random(0,255));
    float x = r2 * cos(radians(t-60));
    float y = r2 * sin(radians(t-60));
    text(time[i],x+random(-1,1),y+random(-1,1));
    i++;
  }
  noFill();
  strokeWeight(2);
  ellipse(random(-2,2),random(-2,2),height/40,height/40);

  float xs = r2 * cos(radians(s*6-90));
  float ys = r2 * sin(radians(s*6-90));

  float xm = r2 * cos(radians(m*6-90));
  float ym = r2 * sin(radians(m*6-90));

  float xh = r2 * cos(radians(h*12-90));
  float yh = r2 * sin(radians(h*12-90));

  line(xs,ys,0,0);
}