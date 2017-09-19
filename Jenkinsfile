
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
        stage("foo") {
            steps {
                script {
                    env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
                            parameters: [choice(name: 'RELEASE_SCOPE', choices: 'patch\minor\major', description: 'What is the release scope?')]
                }
                echo "${env.RELEASE_SCOPE}"
            }
        }
    }
    
    }//pipeline
