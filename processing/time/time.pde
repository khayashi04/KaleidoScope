void setup(){
	size(900,900);
	frameRate(30);
}

int i = 0;

void draw(){
	background(0);

	float s = second();
	float m = minute();
	float h = hour()%12;

	translate(width/2, height/2);
	noFill();

	float radius = (width - 50) / 2; 
	float radius2 = (width - 150) / 2;
	float radius3 = (width - 250) / 2;
  	for(int t = 0; t < 360; t += 6){
	    stroke(255,100);
		strokeWeight(10);
	    
	    float radianT = radians(t);
	    float radianS = radians((int)s* 6.0 - 90);
	    float radianM = radians((int)m* 6.0 - 90);
	    float radianH = radians((int)h * 30.0 - 90);

	    float nowSX = radius3 * cos(radianS);
	    float nowSY = radius3 * sin(radianS);

	    float nowMX = radius2 * cos(radianM);
	    float nowMY = radius2 * sin(radianM);

	    float nowHX = radius * cos(radianH);
	    float nowHY = radius * sin(radianH);
	    
	    float x = radius * cos(radianT);
	    float y = radius * sin(radianT);
	    
	    float xx = radius2 * cos(radianT);
	    float yy = radius2 * sin(radianT);
	    
	    float xxx = radius3 * cos(radianT);
	    float yyy = radius3 * sin(radianT);

	   	stroke(255,0,0);
	   	point(nowSX,nowSY);
	   	stroke(0,255,0);
	   	point(nowMX,nowMY);
	   	stroke(255,100);
	   	point(xxx,yyy);
	    point(xx,yy);
	    if(t % 30 == 0){
	    	strokeWeight(15);
	    	stroke(0,0,255);
	    	point(nowHX,nowHY);
	    	stroke(255,100);
	    	point(x,y);
	    }
	}
	textSize(50);
	text(nf((int)hour(),2)+" : "+nf((int)minute(),2)+" . "+nf((int)second(),2),-150,15);
}