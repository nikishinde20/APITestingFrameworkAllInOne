pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    parameters {
        string(name: 'ENV', defaultValue: 'qa')
    }

    stages {

        

        stage('Build & Test') {
            steps {
                bat "mvn clean test -Denvironment=${params.ENV}"
            }
        }
    }
}