void setup(){
	size(displayHeight,displayHeight);
	frameRate(30);
}

int i = 0;

void draw(){
	translate(0,0);
	noStroke();
	fill(0,100);
	rect(0,0,width,height);
	float rd =random(0,255);

	float h = hour();
	float m = minute();
	float s = 	second();
	
	translate(width/2,height/2);
	textAlign(CENTER);
	fill(255,rd);
	PFont myFont = createFont("Palace Script MT",90);
	
	float x = (height - 450)/2 * cos(radians(s*6-90));
	float y = (height - 450)/2 * sin(radians(s*6-90));
	
	textFont(myFont);
	text(nf((int)h,2)+"j@ : "+nf((int)m,2)+"2y . "+nf((int)s,2)+"v@74",random(-10,10),-height/3+random(-10,10));
	
	text(nf((int)h,2)+nf((int)m,2)+nf((int)s,2),x,y);
}