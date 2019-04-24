import ddf.minim.*;
import ddf.minim.spi.*;
import ddf.minim.signals.*;
import ddf.minim.*;
import ddf.minim.analysis.*;
import ddf.minim.ugens.*;
import ddf.minim.effects.*;

AudioPlayer player;
Minim mi;

String[] music = {"05.ノーザンクロス.mp3"};
String str = "music/";
int i = 0;

void setup(){
	size(400,200);
	mi = new Minim(this);
}
void draw(){
	background(0);
	if(key == 'c'){
		player = mi.loadFile(music[0]);
		if(player.isPlaying() == false){
			player.play();
		}
		text("play " + music[0], width / 2, height / 2);
	}

	if(key == 'x'){
		player.pause();
		text("pause", width / 2, height / 2);
	}
	if(keyPressed == true && key == 'v'){
		i += 1;
		player = mi.loadFile(music[i]);
		player.play();
		text("play " + music[i], width / 2, height / 2);
	}



}


