
    pipeline {
        agent {
            node {
                label 'linux'
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
                println "Printing Test "
            }
        }
        stage('Deploy') {
            steps {
                println "Printing Deploy"
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
