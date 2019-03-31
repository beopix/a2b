package compiler;

import java.nio.file.FileAlreadyExistsException;

public class Main {

	public static void main(String[] args) {
		
		A2bCompiler a2bCompiler = new A2bCompiler(args[0]);
		
		A2bFileCreator a2bFileCreator = new A2bFileCreator(a2bCompiler, args[1]);
		
		try {
			a2bFileCreator.createFile();
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		}
		
	}

}
