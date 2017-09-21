pipeline {
    agent {
      node {
        label 'linux'
        def rootDir = pwd()
        def thing = load 'DemoRun.groovy'
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
              thing.call()
              }
          }
      }
}
