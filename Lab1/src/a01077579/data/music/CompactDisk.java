/**
 * Project: Lab1
 * File: CompactDisk.java
 * Date: Sep 17, 2018
 * Time: 9:08:01 AM
 */
package a01077579.data.music;

import a01077579.data.MusicMedia;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public class CompactDisk extends MusicMedia {
	private int numberOfTracks;

	/**
	 * 
	 */
	public CompactDisk() {
		super();
	}

	public CompactDisk(String title, String artist, int numberOfTracks) {
		super(title, artist);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks
	 *            the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	/*
	 * (non-Javadoc)
	 * @see a01077579.data.MusicMedia#play()
	 */
	/**
	 * 
	 */
	@Override
	public void play() {
		System.out.println("Playing " + this.getTitle() + " CD...");

	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompactDisk [numberOfTracks=" + numberOfTracks + ", toStrings()=" + super.toString() + "]";
	}

}
