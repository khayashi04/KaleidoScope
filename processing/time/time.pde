void setup(){
	size(900,900);
	frameRate(30);
}

void draw(){
	background(0);
	
	float s = second();
	float m = minute();
	float h = hour();

	int r = 400;

	translate(width/2, height/2);
	noFill();

	strokeWeight(5);
	stroke(255,100);
	pushMatrix();
	rotate(radians(s*(360/60)));
	rect(0-(r/2),0-(r/2),r,r);
	strokeWeight(10);
	stroke(255,0,0);	
	point(0-r/2,0-r/2);
	popMatrix();
}
