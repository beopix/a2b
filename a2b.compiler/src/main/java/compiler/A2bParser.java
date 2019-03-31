package compiler;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import a2b.A2BStandaloneSetup;
import a2b.a2B.Model;


/*
 * class for parsing the language file to a model/abstract syntax tree
 */
public class A2bParser {
	
	Injector injector;
	XtextResourceSet resourceSet;
	Resource resource;

	
	public A2bParser(){
		initializeParser();
	}
	
	private void initializeParser(){
		injector = new A2BStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_ENCODING, "UTF-8");
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	public Model parse(String uriPath){
		resource = resourceSet.getResource(URI.createFileURI(uriPath), true);
		Model model = (Model) resource.getContents().get(0);
		return model;
	}
}