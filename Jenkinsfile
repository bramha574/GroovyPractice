pipeline {
    agent {
      node {
        label 'linux'
        def rootDir = pwd()
        }
      }
stages{
      stage('Node Details') {
          steps {
              println "${NODE_NAME}"
          }
      }

      stage("Release Inputs") {
          steps {
              def thing = load 'DemoRun.groovy'
              thing.call()
              }
          }
      }
}
