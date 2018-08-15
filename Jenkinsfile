pipeline {
	
   agent any 
	
    stages {
	  
        stage('build') {
	    agent { docker { image 'maven:3.3.3' } }  	
		
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh 'mvn clean install -Dmaven.test.skip=true '
            }
        }
        
        stage('Make Container') {
	      steps {
			    sh "docker build -t springboot-jdbc:${env.BUILD_ID} ."
			    sh "docker tag springboot-jdbc:${env.BUILD_ID} springboot-jdbc:latest"
	      }
    	}
    }
     
    
}
