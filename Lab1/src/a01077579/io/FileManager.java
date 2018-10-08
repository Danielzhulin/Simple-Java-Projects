/**
 * Project: Lab1
 * File: FileManager.java
 * Date: Sep 17, 2018
 * Time: 8:55:25 AM
 */
package a01077579.io;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public interface FileManager {

	/**
	 * Save a file.
	 * 
	 * @param path
	 *            - the directory to save to
	 * @param fileName
	 *            - the name of the file being saved
	 */
	void save(String path, String fileName);

	/**
	 * Delete a file.
	 * 
	 * @param path
	 *            - the directory where the file is located
	 * @param fileName
	 *            - the name of the file to be deleted
	 */

	void delete(String path, String fileName);
}
