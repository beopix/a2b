package decoder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IncludeToByteArray {

	private IncludeToByteArray() {

	}

	public static byte[] decode(String filePath) {

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
