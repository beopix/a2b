/*
 * generated by Xtext 2.17.0
 */
package a2b.ui.tests;

import a2b.dsl.ui.internal.DslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class A2BUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("a2b.A2B");
	}

}
