pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    parameters {
        string(name: 'ENV', defaultValue: 'qa')
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/yourrepo.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat "mvn clean test -Denvironment=${params.ENV}"
            }
        }
    }
}