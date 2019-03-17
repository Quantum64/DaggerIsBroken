package org.example.test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * The source for this component generates correctly
 * since it references factories only in this project
 */
@Singleton
@Component
public interface NonIssueComponent {
	public MyObject getMyObject();
}
