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
      string(defaultValue: "DEFAULT", description: 'Product ID?', name: 'productid')
      string(defaultValue: "DEFAULT", description: 'Branch?', name: 'branch')
      string(defaultValue: "DEFAULT", description: 'Year?', name: 'year')
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
