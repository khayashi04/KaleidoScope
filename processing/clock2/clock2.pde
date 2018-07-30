void setup(){
	size(400,150);
	frameRate(30);
}

int i = 0;

void draw(){
	translate(0,0);
	noStroke();
	fill(0,100);
	rect(0,0,width,height);
	float rd =random(0,255);

	translate(width/2,height/2);
	textAlign(CENTER);
	fill(255,rd);
	PFont myFont = createFont("Palace Script MT",90);
	textFont(myFont);
	text(nf((int)hour(),2)+" : "+nf((int)minute(),2)+" . "+nf((int)second(),2),0,0);
	strokeWeight(5);

}