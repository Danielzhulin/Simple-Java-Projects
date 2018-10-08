/**
 * Project: Lab1
 * File: AutoFile.java
 * Date: Sep 17, 2018
 * Time: 8:36:35 AM
 */
package a01077579.data.music;

import a01077579.data.MusicMedia;
import a01077579.io.FileManager;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public class AutoFile extends MusicMedia implements FileManager {
	private String fileName;
	private double fileSize;

	/**
	 * 
	 */
	public AutoFile() {
		super();
	}

	public AutoFile(String title, String artist, String fileName, double fileSize) {
		super(title, artist);
		this.fileName = fileName;
		this.fileSize = fileSize;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileSize
	 */
	public double getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize
	 *            the fileSize to set
	 */
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

	/*
	 * (non-Javadoc)
	 * @see a01077579.data.MusicMedia#play()
	 */
	@Override
	public void play() {
		System.out.println("Palying " + "\"" + this.fileName + "\"");

	}

	/*
	 * Saves a file to the hard disk. For now, it needs only to output a message to the console indicating that the audio file is being saved.
	 * (non-Javadoc)
	 * @see a01077579.io.FileManager#save(java.lang.String, java.lang.String)
	 */
	@Override
	public void save(String path, String fileName) {
		System.out.println("Saving " + "\"" + fileName + "\"" + " to " + "\"" + path + "\"" + " folder");

	}

	/*
	 * Deletes a file from the hard disk. For now, it needs only to output a message to the console indicating that the audio file is being deleted.
	 * (non-Javadoc)
	 * @see a01077579.io.FileManager#delete(java.lang.String, java.lang.String)
	 */
	@Override
	public void delete(String path, String fileName) {
		System.out.println("Deleting " + "\"" + fileName + "\"" + " from " + "\"" + path + "\"" + " folder");

	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AutoFile [fileName=" + fileName + ", fileSize=" + fileSize + ", toStrings()=" + super.toString() + "]";
	}

}
