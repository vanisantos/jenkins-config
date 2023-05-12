pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "echo building project"
                bat "mvn clean package"
            }
        }
        stage('Test') {
            steps {
                bat "echo testing project"
                bat 'mvn test'
            }
        }
    }
}
