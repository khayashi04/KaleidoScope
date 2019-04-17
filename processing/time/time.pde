float[] rad = new float[3];
float[] radNow = new float[4];
void setup(){
	size(900,900);
	frameRate(30);
}

int n = 0;
int n1 = 0;

void draw(){
	background(0);

	translate(width / 2, height / 2);
	noFill();
	for(int i = 0; i < 3; i++){
		rad[i] = width - ((i * 100) + 50) / 2
	}

  	for(int t = 0; t < 360; t += 6){
	    stroke(255,100);
		strokeWeight(10);
		int[] time = {int((hour % 12) * 30 - 90), int(minute() * 6.0 - 90),
			int(second() * 6.0 - 90), t};    
	    for(int j = 0; j < 4; j++){
	    	radNow[i] = radians(time[j]);
	    }
	    for(int k = 0; k < 6; k++){
	    	x[k] = time[k] * radNow[n];
	    	if(n == 3){
	    		n = 3;
	    	}
	    }
	    float[] x = {}
	}
}