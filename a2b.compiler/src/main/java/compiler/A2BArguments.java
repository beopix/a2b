package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

import org.apache.commons.io.FilenameUtils;

public class A2BArguments {

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
