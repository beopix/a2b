package compiler;

import java.util.List;

import org.eclipse.xtext.validation.Issue;

/**
 * This exception class treats the parse and syntax errors from the language file.
 * 
 * @author rampix
 *
 */
public class A2BParseErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6311825955154703770L;
	
	public A2BParseErrorException() {
		
	}
	
	public A2BParseErrorException(String message) {
		super(message);
	}
	
	public A2BParseErrorException(List<Issue> validatorIssueList) {
		
		for(Issue issue: validatorIssueList) {
			System.out.println("In line " + issue.getLineNumber() + " syntax error: " + issue.getMessage());
		}
		
	}

}
