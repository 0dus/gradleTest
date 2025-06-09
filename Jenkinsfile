pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps{
                git url:'https://github.com/0dus/gradleTest', branch:'main'
            }
        }
        stage('Build'){
            steps{
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }
        stage('Test'){
            steps{
                sh './gradlew test'
            }
        }
    }

    post{
        always{
            junit '**/build/test-results/**/*.xml'
        }
        success{
            echo 'Build and Test Successful!'
        }
        failure{
            echo 'Build or Test Failed.'
        }
    }
}