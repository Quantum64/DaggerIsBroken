package org.example.test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * The generated source for this component is broken since it
 *  references factories in dependent projects.
 */
@Singleton
@Component
public interface ProblematicComponent {
	public MyObject getMyObject();
}
