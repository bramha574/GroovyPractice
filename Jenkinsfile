pipeline {
    agent {
        node {
            label 'master'
            }
        }
stages {
    parellel(
    stage('Node Details') {
        steps {
            println "${NODE_NAME}"
        }
    }


    stage("Test") {
        steps {
            println "${NODE_NAME}"
    }
}
        )
}
}
