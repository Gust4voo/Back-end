package Javaproject1;

import Javaproject1.InterfacciaPlay;
import Javaproject1.ElementiMultimediali;

@SuppressWarnings("unused")
public class MediaPlayer extends ElementiMultimediali implements InterfacciaPlay {

	private int duration;
	private int volume;

	public MediaPlayer(String t, int v, int d) {
		super(t); 
		this.setVolume(v); 
		this.setDuration(d); 

	}

	@Override
	public void volumeUp() {

		if (this.volume < 5) {
			this.volume++;
		} else {
			System.out.println("The volume is at 100%");
		}
	}

	@Override
	public void volumeDown() {

		if (this.volume > 1) {
			this.volume--;
		} else {
			System.out.println("The volume is at 0%");
		}
	}

	@Override
	public void play() {

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
