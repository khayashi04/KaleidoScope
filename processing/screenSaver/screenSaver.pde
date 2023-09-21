//setup
void setup(){
    size(1000,1000);
    fullScreen(2);
    frameRate(30);
    smooth();
    background(0);
}

//draw
void draw(){
    //キャンパス初期化
    noStroke(); 
	fill(0);
	rect(0, 0, width, height);
	noFill();

    //色も座標もサイズもランダムな円を1000個描画
    for(int i = 0; i < 5000; i++){
        fill(random(255), random(255), random(255), random(200,255));
        float rand = random(20, 50);
        ellipse(random(0, width), random(0, height), rand, rand);
    }
    delay(1000); //一秒のディレイ
}
    