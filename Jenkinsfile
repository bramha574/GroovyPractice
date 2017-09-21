pipeline {
    agent {
        node {
            label 'linux'
            def some = ""
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
                env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
                        parameters: [choice(name: 'RELEASE_SCOPE', choices: '1\n2\n3', description: 'What is the release scope?')]


            echo ("Password was: " + userPasswordInput)
            }
            echo "${env.RELEASE_SCOPE}"
        }
    }
}

}//pipeline
