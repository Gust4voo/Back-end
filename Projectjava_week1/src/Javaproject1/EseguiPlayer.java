package Javaproject1;

import java.util.Scanner;

public class EseguiPlayer {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ElementiMultimediali[] arrayMedia = new ElementiMultimediali[5];
		for (int i = 0; i < arrayMedia.length; i++) {
			int temp;

			do {
				System.out.println(
						"File " + (i + 1) + " - Do you want to create a picture file, an audio file or a video file?");
				System.out.println("Picture: 1 | Audio: 2 | Video: 3");
				temp = scanner.nextInt();
				scanner.nextLine();

				if (temp > 0 && temp < 4) {

					System.out.println("What title should it have?");
					String tempTitle = scanner.nextLine();
					int tempB;
					int tempVol;
					int tempDur;

					switch (temp) {

					case 1: {
						System.out.println("Set the Brightness");
						tempB = scanner.nextInt();
						arrayMedia[i] = new Immagine(tempTitle, tempB);
						break;
					}
					case 2: {
						System.out.println("Set the Volume level");
						tempVol = scanner.nextInt();
						System.out.println("Set the duration");
						tempDur = scanner.nextInt();
						arrayMedia[i] = new Audio(tempTitle, tempVol, tempDur);
						break;
					}
					case 3: {
						System.out.println("Set the Brightness");
						tempB = scanner.nextInt();
						System.out.println("Set the Volume level");
						tempVol = scanner.nextInt();
						System.out.println("Set the duration");
						tempDur = scanner.nextInt();
						arrayMedia[i] = new Video(tempTitle, tempVol, tempDur, tempB);
						break;
					}
					default: {
						System.out.println("Wrong Value, try again");
						break;
					}
					}
				} else {
					System.out.println("Wrong Value, try again!");
				}
			} while (temp <= 0 || temp > 3);
		}

		int input;
		do {
			System.out.println("Select the file you want to play (insert a value from 1 to 5 or 0 to exit");
			input = scanner.nextInt();

			switch (input) {
			case 0: {
				System.out.println("Player Off, goodbye");
				break;
			}
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: {
				if (arrayMedia[input - 1] instanceof Immagine) {
					((Immagine) arrayMedia[input - 1]).show();
				} else if (arrayMedia[input - 1] instanceof Audio) {
					((Audio) arrayMedia[input - 1]).play();
				} else if (arrayMedia[input - 1] instanceof Video) {
					((Video) arrayMedia[input - 1]).play();
				}
				break;
			}
			default:
				System.out.println("Wrong Value, try again!");
				break;
			}
		} while (input != 0);
	}
}
