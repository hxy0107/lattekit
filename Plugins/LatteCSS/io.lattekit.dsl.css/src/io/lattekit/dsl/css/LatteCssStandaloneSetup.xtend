/*
 * generated by Xtext 2.9.0
 */
package io.lattekit.dsl.css


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LatteCssStandaloneSetup extends LatteCssStandaloneSetupGenerated {

	def static void doSetup() {
		new LatteCssStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
