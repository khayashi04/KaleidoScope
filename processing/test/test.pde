float time = 0;
void setup(){
  size(displayWidth,displayHeight);
  background(0);
  stroke(255);
  strokeWeight(5);
}

void draw(){
  background(0);
  float x = 0;
  while(x < width){
    point(x,height*noise(x/100,time));
    x += 1;
  }
  time += 0.02;
}