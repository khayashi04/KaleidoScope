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
	
	stroke(255,20);
	strokeWeight(0);
	line(width/2,0,width/2,height);
	line(0,height/2,width,height/2);
	line(0,0,width,height);
	line(0,height,width,0);

	float s = second();
  	float m = minute() + (s/60.0);
  	float h = hour()%12 + (m/60.0);
	
	float r = height / 2 + 50;
	
	translate(width/2,height/2);
	noFill();
	
	float r2 = (height - 100) / 2; 
  	for(int t = 0; t < 360; t += 6){
	    stroke(255,50);
		strokeWeight(10);
	    
	    float x = r2 * cos(radians(t));
	    float y = r2 * sin(radians(t));

	    if(t % 30 == 0){
	    	strokeWeight(15);
	    	stroke(255,100);
	    	point(x+//random(-2,2),y+//random(-2,2));
	    }else{
		    point(x+//random(-2,2),y+//random(-2,2));	    	
	    }
	}
	textSize(60);
	fill(255);
	float mr = //random(-2,2);
	if(s % 2==0){
		text(nf((int)hour(),2)+" : "+nf((int)minute(),2),-105+mr,15);
	}
	text(nf((int)hour(),2)+"   "+nf((int)minute(),2),-105+mr,15);
	rotate(PI/4);
	noFill();
	
	strokeWeight(3);
	stroke(255,45);
	pushMatrix();
	rotate(radians(s*(360/60)));
	rect(-r/2+//random(-2,2),-r/2+//random(-2,2),r,r);
	line(-r/2+//random(-2,2),-r/2+//random(-2,2),-150+//random(-2,2),-150+//random(-2,2));
	popMatrix();

	strokeWeight(4);
	stroke(255,45);
	pushMatrix();
	rotate(radians(m*(360/60)));
	rect(-r/2+//random(-2,2),-r/2+//random(-2,2),r,r);
	line(-r/2+//random(-2,2),-r/2+//random(-2,2),-20+//random(-2,2),-20+//random(-2,2));
	popMatrix();

	strokeWeight(5);
	stroke(255,45);
	pushMatrix();
	rotate(radians(h*(360/12)));
	rect(-r/2+//random(-2,2),-r/2+//random(-2,2),r,r);
	line(-r/2+//random(-2,2),-r/2+//random(-2,2),-100+//random(-2,2),-100+//random(-2,2));
	popMatrix();
}