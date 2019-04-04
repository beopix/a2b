package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

import org.apache.commons.io.FilenameUtils;

/**
 * This class checks the command arguments, which the users enters.
 * 
 * @author rampix
 *
 */
public class A2BArguments {

	/**
	 * This method checks if the a2b language file exists and if has the extension a2b.
	 * Further it also checks if the file the user want to generate already exists.
	 * 
	 * @param languageFile
	 * @param destinationFile
	 * @return true if the check is successful
	 * @throws FileAlreadyExistsException
	 * @throws FileNotFoundException
	 */
	public static boolean check(final String languageFile, final String destinationFile) throws FileAlreadyExistsException, FileNotFoundException {
		String languageFileExtension = FilenameUtils.getExtension(languageFile);
		File lanFile = new File(languageFile);
		File desFile = new File(destinationFile);

		if(!lanFile.exists() || !(languageFileExtension.equals("a2b"))) {
			throw new FileNotFoundException("The file " + lanFile.getName() + " doesn't exist or isn't an a2b file.");
		}

		if(desFile.exists()) {
			throw new FileAlreadyExistsException("The file " + destinationFile +" you want to generate already exists.");
		}

		return true;
	}

}
