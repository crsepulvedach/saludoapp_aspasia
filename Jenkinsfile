pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK11'
    }
    stages {
        stage('Clonar') {
            steps {
                git  branch: 'main', url: 'https://github.com/crsepulvedach/saludoapp_aspasia.git'
            }
        }
        stage('Compilar') {
            steps {
                echo 'echo mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                echo 'echo mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                echo 'echo mvn package'
            }
        }
    }
    post {
        success {
            echo " El build fue exitoso"
        }
        failure {
            echo " El build falló"
        }
    }
}
