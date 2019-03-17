package org.example.test;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyObject {
	protected @Inject DependencyB depB;
	protected @Inject DependencyA depA;

	protected @Inject MyObject() {}

	public static class DependencyA {
		protected @Inject DependencyA() {}
	}

	public static class DependencyB {
		protected @Inject DependencyB() {}
	}
}
