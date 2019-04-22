int[] clr = {255, 0};

void setup(){
	size(displayHeight, displayHeight);
	frameRate(30); 
	smooth(); 
}

void draw(){
	int he = height;
	float now = hour();
	translate(0, 0);
	noStroke();
	if(now >= 18 || now < 6){
		clr[0] = 0; clr[1] = 255;
	}
	fill(clr[0], 120);
	rect(0, 0, he, he);
	translate(he / 2, he / 2);
	noFill();

	float s = second();
	float m = minute() + (s / 60.0);
	float h = hour() % 12 + (m / 60.0);
	float[] time = {s, m, h};

	float[] cs = {(he + (he / 3.5)) / 2, (he + (he / 4.7)) / 2, (he + (he / 7)) / 2};
	int[] si = {he / 5, he / 40, he / 10}; 

	float p = (he - 20) / 2;
	int stW, fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15; fil = 150;
	}else{
			stW = 10; fil = 50;
		}
		stroke(clr[1], fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
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
		rect(-cs[j] / 2, -cs[j] / 2, cs[j], cs[j]);
		line(-cs[j] / 2, -cs[j] / 2, -si[j], -si[j]);
		popMatrix();
	}
}