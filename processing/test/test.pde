void setup(){
	fullScreen();
	background(0);
	smooth();
}

int t, i = 0;
void draw(){
	
	translate(width / 2, height / 2);
	float p = height / 2;
	while(true){
		stroke(255);
		strokeWeight(10);
		point(p * cos(radians(t)), p * sin(radians(t)));
		if(t > 360){
			break;
		}else{
			t += 6;
		}
		delay(10);
	}
	print("finished");

}