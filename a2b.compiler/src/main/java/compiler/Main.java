package compiler;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		//long programmStart is for time tracking
		long programStart = System.nanoTime();
		System.out.println("Starting a2b application");
		
		/*
		 * a2b-Compiler starts here
		 */
		try {
			A2BArguments.check(args[0], args[1]);

			A2bCompiler a2bCompiler = new A2bCompiler(args[0]);

			A2bFileCreator a2bFileCreator = new A2bFileCreator(a2bCompiler, args[1]);

			a2bFileCreator.createFile();

		} catch (FileAlreadyExistsException | FileNotFoundException | A2BParseErrorException e) {

			e.printStackTrace();

		} finally {
			//calculation of tracked time and prints it out
			long programEnd   = System.nanoTime();
			long programExecutionTime = programEnd - programStart;
			double programLifeTime = (double) programExecutionTime / 1_000_000_000.0;
			DecimalFormat double2Places = new DecimalFormat("#.##");
			System.out.println("Finished a2b application in " + double2Places.format(programLifeTime) + " seconds");

		}

	}

}
