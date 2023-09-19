int[] backGroundColor = {0, 0, 0}; //背景色
int[] clockColor = {255, 255, 255}; //時計の色（R,G,B)

void setup(){
	//fullScreen(); //全画面表示
	size(500,500); //300未満描画困
	frameRate(60); 
	smooth(); 
}

void draw(){
	translate(0, 0);
	noStroke();
	fill(backGroundColor[0], backGroundColor[1], backGroundColor[2], 120);
	rect(0, 0, width, height);

	translate(width / 2, height / 2);
	noFill();
	float s = second();
	float m = minute() + (s / 60.0);
	float h = hour() % 12 + (m / 60.0);
	float[] time = {s, m, h};

	float[] clockSize = {height + (height / 3.5), height + (height / 4.7), height + (height / 7)};
	int[] clockHandsSize = {height / 5, height / 40, height / 10}; 

	float clockHandsLength = (height - 20) / 4;
	for(int t = 0; t < 360; t += 30){
		stroke(clockColor[0], clockColor[1], clockColor[2], 50);
		strokeWeight(15);
		float[] xy = {clockHandsLength * cos(radians(t)), clockHandsLength * sin(radians(t))};
		point(xy[0], xy[1]);
	}
	
	rotate(PI / 4);
	float n = 0.0;
	for(int i = 0; i < 3; i++){
		strokeWeight(3);
		stroke(clockColor[0], clockColor[1], clockColor[2], 40 + 40 * i);
		pushMatrix();
		if(i == 2){
			n = 12.0;
		}else{
			n = 60.0;
		}
		rotate(radians(time[i] * 360 / n));
		line(-clockSize[i] / 4, -clockSize[i] / 4, -clockHandsSize[i], -clockHandsSize[i]);
		popMatrix();
	}
}