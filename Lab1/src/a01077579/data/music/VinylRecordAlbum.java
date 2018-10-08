/**
 * Project: Lab1
 * File: VinylRecordAlbum.java
 * Date: Sep 17, 2018
 * Time: 9:17:06 AM
 */
package a01077579.data.music;

import a01077579.data.MusicMedia;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public class VinylRecordAlbum extends MusicMedia {
	private static final int STANDARD_WEIGHT = 150;
	private int numberOfTracks;
	private int weight;

	/**
	 * 
	 */
	public VinylRecordAlbum() {
		// TODO Auto-generated constructor stub
	}

	public VinylRecordAlbum(String title, String artist, int numberOfTracks, int weight) {
		super(title, artist);
		this.numberOfTracks = numberOfTracks;
		this.weight = weight;
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

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		if (weight >= STANDARD_WEIGHT) {
			this.weight = weight;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see a01077579.data.MusicMedia#play()
	 */
	@Override
	public void play() {
		System.out.println("Now playing " + this.toString() + "...");
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VinylRecordAlbum [numberOfTracks=" + numberOfTracks + ", weight=" + weight + ",toStrings()=" + super.toString() + "]";
	}

}
