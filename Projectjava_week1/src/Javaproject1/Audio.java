package Javaproject1;

import Javaproject1.MediaPlayer;

@SuppressWarnings("unused")
public class Audio extends MediaPlayer {

	public Audio(String t, int v, int d) {
		super(t, v, d); 
	}

	public void play() {

		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
		}
	}

}