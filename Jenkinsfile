pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''ls
docker info
docker build -t codesenju/conversion:${BUILD_NUMBER} .
docker tag codesenju/conversion:${BUILD_NUMBER} katacoda/jenkins-demo:latest
docker images'''
      }
    }

  }
}