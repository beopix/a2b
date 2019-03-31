package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class A2bFileCreator {

	private String fileName;
	private A2bCompiler a2bCompiler;

	public A2bFileCreator(A2bCompiler a2bCompiler, String fileName) {
		this.a2bCompiler = a2bCompiler;
		this.fileName = fileName;
	}


	public void createFile() throws FileAlreadyExistsException{
		
		byte[] data = a2bCompiler.compile();

		File file = new File(fileName);
		
		
		if(file.exists()) {
			throw new FileAlreadyExistsException("The file you want to generate already exists.");
		}

		try (FileOutputStream fos = new FileOutputStream(file, true)){			
			fos.write(data, 0, data.length);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
