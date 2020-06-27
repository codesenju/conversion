pipeline {
  agent {
    docker {
      image 'docker:dind'
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
