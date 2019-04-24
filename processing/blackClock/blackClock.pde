int[] clr = {255, 0};

void setup(){
	fullScreen();
	//size(900, 900);
	frameRate(30); 
	smooth(8); 
}

void draw(){
	int h = height;
	float[] time = {second(), minute(), hour()};
	float[] cs = {h + (h / 3.5), h + (h / 4.7), h + (h / 7)};
	float[] si = {h / 5, h / 40, h / 10}; 
	
	translate(0, 0);
	noStroke();
	if(time[2] >= 18 || time[2] < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	rect(0, 0, width, h);
	translate(width / 2, h / 2);
	noFill();
	plotTimePonint(clr[1], h);

	rotate(PI / 4);
	float n = 0.0;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(clr[1], 40 + 40 * j);
		pushMatrix();
		if(j == 2){
			n = 12.0;
		}else{
			n = 60.0;
		}
		rotate(radians(time[j] * 360 / n));
		rect(-cs[j] / 4, -cs[j] / 4, cs[j] / 2, cs[j] / 2);
		line(-cs[j] / 4, -cs[j] / 4, -si[j], -si[j]);
		popMatrix();
	}
}

void plotTimePonint(int stroke, int h){
	float p = (h - 20) / 2;
	int stW, fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15; fil = 150;
		}else{
			stW = 10; fil = 50;
		}
		stroke(stroke, fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
}