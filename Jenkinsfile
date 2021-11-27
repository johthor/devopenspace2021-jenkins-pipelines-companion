pipeline {
    agent {
        docker {
            image 'maven:3.8.4-jdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn package'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
