int[] backGroundColor = {0, 0, 0}; //背景色
int[] clockColor = {255, 255, 255}; //時計の色（R,G,B)

//setup
void setup(){
	fullScreen(); //全画面表示
	//size(500,500); //300未満描画困
	frameRate(30); 
	smooth(); 
}

//draw
void draw(){
	//キャンパス初期化
	translate(0, 0);
	noStroke();
	fill(backGroundColor[0], backGroundColor[1], backGroundColor[2], 120);
	rect(0, 0, width, height);
	noFill();

	//座標(0,0)を画面中心に変更
	translate(width / 2, height / 2);
	
	//時計のちょぼちょぼを描画
	drawClockPoints();
	
	//時計の針を描画
	drawClockHands(getTime());
}

//現在時刻を取得しfloat_listで返す
float[] getTime(){
	float[] time = {0,0, 0.0, 0.0};
	time[0] = second();
	time[1] = minute() + (time[0] / 60.0);
	time[2] = hour() % 12 + (time[1] / 60.0);
	return time;
}

//時計のちょぼちょぼを描画する関数
void drawClockPoints(){
	float clockPointsPos = (height - 20) / 4; //時計のサイズを変更した際にちょぼちょぼのサイズを調整する変数
	stroke(clockColor[0], clockColor[1], clockColor[2], 50); //ちょぼちょぼの色

	//6度ごとにちょぼちょぼを描画する
	for(int i = 0; i < 360; i += 6){
		strokeWeight(5); //ちょぼちょぼの太さ
		if(i % 30 == 0){
			strokeWeight(10); //30度ごとのちょぼちょぼは太さを変える
		}
		//ちょぼちょぼを描画する座標
		float x = clockPointsPos * cos(radians(i));
		float y = clockPointsPos * sin(radians(i));
		point(x, y);
	}
}

//時計の針を描画する関数
void drawClockHands(float[] nowTime){ //引数に現在時刻が格納されたリストを与える
	float[] clockHandsPointStr = {height + (height / 3.5), 
		height + (height / 4.7), height + (height / 7)}; //時計の針の始点の座標
	float[] clockHandsPointFin = {height / 5, height / 40, height / 10}; //時計の針の終点の座標
	strokeWeight(3); //針の太さ
	rotate(PI / 4); //pi/4回転させる

	//時計の針を3本描画する
	for(int i = 0; i < 3; i++){
		stroke(clockColor[0], clockColor[1], clockColor[2], 40 + 40 * i); //針の色。針ごとの色濃度だけ変更
		float n = 60.0; //秒針、分針を描画するときに使うやつ
		if(i == 2){
			n = 12.0; //時針を描画するときに使うやつ
		}
		
		pushMatrix(); //座標をプッシュ
		rotate(radians(nowTime[i]) * 360 / n); //針を回転
		line(-clockHandsPointStr[i] / 4, -clockHandsPointStr[i] / 4, 
			-clockHandsPointFin[i], -clockHandsPointFin[i]); //針を描画	
		popMatrix(); //座標をポップ
	}
}