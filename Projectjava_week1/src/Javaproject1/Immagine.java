package Javaproject1;

import Javaproject1.Luminosità;
import Javaproject1.ElementiMultimediali;

@SuppressWarnings("unused")
public class Immagine extends ElementiMultimediali implements Luminosità {

	private int Luminosità;

	public Immagine(String t, int b) { 
		super(t);
		this.setLuminosità(b);

	}

	public void show() {
		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getLuminosità(); i++) {
			title = title.concat("*");
		}
		System.out.println(title);
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
	public int getLuminosità() {
		return Luminosità;
	}

	@Override
	public void setLuminosità(int bgt) {
		this.Luminosità = bgt;
	}

}

