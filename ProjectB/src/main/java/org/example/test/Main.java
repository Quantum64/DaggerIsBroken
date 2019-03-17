package org.example.test;

public class Main {
	ProblematicComponent component = DaggerProblematicComponent.create();
	MyObject myObject = component.getMyObject();
}