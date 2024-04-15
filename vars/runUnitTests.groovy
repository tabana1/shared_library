#!/usr/bin/env groovy
def call() {
	echo "Running Unit Test..."
	sh 'chmod 744 gradlew'
	sh './gradlew clean test'	
}

