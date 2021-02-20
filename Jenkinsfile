pipeline {
    agent any
    stages {
        stage ('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'multibranch_ssh_id', url: 'https://github.com/schoener/algorithms-interview.git'            }
        }

        stage ('Build') {
            steps {   
                sh 'mvn -Dmaven.test.failure.ignore=true clean install' 
            }
        }
    }
}
