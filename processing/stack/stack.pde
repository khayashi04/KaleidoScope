import processing.opengl.*;
void setup(){
    size(500,500,OPENGL);
    noFill();
    stroke(255);
    background(0);
}
int i = 0;

void draw(){
    if(i>=100){
        background(0);
        i = 0;
    }
    translate(width/2,height/2);
    rotateY(radians(i));
    rotateX(radians(i));
    box(200,200,200);
    i+=1;
}