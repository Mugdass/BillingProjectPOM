pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK11'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test - Chrome') {
            steps {
                sh "mvn clean test -Dbrowser=chrome"
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/allure-results/**'
                }
            }
        }

        stage('Build & Test - Firefox') {
            steps {
                sh "mvn clean test -Dbrowser=firefox"
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/allure-results/**'
                }
            }
        }

        stage('Allure Report') {
            steps {
                allure([
                    includeProperties: false,
                    jdk: '',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
