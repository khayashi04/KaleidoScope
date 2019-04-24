int[] bgc = {255, 255, 255}; //背景色
int[] mc = {0, 0, 0}; //時計針の色 (R,G,B)
int[] poc = {0, 0, 0}; //時計板の色（R,G,B)

void setup(){
	fullScreen(); //全画面表示
	//size(300,300); //300未満描画困
	frameRate(30); 
	smooth(); 
}

void draw(){
	int he = height; 
	translate(0, 0);
	noStroke();
	fill(bgc[0], bgc[1], bgc[2], 120);
	rect(0, 0, width, he);

	translate(width / 2, he / 2);
	noFill();
	float s = second();
	float m = minute() + (s / 60.0);
	float h = hour() % 12 + (m / 60.0);
	float[] time = {s, m, h};

	float[] cs = {he + (he / 3.5), he + (he / 4.7), he + (he / 7)};
	int[] si = {he / 5, he / 40, he / 10}; 

	float p = (he - 20) / 2;
	int stW, fil = 0;
	for(int t = 0; t < 360; t += 6){
		if(t % 30 == 0){
			stW = 15; fil = 150;
		}else{
			stW = 10; fil = 50;
		}
		stroke(poc[0], poc[1], poc[2], fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
	
	rotate(PI / 4);
	float n = 0.0;
	for(int j = 0; j < 3; j++){
		strokeWeight(3);
		stroke(mc[0], mc[1], mc[2], 40 + 40 * j);
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