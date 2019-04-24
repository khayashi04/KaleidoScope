void setup(){
	fullScreen();
	background(0);
	smooth();
}

int t, i = 0;
void draw(){
	translate(width / 2, height / 2);
	plotTimePoint(255, height);

}

void plotTimePoint(int cc, float h){
	float p = (h - 20) / 2;
	int stW, fil, t = 0;
	while(true){
		if(t % 30 == 0){
			stW = 15; fil = 150;
		}else{
			stW = 15; fil = 150;
		}
		if(t > 360){
			break;
		}else{
			t += 6;
		}
		stroke(cc, fil);
		strokeWeight(stW);
		float[] xy = {p * cos(radians(t)), p * sin(radians(t))};
		point(xy[0], xy[1]);
	}
}