/**
 * Project: Lab1
 * File: MusicMedia.java
 * Date: Sep 17, 2018
 * Time: 8:11:31 AM
 */
package a01077579.data;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public abstract class MusicMedia {
	private String title;
	private String artist;

	public MusicMedia() {

	}

	/**
	 * @param title
	 * @param artist
	 */
	public MusicMedia(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * abstract method to be implemented by sub classes. Used to play a music media type.
	 */
	public abstract void play();

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MusicMedia [title=" + title + ", artist=" + artist + "]";
	}

}
