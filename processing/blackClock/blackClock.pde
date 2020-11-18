int[] clr = {255, 0};
color[] c;

void setup(){
	//fullScreen();
	size(700, 700);
	rectMode(CENTER);
	frameRate(30); 
	smooth(8); 
}

void draw(){
	background(0);
	int h = height;
	float t0 = second();
	float t1 = minute() + (t0 / 60.0);
	float t2 = hour() % 12 + (t1 / 60.0);
	//float[] time = {0,0,0};
	float[] time = {t0, t1, t2};
	float[] cs = {h + (h / 3.5), h + (h / 4.7), h + (h / 7)};
	float[] si = {h / 5, h / 40, h / 10}; 
	
	translate(0, 0);
	noStroke();
	if(hour() >= 18 || hour() < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	//rect(-width / 2, -h / 2, width / 2, h / 2);
	translate(width / 2, h / 2);
	noFill();
	plotTimePonint(clr[1], h);

	rotate(PI / 4);
	float n = 0.0;
	c = new color[3];
	c[0] = color(#A10A89);
	c[1] = color(#F0C500);
	c[2] = color(#00CAD1);
	for(int i = 0; i < 3; i++){
		strokeWeight(8);
		pushMatrix();
		if(i == 2){
			n = 12.0;
		}else{
			n = 60.0;
		}
		rotate(radians(time[i] * 360 / n));
		stroke(c[i]);
		line(0, 0, cs[i] / 4 / (i + 1), cs[i] / 4 / (i + 1));
		popMatrix();
	}

	for(int j = 0; j < 3; j++){
		strokeWeight(8);
		pushMatrix();
		if(j == 2){
			n = 12.0;
		}else{
			n = 60.0;
		}
		rotate(radians(time[j] * 360 / n));
		stroke(clr[1]);
		rect(0, 0, cs[j] / 2 / (j + 1), cs[j] / 2 / (j + 1), 3);
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