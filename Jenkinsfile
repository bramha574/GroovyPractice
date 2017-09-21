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


    stage("Release Inputs") {
        steps {
            script {
            env.userInput = input message: 'Was this successful?', parameters: [
        [$class: 'SimpleTextProvider', defaultValue: 'Demo', description: '', name: 'Please confirm you agree with this']
        ]
            echo ("Confirmation : " + env.userInput)

            env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
                        parameters: [choice(name: 'RELEASE_SCOPE', choices: '1\n2\n3', description: 'What is the release scope?')]

            echo "${env.RELEASE_SCOPE}"
        }
    }
}
}
}
