pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "echo building project"
                bat "mvn clean package"
                bat 'echo build completed.'
            }
        }
    }
    post {
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts '/target/*.jar'
        }
    }

}
