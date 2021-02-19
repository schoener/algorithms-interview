pipeline {
    agent any
    stages {
        stage ('Initialize') {
            steps {
                
            }
        }

        stage ('Build') {
            steps {   
                sh 'mvn -Dmaven.test.failure.ignore=true clean install' 
            }
        }
    }
}
