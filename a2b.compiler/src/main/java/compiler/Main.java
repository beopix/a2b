package compiler;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		System.out.println("Starting a2b application");

		try {
			A2BArguments.check(args[0], args[1]);

			A2bCompiler a2bCompiler = new A2bCompiler(args[0]);

			A2bFileCreator a2bFileCreator = new A2bFileCreator(a2bCompiler, args[1]);

			a2bFileCreator.createFile();

		} catch (FileAlreadyExistsException | FileNotFoundException	 e) {
			e.printStackTrace();
		}


		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double executionTime = (double) totalTime / 1_000_000_000.0;
		DecimalFormat double2Places = new DecimalFormat("#.##");

		System.out.println("Finished a2b application in " + double2Places.format(executionTime) + " seconds");

	}

}
