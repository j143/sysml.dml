/*
 * generated by Xtext 2.9.0
 */
package sysml.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class DmlIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new DmlStandaloneSetupIdea().createInjector
	}

}
