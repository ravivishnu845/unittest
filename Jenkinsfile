pipeline {
  agent any

  stages {
    stage('Compile') {
       steps {
	        sh "mvn compile"
       }
    }

    stage('Build') {
	     steps {
          sh "mvn package"
	     }
    }

    stage('Install') {
	     steps {
          sh 'mvn install'
	     }
    }

    stage('Archieve') {
        steps {
           archiveArtifacts 'target/*.jar'
        }
    }

    stage('FingerPrint') {
        steps {
           fingerprint 'target/*.jar'
        }
    }

    stage('HTML_Publish') {
	     steps {
	         junit 'target/surefire-reports/TEST-*.xml'
        }
    }

    stage('Copy_to_devmachine') {
        steps {
           sh 'scp target/*.jar ubuntu@172.31.47.62:/home/ubuntu'
        }
    }

    stage('Deploy') {
        steps {
           sh 'java -jar /home/ubuntu/*.jar'
        }
    }

  }

}
