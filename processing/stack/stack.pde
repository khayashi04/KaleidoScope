void setup(){
    size(700,700);
    frameRate(60);
}

int i = 0;
void draw(){
    fill(0);
    translate(0,0);
    fill(0,5);
    rect(0,0,width,height);
    fill(255);
    float r = width / 2 -50;
    float x = r * cos(radians(i));;
    float y = r * sin(radians(i));;
    float xx = r * cos(radians(-i));
    float yy = r * sin(radians(-i));

    translate(width/2,height/2);
    stroke(255);
    strokeWeight(10);
    point(x,y);
    point(xx,yy);
    strokeWeight(0);
    //ellipse(0,0,r*2,r*2);
    i += 1;
    println(i);
    if(i >= 360){
        i = 0;
    }
}