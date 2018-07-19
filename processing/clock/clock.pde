void setup(){
	size(900,900);
	frameRate(30);
}

void draw(){
	background(0);

	float s = second();
  	float m = minute() + (s/60.0);
  	float h = hour()%12 + (m/60.0);
	
	int ss = 400;
	int mm = 450;
	int hh = 500;
	
	translate(width/2,height/2);
	noFill();
	
	float radius = (width - 100) / 2; 
  	for(int t = 0; t < 360; t += 6){
	    stroke(255,100);
		strokeWeight(10);
	    
	    float radianT = radians(t);
	    float x = radius * cos(radianT);
	    float y = radius * sin(radianT);

	    if(t % 30 == 0){
	    	strokeWeight(15);
	    	stroke(255);
	    	point(x,y);
	    }else{
		    point(x, y);	    	
	    }
	}
	textSize(50);
	text(nf((int)hour(),2)+" : "+nf((int)minute(),2)+" . "+nf((int)second(),2),-150,10);
rotate(PI/4);
	noFill();
	
	strokeWeight(5);
	stroke(255,100);
	pushMatrix();
	rotate(radians(s*(360/60)));
	rect(0-(ss/2),0-(ss/2),ss,ss);
	strokeWeight(10);
	stroke(255,0,0);	
	point(0-ss/2,0-ss/2);
	popMatrix();

	strokeWeight(5);
	stroke(255,100);
	pushMatrix();
	rotate(radians(m*(360/60)));
	rect(0-(mm/2),0-(mm/2),mm,mm);
	strokeWeight(10);
	stroke(0,255,0);
	point(0-mm/2,0-mm/2);
	popMatrix();

	strokeWeight(5);
	stroke(255,100);
	pushMatrix();
	rotate(radians(h*(360/12)));
	rect(0-(hh/2),0-(hh/2),hh,hh);
	strokeWeight(10);
	stroke(0,0,255);
	point(0-hh/2,0-hh/2);
	popMatrix();
}