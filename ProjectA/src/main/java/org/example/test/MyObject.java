package org.example.test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyObject {
	protected @Inject DependencyB depB;
	protected @Inject DependencyA depA;

	protected @Inject MyObject() {}
}
