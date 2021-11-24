pipeline {
    agent { docker { image 'maven:3.8.4-jdk-11' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
