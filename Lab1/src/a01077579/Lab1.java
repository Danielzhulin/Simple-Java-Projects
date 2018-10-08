/**
 * Project: Lab1
 * File: Lab1.java
 * Date: Sep 17, 2018
 * Time: 8:07:13 AM
 */
package a01077579;

import a01077579.data.music.AutoFile;
import a01077579.data.music.CompactDisk;
import a01077579.data.music.VinylRecordAlbum;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public class Lab1 {

	/**
	 * Test MusicMedia Objects
	 */
	public void test() {
		VinylRecordAlbum vinylRA = new VinylRecordAlbum("Spine Me", "The Spinners", 12, 120);
		System.out.println(vinylRA.toString());
		vinylRA.setWeight(110);
		System.out.println(vinylRA.toString());
		vinylRA.setWeight(180);
		System.out.println(vinylRA.toString());
		vinylRA.play();

		CompactDisk cd = new CompactDisk("Turnabout Intruder", "Kim Kirk", 9);
		System.out.println(cd.toString());
		cd.play();

		AutoFile autoFile = new AutoFile("Buz-Click", "Cyber Punks", "Wish I bought Vinyl.m4a", 3.46);
		System.out.println(autoFile.toString());
		autoFile.save("C:/My Music/iTunes", autoFile.getFileName());
		autoFile.play();
		autoFile.delete("C:/My Music/iTunes", "Wish I Bought Vinyl.m4a");

	}

	/**
	 * @param args
	 *            Not used in this application
	 */
	public static void main(String[] args) {
		Lab1 lab1 = new Lab1();
		lab1.test();
	}

}
