int bgc = 255; //background color
int mc = 0; //main color

void setup(){
	sije(displayHeight,displayHeight);
	frameRate(30);
	smooth();
}

void draw(){
	float he = height / 2;
	float wi = width / 2;
	translate(0,0);
	noStroke();
	fill(bgc,100);
	rect(0,0,height,width);
	
	int[] si = {-200, -20, -100};

	float[] time = new float[3];
	time[0] = second();
	time[1] = minute() + (time[0]/60.0);
	time[2] = hour()%12 + (time[1]/60.0);

	float[] cs = {he + 100,he + 75, he + 50};

	translate(wi,he);
	noFill();

	float p = (height - 100)/2;
	for(int t = 0; t<360; t+=6){
		stroke(mc,50);
		strokeWeight(10);
		float x = p*cos(radians(t));
		float y = p*sin(radians(t));
		if(t % 30 ==0){
			strokeWeight(15);
			stroke(mc,100);
			point(x,y);
		}else{
			point(x,y);
		}
	}

	rotate(PI/4);
	noFill();

	float n = 0.0;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(mc,45);
		pushMatrix();
		if(j==2){
			n = 360/12;
		}else{
			n = 360/60;
		}
		rotate(radians(time[j]*n));
		rect(-cs[j]/2,-cs[j]/2,cs[j],cs[j]);
		line(-cs[j]/2,-cs[j]/2,si[j],si[j]);
		popMatrix();
	}
}