pipeline {
  environment {
    registry = "codesenju/conversion"
    registryCredential = 'DockerHub'
    dockerImage = ''
  }
  agent {
    docker {
      image 'docker:dind'
      args '-v /var/run/docker.sock:/var/run/docker.sock'
    }

  }
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/codesenju/conversion.git'
      }
    }
    stage('Building image') {
      steps{
        sh 'docker image prune --all'
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
        sh 'docker images'
      }
    }

    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
            dockerImage.push("latest")
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh 'docker images'
        sh "docker rmi $registry:$BUILD_NUMBER"
        sh 'docker images'
      }
    }
  }
}
