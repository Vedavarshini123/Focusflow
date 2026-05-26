pipeline {

    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Vedavarshini123/Focusflow.git'
            }
        }

        stage('Build Application') {
            steps {
                bat 'mvnw.cmd clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t focusflow-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8085:8085 focusflow-app'
            }
        }
    }
}