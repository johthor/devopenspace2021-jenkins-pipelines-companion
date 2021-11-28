pipeline {
    agent {
        docker {
            image 'maven:3.8.4-jdk-11'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
    environmen {
        CI_SERVER = 'Jenkins'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'mvn -B checkstyle:checkstyle spotbugs:spotbugs pmd:pmd pmd:cpd'
                mineRepository()
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -B -Dmaven.test.failure.ignore=true verify'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            recordIssues(tools: [checkStyle(), pmdParser(), cpd(), spotBugs(useRankAsPriority: true)])
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/jacoco', reportFiles: 'index.html', reportName: 'JaCoCo HTML Report', reportTitles: ''])
        }
        cleanup {
            deleteDir()
        }
    }
}
