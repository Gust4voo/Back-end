package Javaproject1;



import Javaproject1.Luminosità;
import Javaproject1.MediaPlayer;

@SuppressWarnings("unused")
public class Video extends MediaPlayer implements Luminosità {

	private int Luminosità;

	public Video(String t, int v, int d, int b) {
		super(t, v, d); 
		this.setLuminosità(b);
	}

	@Override
	public int getLuminosità() {
		return Luminosità;
	}

	@Override
	public void setLuminosità(int b) {
		this.Luminosità = b;
	}

	@Override
	public void LuminositàUp() {

		this.Luminosità++;

	}

	@Override
	public void LuminositàDown() {

		this.Luminosità--;
	}

	@Override
	public void play() {

		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		title = title.concat(" ");
		for (int i = 0; i < this.getLuminosità(); i++) {
			title = title.concat("*");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
		}
	}

}
