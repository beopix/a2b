package compiler;


import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import a2b.A2BStandaloneSetup;
import a2b.a2B.Model;


/**
 * This class is for parsing the language file to a model/abstract_syntax_tree.
 * 
 * https://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
 * 
 * @author rampix
 *
 */
public class A2bParser {
	
	Injector injector;
	XtextResourceSet resourceSet;
	Resource resource;
	IResourceValidator resourceValidator;
	List<Issue> validatorIssueList;

	
	public A2bParser(){
		initializeParser();
	}

	private void initializeParser(){
		injector = new A2BStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_ENCODING, "UTF-8");
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		resourceValidator = injector.getInstance(IResourceValidator.class);
	}

	public Model parse(String uriPath) throws A2BParseErrorException{
		
		resource = resourceSet.getResource(URI.createFileURI(uriPath), true);
		validatorIssueList = resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		
		if(resource.getContents().isEmpty()) {
			throw new A2BParseErrorException("The a2b language file has no content or wrong instructions.");
		}
		
		if(validatorIssueList.isEmpty()) {
			Model model = (Model) resource.getContents().get(0);
			return model;
		}else {
			validatorIssueList = resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			throw new A2BParseErrorException(validatorIssueList);
		}

	}

}