import processing.opengl.*;

int r = height*2;

void setup(){
  size(displayWidth,displayHeight,OPENGL);
  background(0);
  stroke(255);
}

void draw(){
  background(0);

  translate(width/2,height/2);
  rotateY(frameCount * 0.03);
  rotateX(frameCount * 0.04);

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
    lx = tx;
    ly = ty;
    lz = tz;
  }
}
