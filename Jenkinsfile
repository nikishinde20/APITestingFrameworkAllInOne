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
    
    post {
    always {
        emailext (
            subject: "Build Status: ${currentBuild.currentResult}",
            body: "Build completed. Please check Jenkins for details.",
            to: "nikishinde20@gmail.com"
        )
    }
}
}