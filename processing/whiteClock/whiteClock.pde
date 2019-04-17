int[] bgc = {255, 255, 255}; //背景色
int[] mc = {0, 0, 0}; //時計針の色 (R,G,B)
int[] pc = {0, 0, 0}; //時計板の色（R,G,B)
int[] si = {200, 20, 100}; //針の長さ。（秒針,短針,長針）

void setup(){
	size(displayHeight, displayHeight);
	frameRate(30);
	smooth();
}

void draw(){
	float he = height / 2;
	float wi = width / 2;
	translate(0,0);
	noStroke();
	fill(bgc[0], bgc[1], bgc[2], 150);
	rect(0, 0, height, width);

	float s = second();
	float m = minute() + (s / 60.0);
	float h = hour() % 12 + (m / 60.0);
	float[] time = {s, m, h};

	float[] cs = {he + 100, he + 75, he + 50};

	translate(wi, he);
	noFill();

	float p = (height - 100) / 2;
	int stW = 0;
	int fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15;
			fil = 100;
		}else{
			stW = 10;
			fil = 50;
		}
		stroke(pc[0], pc[1], pc[2], fil);
		strokeWeight(stW);
		float x = p * cos(radians(t));
		float y = p * sin(radians(t));
		point(x, y);
	}

	rotate(PI / 4);
	noFill();

	float n = 0.0;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(mc[0], mc[1], mc[2], 45);
		pushMatrix();
		if(j == 2){
			n = 12;
		}else{
			n = 60;
		}
		rotate(radians(time[j] * 360 / n));
		rect(-cs[j] / 2, -cs[j] / 2, cs[j], cs[j]);
		line(-cs[j] / 2, -cs[j] / 2, -si[j], -si[j]);
		popMatrix();
	}
}