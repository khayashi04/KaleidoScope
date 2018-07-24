size(displayWidth,displayHeight);
smooth();
background(0);
float xs = random(10);
float xn = xs;
float yn = random(10);

for(int y = 0; y <= height; y++){
	yn += 0.01;
	xn = xs;
	for(int x = 0; x<= width; x++){
		xn += 0.01;
	int alph = int(noise(xn,yn) * 255);
		stroke(255,alph);
		line(x,y,x+1,y+1);
	}
}
