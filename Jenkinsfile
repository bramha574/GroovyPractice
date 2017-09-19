
    pipeline {
        agent {
            node {
                label 'win-slave'
            }

        }
    stages {
        stage('Node Details') { 
            steps { 
                println "${NODE_NAME}"
            }
        }
        stage('Test'){
            steps {
                println InetAddress.localHost.canonicalHostName
                println "hostname".execute().text
            }
        }
        stage('Deploy') {
            steps {
                println "make publish"
            }
        }
        stage (promotion){
            steps{
            def userInput = input(
            id: 'userInput', message: 'Let\'s promote?', parameters: [
            [$class: 'TextParameterDefinition', defaultValue: 'uat', description: 'Environment', name: 'env'],
            [$class: 'TextParameterDefinition', defaultValue: 'uat1', description: 'Target', name: 'target']
            ])
            echo ("Env: "+userInput['env'])
            echo ("Target: "+userInput['target'])
            }
        }
    }
    
    }//pipeline
