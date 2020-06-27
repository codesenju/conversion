pipeline {
  agent {
    docker {
      image 'docker:dind'
      args '-v /var/run/docker.sock:/var/run/docker.sock --privileged'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh '''ls
docker info
docker build -t codesenju/conversion:${BUILD_NUMBER} .
docker tag codesenju/conversion:${BUILD_NUMBER} codesenju/conversion:latest
docker images'''
      }
    }

  }
}
