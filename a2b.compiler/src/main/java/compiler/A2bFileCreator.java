package compiler;

import java.io.File;
import java.io.FileOutputStream;

public class A2bFileCreator {

	private String fileName;
	private A2bCompiler a2bCompiler;

	public A2bFileCreator(A2bCompiler a2bCompiler, String fileName) {
		this.a2bCompiler = a2bCompiler;
		this.fileName = fileName;
	}


	public void createFile(){

		byte[] data = a2bCompiler.compile();
		
		if(a2bCompiler.isPcap()) {
			A2bPcapFile.generatePcapFile(fileName, data);
		}else {
			File file = new File(fileName);

			try (FileOutputStream fos = new FileOutputStream(file, true)){			
				fos.write(data, 0, data.length);
				fos.flush();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
