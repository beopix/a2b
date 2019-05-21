package compiler;

import java.io.File;
import java.io.FileOutputStream;

/**
 * This class generates the output file of the language file content. If the language file includes the PCAP keyword it than 
 * generates a pcap file with the language file content.
 * 
 * @author rampix
 *
 */

public class A2bFileCreator {
	
	private String fileName;
	private A2bCompiler a2bCompiler;

	/**
	 * Constructor to allocate the A2bCompiler and the filename.
	 * 
	 * @param a2bCompiler
	 * @param fileName
	 */
	public A2bFileCreator(A2bCompiler a2bCompiler, String fileName) {
		this.a2bCompiler = a2bCompiler;
		this.fileName = fileName;
	}


	/**
	 * 
	 * This method is for creating the output binary file. It uses the A2bCompiler to get the content as a byte array an writes it through
	 * a file output stream to the file with the filename and the extension from fileName.
	 * 
	 */
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
				e.printStackTrace();
			} 
		}
	}
}
