/**
 * generated by Xtext 2.9.0
 */
package sysml.web;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import sysml.web.AbstractDmlWebModule;

/**
 * Use this class to register additional components to be used within the web application.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class DmlWebModule extends AbstractDmlWebModule {
  public DmlWebModule(final Provider<ExecutorService> executorServiceProvider) {
    super(executorServiceProvider);
  }
}
