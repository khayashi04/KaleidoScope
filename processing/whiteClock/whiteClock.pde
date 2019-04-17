int bgc = 255; //background color
int mc = 0; //main color


void setup(){
	size(displayHeight,displayHeight);
	frameRate(30);
	smooth();
}

void draw(){
	translate(0,0);
	noStroke();
	fill(bgc,100);
	rect(0,0,width,height);
	
	int[] size = {-200, -20, -100};

	float[] time = new float[3];
	time[0] = second();
	time[1] = minute() + (time[0]/60.0);
	time[2] = hour()%12 + (time[1]/60.0);

	float[] cs = new float[3];
	for(int i = 1; i<4; i++){
		cs[i-1] = height/2 + int((100/i));
	}

	translate(width/2,height/2);
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

	float pax = 0.0;
	for(int z = 0; z < 3; z++){
		strokeWeight(3);
		stroke(mc,45);
		pushMatrix();
		if(z==2){
			pax = 360/12;
		}else{
			pax = 360/60;
		};
		rotate(radians(time[z]*pax));
		rect(-cs[z]/2,-cs[z]/2,cs[z],cs[z]);
		line(-cs[z]/2,-cs[z]/2,size[z],size[z]);
		popMatrix();
	}
}