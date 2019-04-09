package decoder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class is for converting an included file to its byte representation.
 * 
 * @author rampix
 *
 */
public class IncludeToByteArray {

	private IncludeToByteArray() {

	}

	/**
	 * This method converts the included file to a byte array. 
	 * 
	 * @param filePath
	 * @return file as a byte array
	 */
	public static byte[] convert(String filePath) {

		//Muss ueberprueft werden auf welchem System es laeuft
		Path a = Paths.get(filePath);
		System.out.println(a);

		byte[] data = null;

		File file = new File(filePath);

		try {
			data = Files.readAllBytes(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
