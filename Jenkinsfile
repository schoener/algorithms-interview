pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git branch: 'main', credentialsId: '781a5e64-3a8a-46d0-adb5-8216ef6eeea7', url: 'https://github.com/schoener/algorithms-interview.git'
            }
        }

        stage ('Build') {
            steps {   
                sh 'mvn -Dmaven.test.failure.ignore=true clean install' 
            }
        }
    }
}
