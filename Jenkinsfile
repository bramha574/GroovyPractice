
    pipeline {
        agent {
            node {
                label 'win-slave'
                customWorkspace "C:/Source"
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
    }
    
    }//pipeline
